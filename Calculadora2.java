package calculadora2;

import java.util.Scanner;


public class Calculadora2 {

    public static void main(String[] args) {
      int opc=0;
      
        Scanner in = new Scanner(System.in);
        for (;;){
            Metodos M= new Metodos();
            System.out.println("\n\tCALCULADORA\n\n"+ "1. Suma\n2.Resta"
                    + "\n3.Multiplicacion \n4. Division\n5. sen \n6.Coseno \n7. Tangente"
                    + "\n8. Raiz enesima \n9. Potencia enesima \n10.IVA  \n11.Salir");
            do{System.out.println("Digite una opcion 1-11");
            opc= in.nextInt();
            break;
            
            }while (opc < 0 || opc>11);
            switch(opc){
                case 1:
                    M.suma();
                    M.otra();                
                 break;
                case 2:
                    M.resta();
                    M.otra();
                 break;
                case 3:
                    M.multiplicaion();
                    M.otra();
                break;
                case 4:
                    M.division();
                    M.otra();
                break;
                case 5:
                    M.sen();
                    M.otra();
                break;
                case 6:
                    M.cos();
                    M.otra();
                break;
                case 7:
                    M.tan();
                    M.otra();
                break;
                case 8:
                    M.raize();
                    M.otra();
                break;
                case 9:
                    M.pote();
                    M.otra();
                break;
                case 10:
                    M.iva();
                    M.otra();
                break;
            }
            if (opc==11)
                break;
            }
            System.out.println("Finalizado");
    }
    
}
