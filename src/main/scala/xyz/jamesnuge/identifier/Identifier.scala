package xyz.jamesnuge

import scala.util.matching.Regex

object Identifier {

  private val keywords: List[String] = List(
    "abstract",
    "boolean",
    "break",
    "byte",
    "case",
    "catch",
    "char",
    "class",
    "const",
    "continue",
    "debugger",
    "default",
    "delete",
    "do",
    "double",
    "else",
    "enum",
    "export",
    "extends",
    "final",
    "finally",
    "float",
    "for",
    "function",
    "goto",
    "if",
    "implements",
    "import",
    "in",
    "instanceof",
    "int",
    "interface",
    "let",
    "long",
    "native",
    "new",
    "package",
    "private",
    "protected",
    "public",
    "return",
    "short",
    "static",
    "super",
    "switch",
    "synchronized",
    "this",
    "throw",
    "throws",
    "transient",
    "try",
    "typeof",
    "var",
    "void",
    "volatile",
    "while",
    "with",
    "yield"
  )

  private def identifierRegex: Regex = "^(\\w\\d)(\\w\\d)*".r

  def isValidIdentifier(identifier: String): Boolean = keywords.indexOf(identifier) match {
    case -1 => true
    case _ => false
  }

}
