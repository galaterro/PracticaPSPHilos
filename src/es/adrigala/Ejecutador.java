package es.adrigala;

import es.adrigala.ej1.Relevos;
import es.adrigala.ej2.SuperMarket;
import es.adrigala.ej3.SuperMarketDos;
import es.adrigala.ej4.Parking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Galaterro on 19/01/2017.
 */
class Ejecutador {
    public static void main(String[] args) throws IOException {
        int selector = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Seleccione una opción: ");
            System.out.println("1.- Ejercicio 1");
            System.out.println("2.- Ejercicio 2");
            System.out.println("3.- Ejercicio 3");
            System.out.println("4.- Ejercicio 4");
            System.out.println("5.- Salir");
            selector = Integer.parseInt(br.readLine());
            switch (selector){
                case 1:
                    System.out.println("*************");
                    System.out.println("Ejercicio 1");
                    System.out.println("*************");
                    Relevos ej1 = new Relevos();
                    break;
                case 2:
                    System.out.println("*************");
                    System.out.println("Ejercicio 2");
                    System.out.println("*************");
                    SuperMarket ej2 = new SuperMarket();
                    break;
                case 3:
                    System.out.println("*************");
                    System.out.println("Ejercicio 3");
                    System.out.println("*************");
                    SuperMarketDos ej3 = new SuperMarketDos();
                    ej3.iniciar();
                    break;
                case 4:
                    System.out.println("*************");
                    System.out.println("Ejercicio 4");
                    System.out.println("*************");
                    Parking ej4 = new Parking();
                    break;
                case 5:
                    break;
            }
        }
    }

