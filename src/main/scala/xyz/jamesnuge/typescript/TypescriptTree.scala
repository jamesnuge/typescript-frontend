package xyz.jamesnuge.typescript

object TypescriptTree {
  import org.bitbucket.inkytonik.kiama.relation.Tree

  /**
   * A relational tree to handle access to parent and sibling nodes.
   */
  type SourceTree = Tree[SourceNode, Program]

  sealed abstract class SourceNode extends Product

  case class Program(exps: Vector[String]) extends SourceNode

  sealed abstract class IdnNode extends SourceNode {
    def idn: String
  }

  case class IdnDef(idn: String) extends IdnNode

  case class IdnUse(idn: String) extends IdnNode


}
