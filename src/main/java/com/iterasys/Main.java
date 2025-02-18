package com.iterasys;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lista 06 - Testes de Unidade");
        // areaQuadrado(5);
        // areaRetangulo(5, 3);
        // areaCirculo(5, 3.14f);
        // areaTriangulo(5, 3);
    }

    public static int areaQuadrado(int lado) {
        int resultado = lado * lado;
        // System.out.println("Area do quadrado e " + resultado + " cm²");
        return resultado;
    }

    public static int areaRetangulo(int base, int altura) {
        int resultado = base * altura;
        // System.out.println("Area do retangulo e " + resultado + " cm²");
        return resultado;
    }

    public static float areaCirculo(float raio, float pi) {
        float resultado = pi * (float) Math.pow(raio, 2);
        // System.out.println("Area do circulo e " + resultado + " cm²");
        return resultado;
    }

    public static float areaTriangulo(float base, float altura) {
        float resultado = (base * altura) / 2;
        // System.out.println("Area do triangulo e " + resultado + " cm²");
        return resultado;
    }
}