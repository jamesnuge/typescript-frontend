ThisBuild/organization := "comp.mq.edu.au"
ThisBuild/scalaVersion := "2.12.8"
ThisBuild/scalacOptions :=
  Seq(
    "-deprecation",
    "-feature",
    "-unchecked",
    "-Xcheckinit",
    "-Xfatal-warnings",
    "-Xlint:-stars-align,_"
  )

lazy val weBCPL = (project in file("."))
  .settings(
    // Project information
    name := "shittytypescript"
    version := "0.1"
    scalaVersion := "2.13.1"

    // Execution
    parallelExecution in Test := false,

    // Dependencies
    libraryDependencies ++=
      Seq (
        "org.bitbucket.inkytonik.kiama" %% "kiama" %
          "2.2.1" withSources() withJavadoc(),
        "org.bitbucket.inkytonik.kiama" %% "kiama-extras" % "2.2.1" %
          "test" classifier ("tests"),
        "junit" % "junit" % "4.12" % "test",
        "org.scalacheck" %% "scalacheck" % "1.14.0" % "test",
        "org.scalatest" %% "scalatest" % "3.0.8" % "test"
      )
  )

// Interactive settings

logLevel := Level.Info

shellPrompt := {
  state =>
    Project.extract(state).currentRef.project + " " + version.value +
      " " + scalaVersion.value + "> "
}


