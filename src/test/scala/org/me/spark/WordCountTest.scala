package org.me.spark
/*
import org.scalatest.{ BeforeAndAfterAll, FlatSpec }
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
class WordCountTest extends FlatSpec with BeforeAndAfterAll {

  private var sparkConf: SparkConf = _
  private var sc: SparkContext = _

  override def beforeAll() {
    sparkConf = new SparkConf().setAppName("unit-testing").setMaster("local")
    sc = new SparkContext(sparkConf)
  }

  val wordCount = new WordCount

  "WordCount" should "get word count " in {
    val result = wordCount.get("file.txt", sc)
    assert(result.take(10).length === 10)
  }

  override def afterAll() {
    sc.stop()
  }
}
*/
