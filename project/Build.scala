import sbt._

object MyBuild extends Build {
  lazy val root = Project("root", file(".")) dependsOn (sfx)
  lazy val sfx = file(System.getenv("SCALAFX_HOME"))
}
