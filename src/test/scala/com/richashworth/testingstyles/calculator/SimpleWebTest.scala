package com.richashworth.testingstyles.calculator

/**
 * Created by rich on 11/10/2015.
 */
class SimpleWebTest extends AbstractWebTest {

  val host = "http://www.google.com"

  "The Google Homepage" should "have the correct title" in {
    go to (host)
    pageTitle should be ("Google")
  }
  it should "perform a search" in {
    clickOn("q")
    textField("q").value = "Cheese!"
    submit()
    eventually {
      pageTitle should be ("Cheese! - Google Search")
    }
  }

}