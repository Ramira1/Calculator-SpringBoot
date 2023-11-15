package com.calculator.calculadora.service;

import org.springframework.stereotype.Service;
import com.calculator.calculadora.domain.Calculadora;

@Service
public class CalculadoraService {
    private final Calculadora calculadora = new Calculadora();

    public double calcular(String operacao, double a, double b) {
        switch (operacao) {
            case "soma":
                return calculadora.somar(a, b);
            case "subtracao":
                return calculadora.subtrair(a, b);
            case "multiplicacao":
                return calculadora.multiplicar(a, b);
            case "divisao":
                return calculadora.dividir(a, b);
            default:
                throw new IllegalArgumentException("Operação não suportada: " + operacao);
        }
    }
}