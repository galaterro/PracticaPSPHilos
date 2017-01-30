package es.adrigala;

import es.adrigala.ej1.Relevos;
import es.adrigala.ej2.SuperMarket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Semaphore;

/**
 * Created by juanxxiii on 19/01/2017.
 */
public class Ejecutador {
    public static void main(String[] args) throws IOException {
        int selector = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Seleccione una opción: ");
            System.out.println("1.- Ejercicio 1");
            System.out.println("2.- ejercicio 2");
            System.out.println("3.- Ejercicio 3");
            System.out.println("4.- Ejercicio 4");
            System.out.println("5.- Salir");
            selector = Integer.parseInt(br.readLine());
            switch (selector){
                case 1:
                    System.out.println("*************");
                    System.out.println("Ejercicio 1");
                    System.out.println("*************");
                    try {
                        Relevos ej1 = new Relevos();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("*************");
                    System.out.println("Ejercicio 2");
                    System.out.println("*************");
                    SuperMarket ej2 = new SuperMarket();
                    break;
            }
        }
    }

