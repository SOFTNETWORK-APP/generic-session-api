import app.softnetwork.sbt.build.Versions

Test / parallelExecution := false

organization := "app.softnetwork.session"

name := "session-testkit"

libraryDependencies ++= Seq(
  "app.softnetwork.api" %% "generic-server-api-testkit" % Versions.server
)
