/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Rodolfo
 */
public class Estudiante {
    String nombre;
    int proyecto1;
    int examen1;
    int examen2;
    int proyecto2;
    
    public Estudiante(){
        
    }
    
    public Estudiante(String nombre, int proyecto1, int examen1, int examen2, int proyecto2){
        this.nombre = nombre;
        this.examen1 = examen1;
        this.examen2 = examen2;
        this.proyecto2 = proyecto2;
        
    }

    public int getProyecto1() {
        return proyecto1;
    }

    public int getExamen1() {
        return examen1;
    }

    public int getExamen2() {
        return examen2;
    }

    public int getProyecto2() {
        return proyecto2;
    }

    public void setProyecto1(int proyecto1) {
        this.proyecto1 = proyecto1;
    }

    public void setExamen1(int examen1) {
        this.examen1 = examen1;
    }

    public void setExamen2(int examen2) {
        this.examen2 = examen2;
    }

    public void setProyecto2(int proyecto2) {
        this.proyecto2 = proyecto2;
    }


    
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //funciones metodos

   public double notaTotal(){
       return getExamen1()+ getExamen2() + getProyecto1() + getProyecto2();
   }
    
    
}
