import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "ashwin-hello",
    libraryDependencies ++= Seq(
    	scalaTest % Test,
  	    "org.pegdown" % "pegdown" % "1.6.0" % Test
  	),
    testOptions in Test ++= Seq(
    Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/test-reports")
  )
  )
