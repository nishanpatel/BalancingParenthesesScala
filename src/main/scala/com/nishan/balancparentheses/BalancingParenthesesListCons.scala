package com.nishan.balancparentheses

/**
 * Created by Nishan on 17-12-2014.
 */
object BalancingParenthesesListCons {

  def isEverythingBalanced(input: String): Boolean = {
    val lstOfBrackets = input.toList
    val acc = 0
    lstOfBrackets.foldLeft(acc)(foldLeftAndMatch) == 0
  }

  def foldLeftAndMatch(x: Int, elem: Char): Int = x match {
    case 0 => elem match {
      case ')' | '}' | ']' => -100000
      case '(' | '{' | '[' => x + 1
    }
    case x => elem match {
      case ')' | '}' | ']' => x - 1
      case '(' | '{' | '[' => x + 1
      //case _ => x
    }
  }
}
