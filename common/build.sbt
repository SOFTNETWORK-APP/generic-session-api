import app.softnetwork.sbt.build._

organization := "app.softnetwork.session"

name := "session-common"

val akkaHttpSession: Seq[ModuleID] = Seq(
  "com.softwaremill.akka-http-session" %% "core" % Versions.akkaHttpSession,
  "com.softwaremill.akka-http-session" %% "jwt"  % Versions.akkaHttpSession
)

libraryDependencies ++= Seq(
  "app.softnetwork.api" %% "generic-server-api" % Versions.server,
  "app.softnetwork.protobuf" %% "scalapb-extensions" % "0.1.6"
) ++ akkaHttpSession

Compile / unmanagedResourceDirectories += baseDirectory.value / "src/main/protobuf"
