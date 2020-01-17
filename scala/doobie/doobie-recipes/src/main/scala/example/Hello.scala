package example

import doobie._

import doobie.implicits._
import doobie.util.meta.LegacyInstantMetaInstance
import cats.effect.IO
import scala.concurrent.ExecutionContext
import java.time.Instant

case class Data(venueId: Option[String], createdAt: Instant)

object Hello extends Greeting with App {
  implicit val cs = IO.contextShift(ExecutionContext.global)
  val xa = Transactor.fromDriverManager[IO](
    "org.postgresql.Driver", "jdbc:postgresql://localhost/postgres","postgres",""
  )
  val y = xa.yolo
  import y._
  
  get().check.unsafeRunSync
}

trait Greeting extends LegacyInstantMetaInstance {
  lazy val greeting: String = "hello"

  def get() = sql"""
    select venue_id, created_at from white_listed_venue
  """.query[Data]
}
