package org.me.hotel
import org.scalatest._

@Ignore
class GuestTest extends UnitTest("Guest") {

  it should "have its name defined" in {
    an [IllegalArgumentException] should be thrownBy {
    	Guest("name") // oops...
    }
  }
}