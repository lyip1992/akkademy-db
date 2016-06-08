name := """akkademy-db"""
version := "1.0"
scalaVersion := "2.11.8"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.7",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.7",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)
