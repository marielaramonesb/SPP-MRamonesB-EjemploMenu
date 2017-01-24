/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.mramonesb.ejemplomenu;
import java.util.Scanner;
/**
 *
 * @author marielaramonesbalvoa
 */
public class SPPMRamonesBEjemploMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables
        int opEntrada;
        Scanner kb = new Scanner (System.in);
        
        //Desplegamos menú
        System.out.println("Calculadora de áreas, perímetros y volúmenes");
        System.out.println("Introduzca la opcion deseada");
        System.out.println("1.Calcular áreas");
        System.out.println("2.Calcular perímetros");
        System.out.println("3. Calcular volúmenes");
        System.out.println("Salir");
        opEntrada = kb.nextInt();
        
        switch (opEntrada){
            case 1:
                System.out.println("Bienvenidos al cálculador de áreas");
                break;
            case 2:
                System.out.println("Bienvenidos al cálculador de perímetros");
                break;
            case 3:
                System.out.println("Bienvenido al cálculador devolúmenes");
            default:
                System.out.println("ADIOS");
        }

    }
    
}
