package calculadora2;

import java.util.Scanner;


public class Calculadora2 {
    double num1;
    double num2;
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int opc=0;
        Scanner in = new Scanner(System.in);
        for (;;){                 
            System.out.println("\tCALCULADORA\n\n"+ "1. Suma\n2.Resta"
                    + "\n3.Multiplicacion \n4. Division\n5. sen \n6.Coseno \n7. Tangente"
                    + "\n8. Raiz enesima \n9. Potencia enesima \n10.IVA  \n11.Salir");
            do{System.out.println("Digite una opcion 1-11");
            opc= in.nextInt();
            break;
            
            }while (opc < 0 || opc>11);
            switch(opc){
                case 1: break;
                case 2: break;
            }
            if (opc==11)
                break;
            }
            System.out.println("Finalizado");
    }
    
}
