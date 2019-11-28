package com.u3.act3;

public class Car  {
    private String make;
    private String modelo;
    private String placas;
    private int deposito;
    private int tarifa;
    private  int fechaReservacion;
    private  int litrosGasolina;

    public Car(String newMake, String newModelo, String newPlacas,
               int newDeposito, int newTarifa) {
        make = newMake;
        modelo = newModelo;
        placas = newPlacas;
        deposito = newDeposito;
        tarifa = newTarifa;
    }

    public String getMake() {
        return make;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlacas() {
        return placas;
    }

    public int getDeposito() {
        return deposito;
    }

    public int getTarifa() {
        return tarifa;
    }
}
