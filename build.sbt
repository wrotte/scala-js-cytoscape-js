lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "Scala.js Cytoscape"

normalizedName := "scalajs-cytoscapejs"

version := "0.1.0-SNAPSHOT"

organization := "bz.otte"

scalaVersion := "2.11.7"

crossScalaVersions := Seq("2.10.6", "2.11.7")

libraryDependencies += Seq(
  "org.scala-js" %%% "scalajs-jquery" % "0.9.0",
  "be.doeraene" %%% "scalajs-jquery" % "0.9.0"
  )
  
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
