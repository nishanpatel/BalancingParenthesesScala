Balancing Parentheses & Brackets implementation in Scala
=========================

The given input of brackets and parentheses input is considered balanced when:

1. It is empty OR
2. The content inside all pairs of corresponding parentheses/brackets is balanced

Here are some examples:

1. isEverythingBalanced("") == true.
2. isEverythingBalanced("([{}])") == true.
3. isEverythingBalanced("[") == false.
4. isEverythingBalanced("}") == false.
5. isEverythingBalanced("({)}") == false
6. isEverythingBalanced("}{") == false.
7. isEverythingBalanced("){") == false.

Tasks:

Implemented a function isEverythingBalanced(text: String): Boolean using,
1. Using Stack implementation.
2. Using List Cons Oppration.

NOTE: A solution dose not uses regular expressions, and use of it is considered INCORRECT.
