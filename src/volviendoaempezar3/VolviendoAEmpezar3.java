package volviendoaempezar3;

import java.util.Scanner;

public class VolviendoAEmpezar3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner (System.in);
        
        nombre();

    }
    
    
    public static void nombre (){
        Scanner leer = new Scanner (System.in);
        String resp;
        do{
        System.out.println("Ingresa tu nombre ");
        String nombre = leer.nextLine();
        
        System.out.println("ingrese la edad");
        int edad = leer.nextInt();
        leer.nextLine();
        System.out.println(nombre);
        System.out.println(edad);
        
        if (edad <= 18){
            System.out.println(nombre + " es menor de edad");
            
        }else{
            System.out.println(nombre + " es mayor de edad");
        }
        
        System.out.println("quieres agregar otro nombre? S/N");
         resp = leer.nextLine();
        } while(!resp.equalsIgnoreCase("N"));
            
            
        }
        

}