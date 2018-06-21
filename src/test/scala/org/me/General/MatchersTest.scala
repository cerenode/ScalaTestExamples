package org.me.General

import org.scalatest.{FlatSpec, Matchers}

class MatchersTest extends FlatSpec with Matchers {


  val result = 3
  result should equal (3)            // can customize equality
  result should === (3)       // can customize equality and enforce type constraints
  result should be (3)               // cannot customize equality, so fastest to compile
  result shouldEqual 3               // can customize equality, no parentheses required
  result shouldBe 3                  // cannot customize equality, so fastest to compile, no parentheses required
}
