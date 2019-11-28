package com.u3.act3;

public class Cliente {

    private int rfc;
    private String nombre;
    private String direccion;
    private int telefono;

    public Cliente(String nombreCliente, String direccionCliente, int rfcCliente, int telefonoCliente) {

        nombre = nombreCliente;
        direccion = direccionCliente;
        rfc = rfcCliente;
        telefono  = telefonoCliente;
    }

    public int getRfc() { return rfc; }

    public int getTelefono() { return telefono; }

    public String getDireccion() { return direccion; }

    public String getNombre() { return nombre; }

}
