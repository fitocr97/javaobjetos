/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Estudiante;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Rodolfo
 */
public class Logica {
    //metodos
    
    Estudiante estudiante;
    
    //guardar la info para mostrar en la tabla
    public ArrayList<Estudiante> array = new ArrayList();
    
    public void insertar(Estudiante est){
        try {
            System.out.println("entro al insertar");
            FileWriter writer = new FileWriter("datos.txt", true); 
            
            //Creamos un string
            String cadena = est.getNombre()+"-"+est.getProyecto1()+"-"+est.getExamen1()+"-"+est.getExamen2()+"-"+est.getProyecto2();
            System.out.println(cadena);
            writer.write(cadena); //guardar en archivo
            writer.write(10);
            writer.close();
            
        } catch (IOException e) {
            System.out.println("error al agregar info al archivo");
        }
    }
    
    public void leerDatos(){
        try {
            array.clear(); //limpiamos el array para cargar datos
            FileReader file = new FileReader("datos.txt"); //abre el archivo para lectura
            BufferedReader reader = new BufferedReader(file);
            
            String cad = reader.readLine();
            String vec[]; //dividir la cadena
            
            while(cad!=null){
                vec= cad.split("-");
                
                estudiante = new Estudiante(vec[0],Integer.parseInt(vec[1]),Integer.parseInt(vec[2]),Integer.parseInt(vec[3]),Integer.parseInt(vec[4]));
                array.add(estudiante); //agregamos la info al array
                cad = reader.readLine(); //guardar todos
            }
            
        } catch (IOException e) {
            System.out.println("error al mostrar datos");
        }
    }
}
