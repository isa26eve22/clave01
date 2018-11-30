/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clave01eve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author BIENVENIDO
 */
public class MenuA {
        public void Menu01() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner stdin = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0;
        
        while(!salir){
            
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||||       BIENVENIDO              ||||||||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||| 1. Resolver Torre de Hanoid        ||||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||||      2. Simular montecar                |||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||||    3. Salir                            ||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
            do{
            try {
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("||||       Ingresa una opcion           ||||");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||");
                 opcion = stdin.nextInt();
                 
                 
                 switch(opcion){
                case 1:
                Torreprogra tor = new Torreprogra ();
                
                tor.RTorre();
                    break;
                case 2:
                Montecarlos MonteC =  new Montecarlos();
                MonteC.MonteCarlos();
                    break;
                case 3:
                    salir=true;
                    break;          
                default:
                    System.out.println("||||||||||||||||||||");
                    System.out.println("INGRESE UNA OPCION");
                    System.out.println("|||||||||||||||||||||");
            }
            } catch (InputMismatchException e) {
                System.out.println("||||||||||||||||||||||||||");
                System.out.println("DEBES INSERTAR UN NUMERO");
                System.out.println("||||||||||||||||||||||||||");
                stdin.next();
            }
        }while(opcion<=0 || opcion>3);
            
        System.out.println("||||||||||||||||||||||||||||||||||||");
        System.out.println("Presione Enter para continuar......>");
        System.out.println("||||||||||||||||||||||||||||||||||||");
        br.readLine();
        }
        }
    
}
