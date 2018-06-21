package org.me.hotel

import org.scalatest.Suites

class MySuites extends Suites(
  new HotelTest,
  new GuestTest,
  new RoomTest)