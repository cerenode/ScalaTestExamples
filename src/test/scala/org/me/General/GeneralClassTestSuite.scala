package org.me.General

import org.scalatest.tagobjects.Slow

class GeneralClassTestSuite extends UnitTest {

  val gen = new GeneralClass
  test("Adding two positive numbers should return another positive number") {
    assert(gen.addTwoNumbers(3, 4) == 7)
  }

  test("Adding two negative numbers should return a negative number") {
    assert(gen.addTwoNumbers(-3, -4) == -7)
  }

  test("Adding a positive and negative number might result in a positive or negative number") {
    assert(gen.addTwoNumbers(-3, 4) == 1)
    assert(gen.addTwoNumbers(3, -4) == -1)
  }

  test("invoking index value greater than index value should return IndexOutOfBoundException", Slow) {
    val index = 5
    if(index > gen.list.length) {
      assert(gen.getValueFromIndex(4) == 4)
    } else {
      intercept[IndexOutOfBoundsException] {
        gen.getValueFromIndex(7)
      }
    }
  }

}
