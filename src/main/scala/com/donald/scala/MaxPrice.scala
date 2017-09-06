package com.donald.scala

import org.apache.spark.SparkContext._
import org.apache.spark.{SparkConf,SparkContext}

object MaxPrice {
  def main(args: Array[String]){
    val conf = new SparkConf().setAppName("Max Price")
    val sc = new SparkContext(conf)

    val maxprice = sc.textFile(args(0))
      .map(_.split(","))
      .map(rec => ((rec(0).split("-"))(0).toInt, rec(1).toFloat))
      .reduceByKey((a,b) => Math.max(a,b))
      .collect
    println("The max price is :" + maxprice.deep.mkString("\n"))

  }
}