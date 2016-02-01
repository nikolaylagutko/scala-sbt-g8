import $organization$.$name;format="norm,word"$.Dependencies._
import $organization$.$name;format="norm,word"$.Versions

organization := "$organization$"

name := "$name$"

version := "$version$"

scalaVersion := Versions.scala

libraryDependencies ++= Seq(


  //test dependencies
  specs2.core,
  specs2.scalacheck,
  specs2.mock
)

dependencyOverrides ++= Set(

)