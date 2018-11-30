/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clave01eve;

import java.util.Scanner;

/**
 *
 * @author BIENVENIDO
 */
public class Torreprogra {
    
      public void RTorre(){
     Scanner sc = new Scanner(System.in);
        Variables stdin = new Variables();
        System.out.println("NUMERO DE DISCOS: ");
        stdin.setN(sc.nextInt());
        Hanoi(stdin.getN(),1,2,3);  
    }
    
      
      
    
  public static void Hanoi(int nn, int origen,  int auxiliar, int destino){
  if(nn==1)
  System.out.println("MOVER " + origen + " a " + destino);
  else{
     Hanoi(nn-1, origen, destino, auxiliar);
     System.out.println("MOVER "+ origen + " a " + destino);
     Hanoi(nn-1, auxiliar, origen, destino);
   }
 }
    
    
}
