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
     public class Mostrargra {
    
    
      public void Mostrargra(){
          
        Scanner sc = new Scanner(System.in);
        
         Variables stdin = new Variables();
        System.out.println("NUMERO DE DISCOS: ");
        stdin.setN(sc.nextInt());
        
         System.out.println("TORRE INICIAL!");
        drawtorre(stdin.getN(),1,0,0);
        
        x1=0;x2=0;eve=stdin.getN();
        Hanoi(stdin.getN(),1,2,3);  
    }
      
      
  public static int x1;
  public static int x2;
  public static int eve;
  
  public static void Hanoi(int num, int origen,  int aux, int destinatario){
     
      
  if(num==1){
  System.out.println("MOVER DISCOS DE " + origen + " a " + destinatario);
  if(destinatario==3){
      x1++;
      
  }else if(destinatario ==2){
      x2++;
  }
  if(origen==2){
    x2--;
  }else if(origen==3){
    x1--;
  }
  drawtorre(eve,1,x2,x1);
  }else{
     Hanoi(num-1, origen, destinatario, aux);
     System.out.println("MOVER DISCOS DE "+ origen + " a " + destinatario);
     
     
     if(destinatario==3){
      x1++; 
     }else if(destinatario ==2){
      x2++;
     }
     
     if(origen==2){
         x2--;
     }else if(origen==3){
         x1--;
     }
     
     
     drawtorre(eve,1,x2,x1);
     Hanoi(num-1, aux, origen, destinatario);
   }
 }
 
  
  public static void drawtorre(int na,int lugar,int nb,int nc){
      String top =   "       ++        ++       ++";
      String base =  "       ++        ++       ++";
      String nada = "       ||        ||       ||";
      String[] discos = {
          "      xxxx      ","     xxxxxx     ","    xxxxxxxx    ","   xxxxxxxxxx   ","  xxxxxxxxxxxx  "," xxxxxxxxxxxxxx","xxxxxxxxxxxxxxxx"
      };
      String part = " ||";
      String space = "      ";
     
      int comp=na; 
      int acm = 0;
      int nt2=nb,nt3=nc;
      
      if(nt2==na){
          nt2=0;
          lugar=2;
      }else if(nt3==na){
          nt3=0;
          lugar=3;
      }
      System.out.println(" ");
      for(int i=9;i>0;i--){
          if(i==9){
              System.out.println(top);
          }else if(comp==i){
              
                  for(int j=i;comp>acm;j--){
                  if(nt2>0 || nt3 >0){
                      if(nt3>0){
                          System.out.println(space+part+space+" "+part+discos[acm]);
                          nt3--;
                      }else if(nt2>0){
                          System.out.println(space+part+" "+discos[acm]+"||");
                          nt2--;
                      }
                  }else{
                      
                      if(lugar==1){
                        System.out.println(discos[acm]+part+space+part);
                    }else if(lugar==2){
                        System.out.println(space+part+" "+discos[acm]+"||");
                    }else if(lugar==3){
                        System.out.println(space+part+space+" "+part+discos[acm]);
                    }
                  }
                    
                    acm++;
                    i=j;       
                  }
              
              
          }else if(i!=1){
              System.out.println(nada);
          }
          if(i==1){
              System.out.println(base);
          }
      }
    }
}
