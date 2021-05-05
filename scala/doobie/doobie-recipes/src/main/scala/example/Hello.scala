package example

import doobie._

import doobie.implicits._
import doobie.util.Meta
import cats.effect.IO
import scala.concurrent.ExecutionContext
import java.time.Instant
import java.util.Date
import org.joda.time.DateTime
import org.postgis._

case class Coordinates(lat: Double, lon: Double) {
  override def toString = s"SRID=4326;POINT($lat $lon)"
}

case class FoursquareVendor (
  id: String,
  name: Option[String],
  primaryCategory: String,
  primaryCategoryId: String,
  venueRealityScore: Option[String],
  secondaryCategory: Option[String],
  totalCheckins: Option[Int],
  uniqueVisitors: Option[Int]
)

case class FoursquareGym ( 
  placeId: String,
  placeName: String,
  streetAddress: Option[String],
  city: Option[String],
  state: Option[String],
  zipCode: Option[String],
  countryCode: Option[String],
  createdDate: Date,
  coordinates: Coordinates,
  vendor: FoursquareVendor
)



// trait FoursquareVendorImplicits {
//   implicit val foursquareVendorGet: Get[FoursquareVendor] = Get[FoursquareVendor]
//   implicit val foursquareVendorPut: Put[FoursquareVendor] = Put[FoursquareVendor]
// }

// trait FoursquareGymImplicits extends FoursquareVendorImplicits {
//   implicit val foursquareGymGet: Put[FoursquareGym] = Put[JsValue].contramap(Json.toJson(_))
//   implicit val foursquareGymPut: Put[FoursquareGym] = pgWritesPut[FoursquareGym]
// }

trait JodaDateTime {
  def fromInstant(i: Instant): DateTime = DateTime.parse(i.toString)
  def toInstant(d: DateTime): Instant = Instant.parse(d.toString)
  implicit val jodaDateTime: Meta[DateTime] = Meta[Instant].timap(fromInstant)(toInstant)
}

object Hello extends App with JodaDateTime {
   implicit val cs = IO.contextShift(ExecutionContext.global)
   val xa = Transactor.fromDriverManager[IO](
     "org.postgresql.Driver", "jdbc:postgresql://localhost/v4","postgres",""
   )
   val y = xa.yolo
   import y._

   def getGyms() = sql"""
    SELECT 
      gym.place_id, gym.place_name, gym.street_address, gym.city, gym.state, gym.zip_code, gym.country_code, gym.created_date,
      vendor.* 
    FROM foursquare_gym AS gym 
    INNER JOIN foursquare_vendor as vendor 
    ON gym.vendor = vendor.id
  """.query[FoursquareGym]

  def getManualGyms() = sql"""
  SELECT 
    gym.place_id, gym.place_name, gym.street_address, gym.city, gym.state, gym.zip_code, gym.country_code, gym.created_date,
    vendor.* 
  FROM foursquare_gym AS gym 
  INNER JOIN foursquare_vendor as vendor 
  ON gym.vendor = vendor.id
  WHERE gym.place_id IN (SELECT gym_id FROM manual_foursquare_gym)
""".query[FoursquareGym]

  // def insertGym(gym: FoursquareGym) = sql"""
  //   BEGIN;
  //   INSERT INTO foursquare_vendor (id)
  //   INSERT INTO foursquare_gym (place_id, place_name, street_address, city, state, zip_code, country_code, vendor, created_date, coordinates)
  //   VALUES (${gym.placeId}, ${gym.placeName}, ${gym.streetAddress}, ${gym.city}, ${gym.state}, ${gym.zipCode}, ${gym.countryCode}, ${gym.vendor.id}, ${gym.createdDate}, 'SRID=4326;POINT(-110 30)');
  //   COMMIT;
  // """.update

  /*
  name: Option[String],
  primaryCategory: String,
  primaryCategoryId: String,
  venueRealityScore: Option[String],
  secondaryCategory: Option[String],
  totalCheckins: Option[Int],
  uniqueVisitors: Option[Int]
  */
  def insertGym(gym: FoursquareGym) = sql"""
  BEGIN;
  WITH rows AS (
    INSERT INTO foursquare_vendor
        (primaryCategory, primaryCategoryId, uniqueVisitors)
    VALUES
        ('dealer1', 'jygbjybk', 5)
    RETURNING id
  )
  COMMIT;
  """

  // getGyms().check.unsafeRunSync
  // val allGyms = for {
  //   data <- getGyms().stream.compile.to[List].transact(xa)
  // } yield data

  // println(allGyms.unsafeRunSync.length)

  // getManualGyms().check.unsafeRunSync
  // val manualGyms = for {
  //   data <- getManualGyms().stream.compile.to[List].transact(xa)
  // } yield data
  
  // println(manualGyms.unsafeRunSync)
  
  val gym: FoursquareGym = FoursquareGym(
    "id4","name4",Some("addr4"),Some("city4"),Some("state4"),Some("zip3"),Some("country1"), DateTime.now.toDate(), Coordinates(1.0, 1.0),
    FoursquareVendor(
      "1",Some("name1"),"primaryCatId1","primaryCatId1",Some("score1"),Some("secCatId1"),Some(1),Some(2)))
  // insertGym(gym).check.unsafeRunSync
  insertGym(gym).run.transact(xa).unsafeRunSync
}

with rows as (
  INSERT INTO Table1 (name) VALUES ('val') RETURNING id
)
INSERT INTO Table2 (val) SELECT id FROM rows