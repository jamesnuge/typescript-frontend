package xyz.jamesnuge.typescript

import org.bitbucket.inkytonik.kiama.util.ParseTests
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SyntaxAnalysisTest extends ParseTests {

  val parsers = new SyntaxAnalysis(positions)
  import parsers._

  test("parsing an identifier or one letter produces the correct tree") {
    identifier("x") should parseTo[String]("x")
  }

}
