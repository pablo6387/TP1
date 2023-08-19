package com.mycompany.tp1;

public class Bateria {
    private int carga;

    public Bateria() {
        carga=1000;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void recargar(){
        carga = 1000;
    }
    
    
}
