package xyz.jamesnuge.language

import scala.util.matching.Regex
import scala.language.postfixOps

object IdentifierUtil {

  def identifierRegex: Regex = "[A-Za-z][A-Za-z0-9]*".r

  def isValidIdentifier(identifier: String): Boolean = KeywordsUtil.keywords indexOf identifier match {
    case -1 => identifierRegex.pattern.matcher(identifier) matches
    case _ => false
  }

}
