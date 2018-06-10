package org.me.General

import org.scalatest.WordSpec

class WordSpecTestSuite extends WordSpec{

  val g = new GeneralClass

  "GeneralClass" can {

    "AddTwoNumbers" can {
      "Adding positive numbers" should {
        "give +ve numbers " in {
          assert(g.addTwoNumbers(2, 4) == 6)
        }
      }
    }

    "GettingValueFromList" can {
      "accessing value from list elements" should {
        "return value at index" in {
          assert(g.getValueFromIndex(3) == 4)
        }

        "return IndexOutOfBoundsException if index out of bounds" ignore {
          intercept[IndexOutOfBoundsException] {
            g.getValueFromIndex(7)
          }
        }
      }
    }
  }

}
