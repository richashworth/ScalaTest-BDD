package com.richashworth.testingstyles.calculator

import org.scalatest.concurrent.Eventually
import org.scalatest.selenium.HtmlUnit
import org.scalatest.{FlatSpec, ShouldMatchers}

/**
 * Created by rich on 11/10/2015.
 */
abstract class AbstractWebTest extends FlatSpec with ShouldMatchers with Eventually with HtmlUnit
