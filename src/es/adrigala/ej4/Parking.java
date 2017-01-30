/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.adrigala.ej4;

import java.util.Scanner;

/**
 *
 * @author bote
 */
public class Parking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int coches = 0;
        int plazas = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe cuantas plazas quiere que tenga el parking");
        plazas = scan.nextInt();
        System.out.println("Escribe el número de coches que va a haber");
        coches = scan.nextInt();
        int tiempo = 0;
        boolean abierto;
        
        ControlParking control = new ControlParking(plazas);

        Coches[] alCoche = new Coches[coches];

      //  while(abierto = true){
             for (int i= 0; i < coches; i++){
                alCoche[i]= new Coches((i + 1), control);
             //    if(alCoche[i] == !alCoche[i].currentThread().getName){
                alCoche[i].setName("Coche " + (i + 1));
                alCoche[i].start();
                tiempo++;
            }
        //     }
        //     if (tiempo == 10){
        //         break;
        //    }
       // }
           

        }



    }
    
    

