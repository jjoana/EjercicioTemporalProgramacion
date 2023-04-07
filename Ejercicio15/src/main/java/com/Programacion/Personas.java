package com.Programacion;

import java.util.ArrayList;

public class Personas {
    long edadInicial = 200;
    ArrayList<Persona> lista = new ArrayList<Persona>();
    int resultado = 0;

    public void annadirPersona(Persona persona) {
        lista.add(persona);
    }

    public ArrayList<Persona> getListado() {
        return lista;
    }

    public Persona elMasJoven() {
        long edadInicial = 200;
        Persona seleccionada = new Persona();
        for (Persona p : lista) {
            if (p.calcularEdad() < edadInicial) {
                edadInicial = p.calcularEdad();
                seleccionada = p;
            }
        }
        return seleccionada;
    }

    public Persona elMasJovenR() {
        Persona p = new Persona();
        if (!lista.isEmpty()) {
            if (lista.get(0).calcularEdad() < edadInicial) {
                edadInicial = lista.get(0).calcularEdad();
                p = lista.get(0);
                lista.remove(0);
                elMasJovenR();
            } else {
                lista.remove(0);
                elMasJovenR();
            }
        }
        return p;
    }

    public long calcularSumaEdades() {
        int resultado = 0;
        for (Persona p : lista) {
            resultado += p.calcularEdad();
        }
        return resultado;
    }

    public long calcularSumaEdadesR() {
        if (!lista.isEmpty()) {
            resultado += lista.get(0).calcularEdad();
            lista.remove(0);
            calcularSumaEdadesR();
        }
        return resultado;
    }

    public long calcularEdadMinima() {
        long edadInicial = 200;
        for (Persona p : lista) {
            if (p.calcularEdad() < edadInicial) {
                edadInicial = p.calcularEdad();
            }
        }
        return edadInicial;
    }

    public long calculaEdadMinimaR() {

        if (!lista.isEmpty()) {
            if (lista.get(0).calcularEdad() < edadInicial) {
                edadInicial = lista.get(0).calcularEdad();
                lista.remove(0);
                calculaEdadMinimaR();
            } else {
                lista.remove(0);
                calculaEdadMinimaR();
            }
        }
        return edadInicial;
    }

    public double calcularMediaEdad() {
        int resultado = (int) calcularSumaEdades();
        return resultado / lista.size();
    }

}