package com.vntCalc.Calc.service;

import java.math.BigDecimal;
public interface CalcService {

    String calculoSoma(BigDecimal valor1, BigDecimal valor2);

    String calculoDivisao(BigDecimal valor1, BigDecimal valor2);

    String calculoMultiplicacao(BigDecimal valor1, BigDecimal valor2);

    String calculoSubtracao(BigDecimal valor1, BigDecimal valor2);
}
