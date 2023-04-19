package com.hedima.modelo;

public class Cuadrado extends Figura {

    private double lado;

    @Override
    public double calcularArea() {
        return Math.pow(lado,2);
    }
    @Override
    public String mostrarPosicion() { return super.mostrarPosicion()+ lado; }

    public Cuadrado() {
    }

    public Cuadrado(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
