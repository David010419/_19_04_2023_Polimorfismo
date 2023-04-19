package com.hedima.modelo;

public abstract class InstrumentoMusical {

    //ATRIBUTOS
    protected String Marca;

    //METODOS

    public abstract String emitirSonido();

    //CONSTRUCTORES



    public InstrumentoMusical() {
    }

    public InstrumentoMusical(String marca) {
        Marca = marca;
    }

    //SETTERS Y GETTERS


    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }
}
