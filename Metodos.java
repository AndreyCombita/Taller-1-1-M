/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora2;

import java.lang.Math;


public class Metodos {
    double num1;
    double num2;
    
    public Metodos(){
    this.num1=num1;
    this.num2=num2 ;
    }
    //basicos
    public void suma (){
        double suma=this.num1+this.num2;
        System.out.println("su resultado es igual a "+ suma);
    }
    public void resta (){
        double resta=this.num1-this.num2;
        System.out.println("su resultado es igual a "+ resta);
    }
    public void multiplicaion (){
        double multiplicacion=this.num1*this.num2;
        System.out.println("su resultado es igual a "+ multiplicacion);
    }
    public void division (){
        double division=this.num1/this.num2;
        System.out.println("su resultado es igual a "+ division);
    
    }
    //operaciones no basicas
    public void raize(){
        double raize=Math.pow(this.num1, 1/this.num2);
        System.out.println("su resultado es igual a "+ raize);}
    public void pote(){
        double pote=Math.pow(this.num1, this.num2);
        System.out.println("su resultado es igual a "+ pote);}
    
    public void iva (){
        double iva= this.num1*this.num2;
        System.out.println("su resultado es igual a "+ iva);}
        //trigonometricas
        
    public void sen(){
        double sen= Math.sin(this.num1);
        System.out.println("su resultado es igual a "+ sen);}
    public void cos(){
        double cos= Math.cos(this.num1);
        System.out.println("su resultado es igual a "+ cos);}
    public void tan(){
        double tan= Math.tan(this.num1);
        System.out.println("su resultado es igual a "+ tan);}
    
        
        
    }
    
    
    

