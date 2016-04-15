lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "Scala.js Cytoscape"

normalizedName := "scalajs-cytoscapejs"

version := "0.1.0-SNAPSHOT"

organization := "bz.otte"

scalaVersion := "2.11.8"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.0"
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.0"

jsDependencies +=
  "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"

jsDependencies +=
  "org.webjars.npm" % "cytoscape" % "2.6.6" / "2.6.6/dist/cytoscape.js"

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.0" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")

scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings")


homepage := Some(url("http://scala-js.org/"))

licenses += ("BSD 3-Clause", url("http://opensource.org/licenses/BSD-3-Clause"))

publishMavenStyle := true

scmInfo := Some(ScmInfo(
    url("https://github.com/wrotte/scala-js-cytoscape-js"),
    "scm:git:git@github.com:wrotte/scala-js-cytoscape-js.git",
    Some("scm:git:git@github.com:wrotte/scala-js-cytoscape-js.git")))

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomExtra := (
  <developers>
    <developer>
      <id>wrotte</id>
      <name>William R. Otte</name>
      <url>https://otte.bz/</url>
    </developer>
  </developers>
)

pomIncludeRepository := { _ => false }
