
package calculadora2;

import java.lang.Math;
import java.util.Scanner;


public class Metodos {
    double num1;
    double num2;
    Scanner in=new Scanner(System.in);
    
    public Metodos(){
    this.num1=num1;
    this.num2=num2 ;
    }
    //basicos
    public void suma (){
        System.out.println("Ingrese el primer numero:");
        this.num1=in.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        this.num2=in.nextDouble();
        double suma=this.num1+this.num2;
        System.out.println("su resultado es igual a "+ suma);
    }
    public void resta (){
        System.out.println("Ingrese el primer numero:");
        this.num1=in.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        this.num2=in.nextDouble();
        double resta=this.num1-this.num2;
        System.out.println("su resultado es igual a "+ resta);
    }
    public void multiplicaion (){
        System.out.println("Ingrese el primer numero:");
        this.num1=in.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        this.num2=in.nextDouble();
        double multiplicacion=this.num1*this.num2;
        System.out.println("su resultado es igual a "+ multiplicacion);
    }
    public void division (){
        System.out.println("Ingrese el Divisor:");
        this.num1=in.nextDouble();
        System.out.println("Ingrese el Dividendo:");
        this.num2=in.nextDouble();
        if(this.num2==0){
            System.out.println("no es posible resolver esta operacion"
                    + "\n Error: no se puede dividir entre 0");
        }else{
            
        double division=this.num1/this.num2;
        System.out.println("su resultado es igual a "+ division);}
    
    }
    //operaciones no basicas
    public void raize(){
        System.out.println("Ingrese el numero base:");
        this.num1=in.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        this.num2=in.nextDouble();
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
    
    
    

