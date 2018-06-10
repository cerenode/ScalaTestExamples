package org.me.General

class TV {
  private var on: Boolean = false
  def isOn: Boolean = on
  def pressPowerButton() { on = !on }
}