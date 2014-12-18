package com.nishan.balancparentheses

import org.scalatest.FunSuite

/**
 * Created by Nishan on 19-12-2014.
 */
class BalancingParenthesesListConsListCons$Test extends FunSuite {

  test("An empty arg should return true") {
    assert(BalancingParenthesesListCons.isEverythingBalanced("") == true)
  }

  test("An ([{}]) arg should return true") {
    assert(BalancingParenthesesListCons.isEverythingBalanced("([{}])") == true)
  }

  test("An []([{}[]()]) arg should return true") {
    assert(BalancingParenthesesListCons.isEverythingBalanced("[]([{}[]()])") == true)
  }

  test("An [ arg should return false") {
    assert(BalancingParenthesesListCons.isEverythingBalanced("[") == false)
  }

  test("An } arg should return false") {
    assert(BalancingParenthesesListCons.isEverythingBalanced("}") == false)
  }

  test("An ({)} arg should return false") {
    assert(BalancingParentheses.isEverythingBalanced("({)}") == false)
  }

  test("An }{ arg should return false") {
    assert(BalancingParentheses.isEverythingBalanced("}{") == false)
  }

  test("An ){ arg should return false") {
    assert(BalancingParentheses.isEverythingBalanced(")}") == false)
  }
}
