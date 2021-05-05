package example

import doobie._

import doobie.implicits._
import doobie.util.Meta
import cats.effect.IO
import scala.concurrent.ExecutionContext
import java.time.Instant
import org.joda.time.DateTime

case class WhitelistedVenue(
  venueId: String,
  createdAt: DateTime
)

trait JodaDateTime {
  def fromInstant(i: Instant): DateTime = DateTime.parse(i.toString)
  def toInstant(d: DateTime): Instant = Instant.parse(d.toString)
  implicit val jodaDateTime: Meta[DateTime] = Meta[Instant].timap(fromInstant)(toInstant)
}

object Hello extends App with JodaDateTime {

  implicit val cs = IO.contextShift(ExecutionContext.global)
  val xa = Transactor.fromDriverManager[IO](
    "org.postgresql.Driver", "jdbc:postgresql://localhost/postgres","postgres",""
  )
  val y = xa.yolo
  import y._
  
  get().check.unsafeRunSync
  val res = for {
    data <- get().stream.compile.to[List].transact(xa)
  } yield data
  println(res.unsafeRunSync)

  def get() = sql"""
    select venue_id, created_at from white_listed_venue
  """.query[WhitelistedVenue]
}
