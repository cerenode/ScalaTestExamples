package org.me.hotel

import org.scalatest.{FlatSpec,Matchers}

abstract class UnitTest(className: String) extends FlatSpec with Matchers{

  behavior of className

}