import play.core.PlayVersion
import play.sbt.PlayImport._
import sbt._

object AppDependencies {

  val compile = Seq(
//    "uk.gov.hmrc" %% "play-reactivemongo" % "6.2.0",
    ws,
    "uk.gov.hmrc" %% "bootstrap-play-26" % "0.12.0"
  )

  val test = Seq(
    "org.scalatest"     %% "scalatest" % "3.0.4"             % Test,
    "org.pegdown"       % "pegdown"    % "1.6.0"             % Test,
    "com.typesafe.play" %% "play-test" % PlayVersion.current % Test
//    "uk.gov.hmrc"       %% "reactivemongo-test" % "3.1.0" % Test,
  )

}
