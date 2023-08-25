package calculadora2;

import java.util.Scanner;


public class Calculadora2 {

    public static void main(String[] args) {
      int opc=0;
      double num1, num2;
      
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
                    System.out.println("Ingrese el primer numero:");
                    num1=in.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    num2=in.nextDouble();
                    System.out.println("su resultado es igual a "+ M.suma(num1,num2));
                    M.otra(); 
                    
                 break;
                case 2:
                    System.out.println("Ingrese el primer numero:");
                    num1=in.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    num2=in.nextDouble();
                    System.out.println("su resultado es igual a "+ M.resta(num1,num2));
                    M.otra();
                 break;
                case 3:
                    System.out.println("Ingrese el primer numero:");
                    num1=in.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    num2=in.nextDouble();
                    System.out.println("su resultado es igual a "+ M.mult(num1,num2));
                     M.otra();
                break;
                case 4:
                    System.out.println("Ingrese el Divisor:");
                    num1=in.nextDouble();
                    System.out.println("Ingrese el Dividendo:");
                    num2=in.nextDouble();
                    if(num2==0){
                    System.out.println("no es posible resolver esta operacion"
                        + "\n Error: no se puede dividir entre 0");
                    }else{
                        System.out.println("su resultado es igual a "+ M.division(num1,num2));}
                    M.otra();
                break;
                case 5:
                    System.out.println("Lo desea calcular en:"
                    + "\n1.radianes"
                    + "\n2.angulos");
                    int j=in.nextInt();
                    switch (j){
                        case 1:
                            System.out.println("Ingrese el numero al que desea obtener el seno:");
                            num1=in.nextDouble();
                            System.out.println("su resultado es igual a "+ M.sen(num1));
                        break;
                        case 2:
                            System.out.println("Ingrese el angulo al que desea obtener el seno:");
                            num1=in.nextDouble();                                
                            System.out.println("su resultado es igual a "+ M.seno(num1));
                        break;}
                    M.otra();
                break;
                case 6:
                    System.out.println("Lo desea calcular en:"
                    + "\n1.radianes"
                    + "\n2.angulos");
                    int n=in.nextInt();
                    switch (n){
                        case 1:
                            System.out.println("Ingrese el numero al que desea obtener el coseno:");
                            num1=in.nextDouble();
                            System.out.println("su resultado es igual a "+ M.cos(num1));
                        break;
                        case 2:
                            System.out.println("Ingrese el angulo al que desea obtener el coseno:");
                            num1=in.nextDouble();                                
                            System.out.println("su resultado es igual a "+ M.coseno(num1));
                        break;}
                    M.otra();
                break;
                case 7:
                    System.out.println("Lo desea calcular en:"
                    + "\n1.radianes"
                    + "\n2.angulos");
                    int l=in.nextInt();
                    switch (l){
                        case 1:
                            System.out.println("Ingrese el numero al que desea obtener el tangente:");
                            num1=in.nextDouble();
                            System.out.println("su resultado es igual a "+ M.tan(num1));
                        break;
                        case 2:
                            System.out.println("Ingrese el angulo al que desea obtener el tangente:");
                            num1=in.nextDouble();                                
                            System.out.println("su resultado es igual a "+ M.tangente(num1));
                        break;}
                    M.otra();
                break;
                case 8:
                    System.out.println("Ingrese el radicando (el numero al que desee calcular la raiz):");
                    num1=in.nextDouble();
                    System.out.println("Ingrese el radical (la potencia por la cual desea sacar la raiz):");
                    num2=in.nextDouble();
                    if(num2<1){
                    System.out.println("No es posible resolver esta operacion"
                    + "\n Error: no puede tener un radical menor o igual a 0");
                    }else{
                     System.out.println("su resultado es igual a "+ M.raize(num1,num2));}
                    M.otra();
                break;
                case 9:
                    System.out.println("Ingrese el numero base:");
                    num1=in.nextDouble();
                    System.out.println("Ingrese la potencia a la que desea exponer:");
                    num2=in.nextDouble();
                    System.out.println("su resultado es igual a "+ M.pote(num1,num2));
                    M.otra();
                break;
                case 10:
                    System.out.println("Ingrese el numero al que le desea sacar el IVA:");
                    num1=in.nextDouble();
                    System.out.println("Ingrese el porcentaje del IVA");
                    num2=in.nextDouble();
                    if(num2<1){
                    System.out.println("No es posible resolver esta operacion"
                    + "\n Error: no puede tener un porcentaje menor a 0");
                    }else{
                    System.out.println("el IVA es de "+M.iva(num1,num2));
                    M.otra();
                break;
            }
            if (opc==11)
                break;
            }
            System.out.println("Finalizado");
        }
    }
    
}
