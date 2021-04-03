package xyz.jamesnuge.typescript

import org.bitbucket.inkytonik.kiama.parsing.Parsers
import org.bitbucket.inkytonik.kiama.util.Positions
import xyz.jamesnuge.language.{IdentifierUtil, KeywordsUtil}

class SyntaxAnalysis(positions: Positions) extends Parsers(positions) {

  lazy val keywordParser: PackratParser[String] = keywords(
    IdentifierUtil.identifierRegex,
    KeywordsUtil.keywords
  ) | failure("expecting keyword")

  lazy val identifier: PackratParser[String] =
    (not(keywordParser) | failure("identifier expected by keyword found")) ~> IdentifierUtil.identifierRegex

}
