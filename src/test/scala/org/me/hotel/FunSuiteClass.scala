package org.me.hotel

import org.scalatest.tagobjects.{Slow, Network}

class FunSuiteClass extends UnitTest("Default") {

  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }

  it should "produce NoSuchElementException when head is invoked" taggedAs (Slow, Network) in {
    an [NoSuchElementException] should be thrownBy{
      Set.empty.head
    }
  }

  2+2 should equal(4)
}