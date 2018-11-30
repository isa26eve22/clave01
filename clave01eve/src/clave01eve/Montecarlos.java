/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clave01eve;

/**
 *
 * @author BIENVENIDO
 */
import static com.sun.javafx.fxml.expression.Expression.modulo;
import java.util.Scanner;
public class Montecarlos {
      
    public void MonteCarlos(){
Scanner entrada = new Scanner(System.in); 
   Variables stdin = new Variables();  
 
System.out.print("ESCRIBA UN VALOR: ");
stdin.setSemilla(entrada.nextInt());
System.out.print("INSERTE LA CONSTANTE MULTIPLICATIVA");
 stdin.setCmultiplicativa(entrada.nextInt());
System.out.print("INSERTE EL MODULO: ");
stdin.setModulo(entrada.nextInt());

for (stdin.i=1; stdin.i<=20; stdin.i++){
     stdin.num = (stdin.getCmultiplicativa()*stdin.getSemilla()) % stdin.getModulo();   
     stdin.num02 = (int) ((double)stdin.num / (double)(stdin.getModulo()-1));
   System.out.printf("%d. %d (%.4f)\n", stdin.i ,stdin.num ,stdin.num02 ); 
   stdin.variables = stdin.num; 
}
    }
    
}
