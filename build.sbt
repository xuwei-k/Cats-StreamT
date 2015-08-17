scalaVersion := "2.11.7"

name := "cas-streamT"

libraryDependencies += "com.chuusai" %% "shapeless" % "2.2.5"
libraryDependencies += "com.github.scalaprops" %% "scalaprops-gen" % scalapropsVersion.value

licenses := Seq("MIT License" -> url("http://opensource.org/licenses/mit"))

scalapropsWithScalazlaws

scalapropsVersion := "0.1.13"

scalacOptions ++= (
  "-deprecation" ::
  "-unchecked" ::
  "-Xlint" ::
  "-language:existentials" ::
  "-language:higherKinds" ::
  "-language:implicitConversions" ::
  "-Yno-adapted-args" ::
  Nil
)
