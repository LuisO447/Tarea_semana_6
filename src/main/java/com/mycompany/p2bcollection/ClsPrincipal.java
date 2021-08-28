/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p2bcollection;

import Modelo.MdVendedor;
import NuevaComision.ClsnuevaComision;
import java.util.*;
//import java.util.List;

/**
 *
 * @author Luis
 */
public class ClsPrincipal {
    public static void main(String[] args) {

        ClsnuevaComision comi = new ClsnuevaComision();

        comi.Menu();
        
        
    }
    
//    public static void imprimir(Collection coleccion){
//        
//        for(Object elemento : coleccion){
//            System.out.println("Elemento = "+elemento);
//        } 
//        
//        //-----------------Primera parte de lo que estaba en el main
//        //        List miLista = new ArrayList();
////        List listaEnlazada = new LinkedList();
////        listaEnlazada.add("Karla");
////        imprimir(listaEnlazada);
////        miLista.add(100);
////        miLista.add(200);
////        miLista.add(300);
////        imprimir(miLista);
////        System.out.println("Otra linea");
////        miLista.add(100);
////        imprimir(miLista);
//
//
////List <MdVendedor> todos = new ArrayList<MdVendedor>();
//
////        comi.Ingreso_Informacion();
////        comi.Ingreso_Informacion();
////        comi.Ingreso_Informacion();
//        
//        //-----------------------------------segunda parte de lo que estaba en el main
////        MdVendedor vende = new MdVendedor();
////        vende.nombre="Diego";
////        vende.enero=200;
////        vende.febrero=100;
////        vende.marzo=40;
////        todos.add(vende);
////        vende = new MdVendedor();
////        
////        //MdVendedor vende2 = new MdVendedor();
////        vende.nombre="Linda";
////        vende.enero=200;
////        vende.febrero=100;
////        vende.marzo=90;
////        todos.add(vende);
////        vende = new MdVendedor();
////        
////        vende.nombre="Steven";
////        vende.enero=12;
////        vende.febrero=77;
////        vende.marzo=40;
////        todos.add(vende);
////        vende = new MdVendedor();
////        
////        System.out.println("Vende Nombre "+vende.nombre);
//        //System.out.println("Vende Nombre "+vende.nombre);
//    }
}
