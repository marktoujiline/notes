# sbt

## Configuration
`/usr/local/etc/sbtopts` sets global sbt configs.

## Version
2 significant versions, 0.13.x and 1.x.x. 0.13 is no longer supported. 

Scala version of sbt is orthogonal to Scala version of project. Sbt Scala set in `project/build.properties` with `sbt.version`.
It automatically downloads the version if necessary.
### 0.13.x
- Java 1.6
- Scala 2.10.0

### 1.x
- Java 1.8
- Scala 2.12.0

### Project Scala
Set version in built.sbt with `scalaVersion := "2.11.1"`
> By default, sbt also adds a dependency on the Scala library with this version.

It automatically downloads the correct version of Scala.
