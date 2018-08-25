

name := "YearEndClosing"
version := "0.1"
fork := true

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-encoding", "utf8")

lazy val commonSettings = Seq(
  version := "0.1-SNAPSHOT",
  organization := "org.eevolution",
  scalaVersion := "2.12.6"
)

val sourceAdempiere = "/Users/e-Evolution/Develop/ADempiere/390a"

unmanagedJars in Compile ++= (file(sourceAdempiere + "/lib") * "*.jar").classpath
unmanagedJars in Compile ++= (file(sourceAdempiere + "/packages") * "*.jar").classpath

unmanagedBase := baseDirectory.value / "lib"
unmanagedClasspath in Compile += file(sourceAdempiere + "/bin")
unmanagedClasspath in Compile += file(sourceAdempiere + "/zkwebui/WEB-INF/classes")
unmanagedClasspath in Compile += file(sourceAdempiere + "/target/scala-2.11/classes")
unmanagedClasspath in Compile += file(sourceAdempiere + "/target/scala-2.11/test-classes")

unmanagedJars in Compile ++= (file(sourceAdempiere + "/zkwebui/WEB-INF/lib") * "*.jar").classpath
unmanagedJars in Compile ++= (file(sourceAdempiere + "/tools/lib") * "*.jar").classpath
unmanagedJars in Compile ++= (file(sourceAdempiere + "/lib") * "*.jar").classpath
unmanagedJars in Compile ++= (file(sourceAdempiere + "/packages") * "*.jar").classpath
unmanagedJars in Compile ++= (file(sourceAdempiere + "/zkpackages") * "*.jar").classpath

javaSource in Compile := baseDirectory.value / "base"/"src"


assemblyJarName in assembly := "PluginsYearEndClosing.jar"

assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false, includeDependency = false)

lazy val YearEndClosing = (project in file(".")).
  settings(commonSettings: _*).
  settings(
  )
