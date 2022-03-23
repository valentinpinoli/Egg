/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import Entidades.Persona;
import Service.PersonaService;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService opciones = new PersonaService();
        Persona p1 = opciones.crearPersona();
        Persona p2 = opciones.crearPersona();
        Persona p3 = opciones.crearPersona();
        Persona p4 = opciones.crearPersona();
        System.out.println("Persona 1");
        opciones.calcularMC(p1);
        opciones.mayorDeEdad(p1);
        System.out.println("Persona 2");
        opciones.calcularMC(p2);
        opciones.mayorDeEdad(p2);
        System.out.println("Persona 3");
        opciones.calcularMC(p3);
        opciones.mayorDeEdad(p3);
        System.out.println("Persona 4");
        opciones.calcularMC(p4);
        opciones.mayorDeEdad(p4);

        
    }
    
}
