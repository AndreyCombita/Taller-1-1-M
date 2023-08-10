
package calculadora2;

import java.util.Scanner;
import java.lang.math;
        


public class Calculadora2 {
    double sum;
    double res;
    double mult;
    double div;
    double sen;
    double cos;
    double tan;
    double raize;
    double iva;

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       int opc=0;
        Scanner in = new Scanner(System.in);
        for (;;){                 
            System.out.println("\tCalculadora\n\n"+ "1. Suma \n2. Resta"
                    + "\n3. Multiplicacion \n4. Division\n5. seno \n6.Coseno \n7.Raiz enesima"
+ "                 \n8. Raiz enesima \n9.Potencia enecima \n10.IVA");
            do{System.out.println("Digite una opcion 1-5");
            opc= in.nextInt();
            break;
            
            }while (opc < 0 || opc>10);
            switch(opc){
                case 1: break;
                case 2: break;
            }
            if (opc==1){
                System.out.println("Digite el primer numero");
                float a= in.nextInt();
                System.out.println("Digite el segundo numero");
                float b= in.nextInt();
                float sum = a+b;
                System.out.println("El resultado de la suma es:"+sum);
                
                
            }
            ;
            if (opc==5)
                break;
            }
            System.out.println("Finalizado");
    }
    
}
