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
public class Variables {
     int n;
    
    int variables;
    int varimul;
    int variablenum;
    int numeromodulo;
    int i, num;  
    double num02; 
    
    public Variables(){
        
    }
    public  Variables(int semilla, int cmultiplicativa, int caditiva, int modulo){
            this.variables=variables;
            this.varimul=cmultiplicativa;
            this.variablenum=caditiva;
            this.numeromodulo=modulo;
        }
    public int getSemilla() {
        return variables;
    }

    public void setSemilla(int semilla) {
        this.variables = semilla;
    }

    public int getCmultiplicativa() {
        return varimul;
    }

    public void setCmultiplicativa(int cmultiplicativa) {
        this.varimul = cmultiplicativa;
    }

    public int getCaditiva() {
        return variablenum;
    }

    public void setCaditiva(int caditiva) {
        this.variablenum = caditiva;
    }

    public int getModulo() {
        return numeromodulo;
    }

    public void setModulo(int modulo) {
        this.numeromodulo = modulo;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    
}
