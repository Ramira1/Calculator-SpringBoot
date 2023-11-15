package com.calculator.calculadora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.calculator.calculadora.service.CalculadoraService;

@Controller
public class CalculadoraController {
    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/calcular")
    public String calcular(
            @RequestParam String operacao,
            @RequestParam double a,
            @RequestParam double b,
            Model model) {
        try {
            double resultado = calculadoraService.calcular(operacao, a, b);
            model.addAttribute("resultado", resultado);
        } catch (ArithmeticException e) {
            model.addAttribute("erro", e.getMessage());
        }

        return "index";
    }
}