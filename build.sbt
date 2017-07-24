name := """ToDoList"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "anorm" % "2.5.0",
  guice,
  evolutions,
  jdbc,
  cache,
  ws,
  "com.h2database" % "h2" % "1.4.194",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)
libraryDependencies += "xalan" % "serializer" % "2.7.2"
