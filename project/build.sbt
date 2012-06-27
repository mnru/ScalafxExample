addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.0-RC1")


addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.0.0")


 resolvers += ScalaToolsSnapshots

 resolvers += "remeniuk repo" at "http://remeniuk.github.com/maven" 

 libraryDependencies += "org.netbeans" %% "sbt-netbeans-plugin" % "0.1.4"


