import play.core.PlayVersion
import play.sbt.PlayImport._
import sbt.Keys.libraryDependencies
import sbt._

object AppDependencies {

  val compile = Seq(
//    "uk.gov.hmrc" %% "play-reactivemongo" % "6.2.0",
    ws,
    "uk.gov.hmrc" %% "bootstrap-play-26" % "1.6.0-19-gb67d70a"
  )

  def test(scope: String = "test") = Seq(
    "uk.gov.hmrc"       %% "hmrctest"           % "3.0.0" % scope,
    "org.scalatest"     %% "scalatest"          % "3.0.4" % scope,
//    "uk.gov.hmrc"       %% "reactivemongo-test" % "3.1.0",
    "org.pegdown"       % "pegdown"             % "1.6.0" % scope,
    "com.typesafe.play" %% "play-test"          % PlayVersion.current % scope
  )

}
