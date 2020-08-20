lazy val root = (project in file("."))
  .settings(
    name := "atcoder-beginners-selection",
    version := "0.1",
    scalaVersion := "2.13.3",
    libraryDependencies ++= Seq(
        "org.scalatest" %% "scalatest" % "3.2.1" % Test
      )
  )
