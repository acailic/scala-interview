package com.particeep.test.basic


import com.particeep.test.basic.Refactoring.File
import org.scalatestplus.play.PlaySpec

import scala.List

class BasicScalaTest extends PlaySpec {

  "BasicScala" should {
    "compute email" in {
      BasicScala.isEmail("jean@particeep.com") mustBe true
      BasicScala.isEmail("jean_particeep.com") mustBe false
    }
  }

  "BasicScala" should {
    "power" in {
      BasicScala.power(2, 3) mustBe 8
    }}

    "BasicScala" should {
      "encodeParamsInUrl" in {
        BasicScala.encodeParamsInUrl(Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")) mustBe "?sort_by=name&order_by=asc&user_id=12"
      }
    }

  "ComputeAverage" should {
    "average" in {
      ComputeAverage.average(List(1, 2, 3, 4, 5)) mustBe 3
      ComputeAverage.average(List(1, 10, 16)) mustBe 9
    }
  }

  "Refactoring" should {
    "getCategories" in {
      Refactoring.getCategories(List(
        File("a","image"),
        File("b","pdf")
        ) ) mustBe List(  "image" ,"pdf")
  }
  }

}
