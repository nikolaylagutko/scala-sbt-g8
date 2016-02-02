import $package$.Dependencies._
import $package$.Versions

organization := "$organization$"

name := "$name$"

version := "$version$"

scalaVersion := Versions.scala

libraryDependencies ++= Seq(
  //compile dependencies
  scala_logging,

  //test dependencies
  specs2.core,
  specs2.scalacheck,
  specs2.mock,

  logback
)

dependencyOverrides ++= Set(

)