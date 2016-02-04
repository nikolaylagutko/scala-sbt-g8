package $package$

import sbt._

object Versions {

  val scala         = "$scala$"
  val specs2        = "$specs2$"
  val scala_logging = "$scala_logging$"
  val logback       = "$logback$"

}

object Dependencies {

  object specs2 {
    val core       = "org.specs2" %% "specs2-core"       % Versions.specs2 % "test"
    val scalacheck = "org.specs2" %% "specs2-scalacheck" % Versions.specs2 % "test"
    val mock       = "org.specs2" %% "specs2-mock"       % Versions.specs2 % "test"
  }

  object scala {
    val reflect = "org.scala-lang" % "scala-reflect" % Versions.scala
  }

  val scala_logging = "com.typesafe.scala-logging" %% "scala-logging" % Versions.scala_logging

  val logback = "ch.qos.logback" % "logback-classic" % Versions.logback % "test"

}