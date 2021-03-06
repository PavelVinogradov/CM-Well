name := "cmwell-data-tools"

libraryDependencies ++= {
  val dm = dependenciesManager.value
  Seq(
    dm("com.typesafe.akka", "akka-stream"),
    dm("com.typesafe.akka", "akka-http-core"),
    dm("com.typesafe.akka", "akka-slf4j"),
    dm("net.jcazevedo", "moultingyaml"),
    dm("nl.grons", "metrics-scala"),
    dm("org.apache.commons", "commons-lang3"),
    dm("com.typesafe.scala-logging", "scala-logging"),
    dm("com.typesafe.play", "play-json"),
    dm("com.typesafe.akka", "akka-testkit") % "test",
    dm("com.typesafe.akka", "akka-stream-testkit") % "test"
  )
}

//FIXME: is there any reason why not to use newer dependency from main build.sbt (currently set to 2.6.0)
libraryDependencies += "com.github.tomakehurst" % "wiremock" % "2.4.1" % "test" jar()

fullTest := (test in Test).value