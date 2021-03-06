package org.me.General

import org.scalatest.FlatSpec

import scala.collection.mutable.ListBuffer

class FixuturesSimple2 extends FlatSpec {

    trait Builder  {
      val builder = new StringBuilder("ScalaTest is ")
    }


    trait Buffer {
      val buffer = ListBuffer("ScalaTest", "is")
    }

    // This test needs the StringBuilder fixture
    "Testing" should "be productive" in new Builder {
      builder.append("productive!")
      assert(builder.toString === "ScalaTest is productive!")
    }

    // This test needs the ListBuffer[String] fixture
    "Test code" should "be readable" in new Buffer {
      buffer += ("readable!")
      assert(buffer === List("ScalaTest", "is", "readable!"))
    }

    // This test needs both the StringBuilder and ListBuffer
    it should "be clear and concise" in new Builder with Buffer {
      builder.append("clear!")
      buffer += ("concise!")
      assert(builder.toString === "ScalaTest is clear!")
      assert(buffer === List("ScalaTest", "is", "concise!"))
    }
  }