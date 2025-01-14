/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Mascota;

/**
 *
 * @author sergio
 */
public class Consola {
    public Mascota pideDatos(){
        Scanner teclado = new Scanner(System.in);
        Mascota miMascota = new Mascota();
        
        //Pedimos datos al usuario
        System.out.println("Introduzca el nombre de la mascota: ");
        miMascota.setNombre(teclado.nextLine());
        System.out.println("Introduce la fecha de nacimiento de " + miMascota.getNombre() + ": ");
        miMascota.setFechaNacimiento(teclado.nextLine());
        System.out.println("Introduce el animal de " + miMascota.getNombre() + ": ");     
        miMascota.setAnimal(teclado.nextLine());
        System.out.println("Introduce la raza de " + miMascota.getNombre() + ": ");
        miMascota.setRaza(teclado.nextLine());
        System.out.println("Introduce el numero de chip de " + miMascota.getNombre() + ": ");
        miMascota.setNumeroChip(teclado.nextInt());
        
        return miMascota;
    }
    
    public void muestraDatos(Mascota animal){
        System.out.println("Los datos del animal son: ");
        System.out.println("Nombre: " + animal.getNombre());
        System.out.println("Fecha de nacimiento: " + animal.getFechaNacimiento());
        System.out.println("Animal: " + animal.getAnimal());
        System.out.println("Raza: " + animal.getRaza());
        System.out.println("Microchip: " + animal.getNumeroChip());
    }
    
    public String pideCadena(String pregunta){
        String cadena;
        Scanner scanner = new Scanner(System.in);
        System.out.println(pregunta);
        cadena = scanner.nextLine();
        
        return cadena;
    }
    
    public int pideEntero(String pregunta){
        int entero;
        Scanner scanner = new Scanner(System.in);
        System.out.println(pregunta);
        entero = scanner.nextInt();
        
        return entero;
    }
}
