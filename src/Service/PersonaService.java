/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Persona;
import java.util.Scanner;


public class PersonaService {
    Scanner leer = new Scanner(System.in);
    public Persona crearPersona(){
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo M, H u O");
        p1.setSexo(leer.next());
        if (!"M".equals(p1.getSexo()) && !"H".equals(p1.getSexo()) && !"O".equals(p1.getSexo())){
            System.out.println("El sexo introducido es incorrecto");
        }
        System.out.println("Ingrese la altura(mts)");
        p1.setAltura(leer.nextDouble());
        System.out.println("Ingrese el peso (kgs)");
        p1.setPeso(leer.nextDouble());
        return p1;
    }
    public void calcularMC(Persona p1){
        double altura = p1.getAltura();
        double peso = p1.getPeso();
        double masaCorporal = peso/(altura*altura);
        if (masaCorporal<20){
            System.out.println("-1 (Está por debajo del peso ideal)");
        }else if (masaCorporal >19 && masaCorporal<26) {
            System.out.println("0 (Está en su peso ideal)");
        }else{
            System.out.println("1 (Tiene sobrepeso)");
        }
    }
    public void mayorDeEdad(Persona p1){
        boolean mayoromenor;
        int edad = p1.getEdad();
        if (18<=edad){
            mayoromenor=true;
        }else{
            mayoromenor=false;
        }
        System.out.println("La persona es mayor: "+mayoromenor);
    }
}
