package org.me.General

import java.io.{File, FileWriter}

class GeneralClass {

  val list = List(1, 2, 3, 4, 5, 6)

  def addTwoNumbers(a: Int, b: Int): Int = a + b

  def getValueFromIndex(idx: Int): Int = list(idx)

  def withFile(testCode: (File, FileWriter) => Any) {
    val file = File.createTempFile("hello", "world") // create the fixture
    val writer = new FileWriter(file)
    try {
      writer.write("ScalaTest is ") // set up the fixture
      testCode(file, writer) // "loan" the fixture to the test
    }
    finally writer.close() // clean up the fixture
  }

  def withAnotherFile(testCode: (File, FileWriter) => Any) {
    val file = File.createTempFile("hello", "world") // create the fixture
    val writer = new FileWriter(file)
    try {
      writer.write("Scala is a") // set up the fixture
      testCode(file, writer) // "loan" the fixture to the test
    }
    finally writer.close() // clean up the fixture
  }

}
