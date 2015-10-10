package com.richashworth.testingstyles.calculator;

import java.math.BigDecimal;

/**
 * Created by rich on 10/10/2015.
 */
public interface Calculator {

    BigDecimal add(BigDecimal a, BigDecimal b);

    BigDecimal subtract(BigDecimal a, BigDecimal b);
}
