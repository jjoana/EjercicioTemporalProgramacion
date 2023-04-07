package com.Programacion;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fechaDeNacimiento;

    public long calcularEdad() {
        LocalDate hoy = LocalDate.now();

        long resultado = hoy.compareTo(fechaDeNacimiento);
        return resultado;
    }

    // Metodo setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo setter
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    // Metodo getter
    public String getNombre(){
        return nombre;
    }

    //Metodo getter
    public LocalDate getfechaDeNacimiento(){
        return fechaDeNacimiento;
    }

    @Override
    public String toString() {
        String resultado = nombre + ": " + calcularEdad();
        return resultado;
    }
}