/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Rodolfo
 */
public class Mavenproject4 {

    public static void main(String[] args) {
         
        // File file = new File("datos.txt");
        File file = new File("datos.txt");
    
        
        try {
            
            if (file.createNewFile()) {
                System.out.println("Archivo creado con éxito.");
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo.");
        }
        
    
    }
}
