package xyz.jamesnuge.language

import org.junit.Test
import org.scalatest.Matchers
import org.scalatestplus.junit.JUnitSuite
import xyz.jamesnuge.language.IdentifierUtil.isValidIdentifier

class IdentifierUtilTest extends JUnitSuite with Matchers {

  @Test
  def verifyCannotStartWithNumber(): Unit = List(
    "0","1", "2", "3", "4", "5", "6", "7", "8", "9"
  ) foreach shouldBeInvalid

  @Test
  def verifyCannotBeEmpty(): Unit = shouldBeInvalid("")

  @Test
  def verifyCanStartWithAnyLetter(): Unit = List(
    "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
    "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"
  ) foreach shouldBeValid

  @Test def verifyKeywords() = List(
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
  ) foreach shouldBeInvalid

  private def shouldBeValid = shouldBe(true)
  private def shouldBeInvalid = shouldBe(false)

  private def shouldBe(shouldBeValid: Boolean) = (value: String) => {
    def errorString = if (shouldBeValid) " a valid " else " an invalid "
    if (isValidIdentifier(value) != shouldBeValid) {
      System.out.println("Identifier with name: " + value + " should be" + errorString + "identifier")
    }
  }


}
