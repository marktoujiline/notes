# sbt

## Configuration
`/usr/local/etc/sbtopts` sets global sbt configs.

## Version
2 significant versions, 0.13.x and 1.x.x. 0.13 is no longer supported. 

Scala version of sbt is orthogonal to Scala version of project. Sbt Scala set in `project/build.properties` with `sbt.version`.
It automatically downloads the version if necessary. Since sbt is written in Scala, it needs it's own compiler.

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
## Commands
```
> compile
> ~<cmd>             // ~ runs in watch mode
> ~compile           // compile in watch mode
> run                // run application
> reload             // rereads build.sbt configs
> test               // run tests
> clean              // delete target/
> ~testQuick         // run tests in watch mode
> console            // enter REPL mode
scala > :paste       // enter paste mode (ctrl-D to end)
scala > :q           // exit REPL mode
> projects           // list all submodules
> <project>/compile  // compile specific submodule
```
Don't run in batch mode; it requires JVM spinup and JIT each time so it will be slower.

## Directory Structure
Same as Maven. All other directories in src are ignored.

### project
Can contain:
* *.scala files: helpers and one-off plugins
* *.sbt files: TODO
* build.properties: sbt settings

### target
Contains generated files. Folder should be in .gitignore.

