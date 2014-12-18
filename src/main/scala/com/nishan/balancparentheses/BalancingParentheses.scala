package com.nishan.balancparentheses

/**
 * Created by Nishan on 17-12-2014.
 */
object BalancingParentheses {

  def isEverythingBalanced(input: String): Boolean = {

    if(input.length % 2 != 0) return  false

    val stack = collection.mutable.Stack.empty[String]
    import stack._

    for(i <- input) i match {
      case '(' => push("(")
      case ')' => if (isEmpty) return false else if (pop() != "(") return false
      case '[' => push("[")
      case ']' => if (isEmpty) return false else if (pop() != "[") return false
      case '{' => push("{")
      case '}' => if (isEmpty) return false else if (pop() != "{") return false
    }
    if(isEmpty) true else false
  }
}
