name := """country"""
organization := "tarento"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.10"

libraryDependencies += guice

libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.32"
