import sbt._

object MyBuild extends Build {
  lazy val A = Project("A", file(".")) aggregate(sfx) dependsOn(sfx)
  lazy val sfx = RootProject(file(System.getenv("SCALAFX_HOME")))
}
