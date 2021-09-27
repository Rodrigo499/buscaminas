package com.rdo.buscaminas.expedition;

public class Expedition {
    private Double x;
    private Double y;
    private Double tamano;

    public Expedition(Double x, Double y, Double tamano) {
        this.x = x;
        this.y = y;
        this.tamano = tamano;
    }

    public Expedition() {

    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public Double getTamano() {
        return tamano;
    }

    @Override
    public String toString() {
        return "Expedition{" +
                "x=" + x +
                ", y=" + y +
                ", tamano=" + tamano +
                '}';
    }
}
