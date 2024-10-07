// build.sbt
ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "HelloWorldScalaApp",
    version := "0.1",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor-typed" % "[2.6,3.0)",  // Allows any version from 2.6.x up to (but not including) 3.0
      "com.typesafe.akka" %% "akka-http"        % "[10.2,11.0)", // Allows any version from 10.2.x up to (but not including) 11.0
      "com.typesafe.akka" %% "akka-stream"      % "[2.6,3.0)",  // Allows any version from 2.6.x up to (but not including) 3.0
      "com.typesafe.akka" %% "akka-http-spray-json" % "10.2.7",
      "com.typesafe.akka" %% "akka-http-core" % "10.2.7",
      "com.typesafe" %% "ssl-config-core" % "0.4.3",
      "org.slf4j" % "slf4j-simple" % "1.7.36"
    )
  )
