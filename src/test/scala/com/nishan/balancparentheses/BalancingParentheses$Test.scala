package com.nishan.balancparentheses

import org.scalatest.FunSuite

/**
 * Created by Nishan on 19-12-2014.
 */
class BalancingParentheses$Test extends FunSuite {

  test("An empty arg should return true") {
    assert(BalancingParentheses.isEverythingBalanced("") == true)
  }

  test("An ([{}]) arg should return true") {
    assert(BalancingParentheses.isEverythingBalanced("([{}])") == true)
  }

  test("An []([{}[]()]) arg should return true") {
    assert(BalancingParentheses.isEverythingBalanced("[]([{}[]()])") == true)
  }

  test("An [ arg should return false") {
    assert(BalancingParentheses.isEverythingBalanced("[") == false)
  }

  test("An } arg should return false") {
    assert(BalancingParentheses.isEverythingBalanced("}") == false)
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
