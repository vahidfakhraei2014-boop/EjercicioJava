/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MEDAC
 */
public class Calculadora {
    
    
    public static int sumar(int a,int b){
       return a+b; 
    }
    
    public static int restar(int a,int b){
        return a-b;
    }
    
    public static int multiplicar(int a,int b){
        return a*b;
    }
    
    public static int dividir(int a,int b){
        return a/b;
    }
    
    public static int valorAbsoluto(int a){
      
        if (a<0){
            return -a;
            
        }
        return a;
    }
    
    public static int potencia(int base,int exponente){
        int resultado=1;
        if (exponente <0){
            throw new ArithmeticException("el exponente no puede ser negativo");
        }
        for (int i=0; i<exponente; i++){
            resultado=resultado*base;
        }
        
        return resultado;
    }
    
    
}
