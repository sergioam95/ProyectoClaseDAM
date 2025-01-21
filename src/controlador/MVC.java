/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Mascota;
import vista.Consola;

/**
 *
 * @author sergio
 */
public class MVC {
    
    public static void main(String[] args){
        Consola c = new Consola();
        Mascota masc;
        System.out.println("hola");
        masc = c.pideDatos();
        c.muestraDatos(masc);
        Mascota loro = new Mascota("Nicolas","23/01/2020","Loro","Turco",23230);
        c.muestraDatos(loro);
                
    }
    buenos diaaaas
            hola que tal
}
