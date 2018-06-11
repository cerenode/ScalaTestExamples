package org.me.General

import org.scalatest.FlatSpec

class Assertion2 extends FlatSpec {

  val numer = 45
  val g = new GeneralClass
  assertThrows[ArithmeticException] {
    numer / 4
  }

}
