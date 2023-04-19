package com.hedima.modelo;

public class Flauta extends InstrumentoMusical {

    private String material;

    @Override
    public String emitirSonido() {
        return "fiu, fiu";
    }

    public Flauta() {
    }

    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
