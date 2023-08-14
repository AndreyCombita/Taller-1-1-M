
package calculadora2;

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
        System.out.println("Ingrese el radicando (el numero al que desee calcular la raiz):");
        this.num1=in.nextDouble();
        System.out.println("Ingrese el radical (la potencia por la cual desea sacar la raiz):");
        this.num2=in.nextDouble();
        if(this.num2<1){
            System.out.println("No es posible resolver esta operacion"
                    + "\n Error: no puede tener un radical menor o igual a 0");
        }else{
        double raize=Math.pow(this.num1, 1/this.num2);
        System.out.println("su resultado es igual a "+ raize);}
    }
    public void pote(){
        System.out.println("Ingrese el numero base:");
        this.num1=in.nextDouble();
        System.out.println("Ingrese la potencia a la que desea exponer:");
        this.num2=in.nextDouble();
        double pote=Math.pow(this.num1, this.num2);
        System.out.println("su resultado es igual a "+ pote);}
    
    public void iva (){
        System.out.println("Ingrese el numero al que le desea sacar el IVA:");
        this.num1=in.nextDouble();
        System.out.println("Ingrese el porcentaje del IVA");
        this.num2=in.nextDouble();
        if(this.num2<1){
            System.out.println("No es posible resolver esta operacion"
                    + "\n Error: no puede tener un porcentaje menor a 0");
        }else{
        double iva= this.num1*(this.num2/100);
        System.out.println("su resultado es igual a "+ iva);}}
        
//trigonometricas
        
    public void sen(){
        System.out.println("Ingrese el numero al que desea obtener el seno:");
        this.num1=in.nextDouble();
        double sen= Math.sin(this.num1);
        System.out.println("su resultado es igual a "+ sen);}
    public void cos(){
        System.out.println("Ingrese el numero al que desea obtener el coseno:");
        this.num1=in.nextDouble();
        double cos= Math.cos(this.num1);
        System.out.println("su resultado es igual a "+ cos);}
    public void tan(){
        System.out.println("Ingrese el numero al que desea obtener la tangente:");
        this.num1=in.nextDouble();
        double tan= Math.tan(this.num1);
        System.out.println("su resultado es igual a "+ tan);}
    
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
                            System.out.println("Finalizado")
                                    ;System.exit(i);
                    }
    }
    
        
        
    }
    
    
    

