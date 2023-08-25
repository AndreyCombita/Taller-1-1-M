
package calculadora2;

import java.util.Scanner;


public class Metodos {
    Scanner in=new Scanner(System.in);
     
    //basicos
    public double suma (double num1, double num2){
        return num1+num2;
    }
    public double resta (double num1, double num2){
        return num1-num2;
    }
    public double mult (double num1, double num2){
        return num1*num2;
    }
    public double division (double num1, double num2){
        return num1/num2;
    }
    
//operaciones no basicas
    public double raize(double num1, double num2){
        return num1/(1/num2);
    }
    public double pote(double num1, double num2){
        return Math.pow(num1, num2);}
    
    public double iva (double num1, double num2){
        
        return num1*(num2/100);
        }
        
//trigonometricas
        
    public double sen(double num1){
        
        return  Math.sin(num1);
    }
    public double seno(double num1){
        return (Math.sin(num1)*180)/Math.PI;
    
        }
    public double cos(double num1){
        
        return  Math.cos(num1);
    }
    public double coseno(double num1){
        return (Math.cos(num1)*180)/Math.PI;
    
        }
    public double tan(double num1){
        
        return  Math.tan(num1);
    }
    public double tangente(double num1){
        return (Math.tan(num1)*180)/Math.PI;
    
        }
    
    //metodo para salir saber si quiere hacer otra operacion
    public void otra(){
        System.out.println("\n¿Desea hacer otra operacion?"
                            + "\n1.Si"
                            + "\n2.No");
                    int i =0;
                    i=in.nextInt();
                    switch (i){
                        case 1:break;
                        case 2:
                            System.out.println("Finalizado");
                            System.exit(i);
                    }
    }
    
        
        
    }
    
    
    

