package calculadora2;

import java.util.Scanner;


public class Calculadora2 {
   
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int opc=0;
        Scanner in = new Scanner(System.in);
        for (;;){
            Metodos M= new Metodos();
            System.out.println("\tCALCULADORA\n\n"+ "1. Suma\n2.Resta"
                    + "\n3.Multiplicacion \n4. Division\n5. sen \n6.Coseno \n7. Tangente"
                    + "\n8. Raiz enesima \n9. Potencia enesima \n10.IVA  \n11.Salir");
            do{System.out.println("Digite una opcion 1-11");
            opc= in.nextInt();
            break;
            
            }while (opc < 0 || opc>11);
            switch(opc){
                case 1:
                 M.suma();
                 break;
                case 2:
                 M.resta();
                 break;
                case 3:
                    M.multiplicaion();
                break;
                case 4:
                    M.division();
                break;
                case 5:
                    M.sen();
                break;
                case 6:
                    M.cos();
                break;
                case 7:
                    M.tan();
                break;
                case 8:
                    M.raize();
                break;
                case 9:
                    M.pote();
                break;
                case 10:
                    M.iva();
                break;
            }
            if (opc==11)
                break;
            }
            System.out.println("Finalizado");
    }
    
}
