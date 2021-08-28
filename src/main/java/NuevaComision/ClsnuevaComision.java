/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevaComision;

import Modelo.MdVendedor;
import java.util.*;

/**
 *
 * @author Luis
 */
public class ClsnuevaComision {
    
    List <MdVendedor> todos = new ArrayList <MdVendedor>();
    Scanner t = new Scanner(System.in);
    Scanner t2 = new Scanner(System.in);
    Scanner t3 = new Scanner (System.in);
    double numero=0;
    double suma=0;
    
    
    public MdVendedor Ingreso_Informacion(){
        
        MdVendedor vende = new MdVendedor();
        System.out.println("Ingrese nombre");
        vende.nombre = t.nextLine();
        System.out.println("Ingrese enero");
        vende.enero = t.nextDouble();
        System.out.println("Ingrese febrero");
        vende.febrero = t.nextDouble();
        System.out.println("Ingrese marzo");
        vende.marzo = t.nextDouble();
        vende.total = vende.enero+vende.febrero+vende.marzo;
        vende.promedio = vende.total/3;
        todos.add(vende);
        
        vende = new MdVendedor();
        
        //MdVendedor vende = new MdVendedor(); //segundo vendedor
        System.out.println("Ingrese nombre 2 :");
        vende.nombre = t2.nextLine();
        System.out.println("Ingrese enero");
        vende.enero = t.nextDouble();
        System.out.println("Ingrese febrero");
        vende.febrero = t.nextDouble();
        System.out.println("Ingrese marzo");
        vende.marzo = t.nextDouble();
        vende.total = vende.enero+vende.febrero+vende.marzo;
        vende.promedio = vende.total/3;
        todos.add(vende);
        
        vende = new MdVendedor();
        
        //MdVendedor vende = new MdVendedor(); //3er vendedor
        System.out.println("Ingrese nombre 3: ");
        vende.nombre = t3.nextLine();
        System.out.println("Ingrese enero");
        vende.enero = t.nextDouble();
        System.out.println("Ingrese febrero");
        vende.febrero = t.nextDouble();
        System.out.println("Ingrese marzo");
        vende.marzo = t.nextDouble();
        vende.total = vende.enero+vende.febrero+vende.marzo;
        vende.promedio = vende.total/3;
        todos.add(vende);
   
        
//        for (int i = 0; i < todos.size(); i++) {
//            
//            numero+=Double.parseDouble(todos.get(i).toString());
//            
//        }
//        numero=vende.promedio;
        
        return vende;
        
    }
    
    public void grantotalmes(){
        
        MdVendedor vendepromedio = new MdVendedor();
        
        
//        for (int i = 0; i < todos.size(); i++) {
//            suma+=Double.parseDouble(todos.get(i).toString());
//            
//        }
//        suma = vendepromedio.promedio;
        //System.out.println("El promedio es = "+numero/todos.size());
        //numero=vendepromedio.promedio;
    }
    
    public void desplegarDatos(){
        for(MdVendedor ele: todos){
            System.out.println("Nombre = "+ele.nombre);
            System.out.println("Enero = Q"+ele.enero);
            System.out.println("Febrero = Q"+ele.febrero);
            System.out.println("Marzo = Q"+ele.marzo);
            System.out.println("Total = Q"+ele.total);
            System.out.println("Promedio = "+ele.promedio);
            System.out.println("-----------------");
        }
    }
    
    public void unidadPrueba(String nom, double ene, double feb, double mar){
        
        MdVendedor vende = new MdVendedor();
        vende.nombre = nom;
        vende.enero = ene;
        vende.febrero = feb;
        vende.marzo = mar;
        todos.add(vende);
    }
    
    
    public void Menu(){
        String opc="";
        do{
            System.out.println("1. ingresa informacion");
            System.out.println("2. ver informacion");
            //System.out.println("#. Quien vendio mas en un mes");
            System.out.println("3. Salir\n--------");
            opc = t.nextLine();
            
            
            switch (opc){
                case "1": Ingreso_Informacion();
                break;
                case "2": desplegarDatos();
                break;
            }
        }while(!opc.equals("3"));
        
    }
}
