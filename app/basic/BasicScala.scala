package com.particeep.test.basic

/**
 * This is basic language questions so don't use external library or build in function
 */
object BasicScala {

  /**
   * Encode parameter in url format
   *
   * Example:
   *
   * input  : Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
   * output : "?sort_by=name&order_by=asc&user_id=12"
   *
   * input  : Map()
   * output : ""
   */
  def encodeParamsInUrl(params: Map[String, String]): String = {
    if (params.isEmpty) ""
    else {
      val params_str = params.map { case (k, v) => s"$k=$v" }.mkString("&")
      s"?$params_str"
    }
  }

  /**
   * Test if a String is an email
   */
  def isEmail(maybeEmail: String): Boolean = {
    val emailRegex = """^[a-zA-Z0-9\.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$""".r
    emailRegex.findFirstIn(maybeEmail).isDefined
  }

  /**
   * Compute i ^ n
   *
   * Example:
   *
   * input : (i = 2, n = 3) we compute 2^3 = 2x2x2
   * output : 8
   *
   * input : (i = 99, n = 38997)
   * output : 1723793299
   */
  def power(i: Int, n: Int): Int = {
    if (n == 0) 1
    else if (n == 1) i
    else if (n % 2 == 0) power(i * i, n / 2)
    else i * power(i * i, n / 2)
  }

}
