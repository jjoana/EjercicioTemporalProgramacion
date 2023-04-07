package com.Programacion;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main( String[] args ){
        ArrayList<Persona>miLista;
        Persona objeto;
        Personas listado = new Personas();
        Long sumaEdades;

        objeto = new Persona();
        objeto.setNombre("Jesus");
        objeto.setFechaDeNacimiento(LocalDate.of(2002, 12, 9));
        listado.annadirPersona(objeto);

        objeto = new Persona();
        objeto.setNombre("Julio");
        objeto.setFechaDeNacimiento(LocalDate.of(2001, 12, 9));
        listado.annadirPersona(objeto);

        objeto = new Persona();
        objeto.setNombre("Joaquin");
        objeto.setFechaDeNacimiento(LocalDate.of(2003, 12, 9));
        listado.annadirPersona(objeto);

        objeto = new Persona();
        objeto.setNombre("Ana");
        objeto.setFechaDeNacimiento(LocalDate.of(1967, 12, 9));
        listado.annadirPersona(objeto);

        miLista =listado.getListado();

        for(Persona p: miLista){
            System.out.println(p);
        }

        objeto = listado.elMasJoven();
        System.out.println("La persona msas joven es: " + objeto);

        //objeto = listado.elMasJovenR();
        //System.out.println("La personas mas joven es: " + objeto);

        //sumaEdades = listado.calcularSumaEdadesR();
        //System.out.println("La suma de las edades es: " + sumaEdades);

        sumaEdades = listado.calculaEdadMinimaR();
        System.out.println("La edad minima es: " + sumaEdades);
    }
}