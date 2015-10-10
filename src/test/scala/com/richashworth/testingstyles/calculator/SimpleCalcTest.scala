package com.richashworth.testingstyles.calculator

import java.math.BigDecimal

/**
 * Created by rich on 10/10/2015.
 */
class SimpleCalcTest extends AcceptanceTest {

  val calc: Calculator = new SimpleCalc

  markup {
    """
       As a Credit Officer
       I want to be able to perform calculations
       So that I can compute totals for my reports
    """
  }

  feature("Addition") {

    scenario("Add positive numbers") {
      Given("user enters two positive numbers")
      val a = new BigDecimal(2)
      val b = new BigDecimal(3)

      When("the equals button is pressed")
      val result = calc.add(a, b)

      Then("the result should be the sum of the numbers")
      assert(result === new BigDecimal(5))
    }

    scenario("Add positive and negative numbers") {
      Given("user enters a positive and negative number")
      val c = new BigDecimal(-2)
      val d = new BigDecimal(3)

      When("the equals button is pressed")
      val result = calc.add(c, d)

      Then("the result should be the sum of the numbers")
      assert(result === new BigDecimal(1))
    }
  }

  feature("Subtraction") {

    scenario("Subtract positive numbers") {
      Given("user enters two positive numbers")
      val a = new BigDecimal(2)
      val b = new BigDecimal(3)

      When("the equals button is pressed")
      val result = calc.subtract(a, b)

      Then("the result should be the difference of the numbers")
      assert(result === new BigDecimal(-1))
    }
  }
}
