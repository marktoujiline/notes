import Dependencies._

ThisBuild / scalaVersion     := "2.12.10"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "doobie-recipes",
    libraryDependencies += scalaTest % Test
  )

lazy val doobieVersion = "0.7.1"
lazy val postgisVersion = "2.3.0"
libraryDependencies ++= Seq(
  "org.tpolecat" %% "doobie-core"     % doobieVersion,
  "org.tpolecat" %% "doobie-postgres" % doobieVersion,
  "org.tpolecat" %% "doobie-specs2"   % doobieVersion,
  "net.postgis" % "postgis-jdbc" % postgisVersion
)

libraryDependencies += "joda-time" % "joda-time" % "2.10.5"

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
