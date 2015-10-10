package com.richashworth.testingstyles.calculator;

import java.math.BigDecimal;

/**
 * Created by rich on 10/10/2015.
 */
public class SimpleCalc implements Calculator {

    @Override
    public BigDecimal add(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    @Override
    public BigDecimal subtract(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }
}
