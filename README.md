Balancing Parentheses & Brackets implementation in Scala
=========================

The given input of brackets and parentheses input is considered balanced when:

1. It is empty OR
2. The content inside all pairs of corresponding parentheses/brackets is balanced

Here are some examples:

isEverythingBalanced("") == true
isEverythingBalanced("([{}])") == true
isEverythingBalanced("[]([{}[]()])") == true
isEverythingBalanced("[") == false
isEverythingBalanced("}") == false
isEverythingBalanced("({)}") == false
isEverythingBalanced("}{") == false
isEverythingBalanced("){") == false

Tasks:

Implemented a function isEverythingBalanced(text: String): Boolean using,
1. Using Stack implementation.
2. Using List Cons Oppration.

NOTE: A solution that uses regular expressions is considered INCORRECT.
