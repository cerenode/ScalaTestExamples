package org.me.hotel

import org.scalatest._
@DoNotDiscover
class HotelTest extends UnitTest("Hotel") {

  it should "not create a Hotel with no rooms" in {

    an [IllegalArgumentException] should be thrownBy {
      val hotel = Hotel(rooms = List()) // oops...
    }
  }

  it should "forbid checking in if there are no free rooms" in {
  	val hotel = Hotel(List(Room(1).checkin(Guest("Victor"))))
    an [IllegalArgumentException] should be thrownBy {
    	hotel.checkin("Fish")
    }
  }

  it can "allow checking in" in {
    val busyRooms = Hotel()
      .checkin("Name")
      .rooms.filter(room => !room.isFree())
    busyRooms should have size 1
    busyRooms.forall(_.guest == Option("Name"))
  }

  it should "after checking out all rooms " in {
    val hotel = new Hotel()
    val hotel1 = hotel.checkin("gokul")

    val (free, occupied) = hotel1.rooms.partition(_.isFree())


    //assume(occupied.length == 2)

    if(occupied.length == 1) {
      cancel()
    }

    val room:Room = occupied(0)
    val hotelAftercheckout = hotel1.checkout(room.number)

    //hotelAftercheckout.rooms should have size  9
    assertResult(10)(hotelAftercheckout.rooms.size)
  }








}