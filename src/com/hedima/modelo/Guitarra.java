package com.hedima.modelo;

public class Guitarra extends InstrumentoMusical {

    //ATRIBUTOS
    private String tiposCuerdas;

    //METODOS


    @Override
    public String emitirSonido() {
        return "cli,cli ";
    }
    //CONSTRUCTOR
    public Guitarra() {
    }

    public Guitarra(String marca, String tiposCuerdas) {
        super(marca);
        this.tiposCuerdas = tiposCuerdas;
    }
    //GETTERS AND SETTERS
    public String getTiposCuerdas() {
        return tiposCuerdas;
    }

    public void setTiposCuerdas(String tiposCuerdas) {
        this.tiposCuerdas = tiposCuerdas;
    }
}
