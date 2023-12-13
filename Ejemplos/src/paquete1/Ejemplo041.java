/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int suma = 0;// inicio una variable acumulad que va a ir sumando 
        //los arreglos 
        String acumulador = "";
        // Declarar y generar arreglos en Java

        // arreglo de tipo entero
        //int[] arreglo1 = new int[5];
        int[] arreglo1 = {1000, 1, 2, 2000, 300};
        // System.out.println(arreglo1.length);
        //arreglo1[2] = 1000;// en este arreglo de 5 elementos tiene 4 arreglos ya 
        //que se inicia en 0
        for (int i = 0; i < arreglo1.length; i++) {//length asociado a un arreglo
            //me da el numero de elementos que tiene el arreglo asosciado 
            suma += arreglo1[i];
            acumulador = String.format("%sSubíndice o Índice %d, con valor"
                    + " %d\n",
                     acumulador, i, arreglo1[i]);
            
        }
        acumulador = String.format("%sLa suma de los elementos = %d\n",
                     acumulador,suma);
        
        System.out.printf("%s\n",acumulador.toUpperCase());

    }

}
