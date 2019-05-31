import sbt._

object CommonPlugin extends AutoPlugin {

  val greeting = settingKey[String]("greeting")

  override lazy val buildSettings = Seq(greeting := "Yo")
}
