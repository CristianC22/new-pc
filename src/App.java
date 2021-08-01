import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner lector = new Scanner(System.in);
             
        int numero1;
        int numero2;
        String operacion;
           
        System.out.println("Digite numero 1");
        numero1 = Integer.parseInt(lector.next());        
       
        System.out.println("Digite numero 2");
        numero2 = Integer.parseInt(lector.next());
       
        System.out.println("¿Que operacion quieres hacer?  \n "
                + "1. Suma \n 2. Resta \n 3. Multiplicación \n 4. División");
        operacion = lector.next();
           
        switch(operacion){
            case "1":
                System.out.println("Total: "+ (numero1 + numero2));
                break;
            case "2":
                System.out.println("Total: "+ (numero1 - numero2));
                break;
            case "3":
                System.out.println("Total: "+ (numero1 * numero2));
                break;
            case "4":
                if (numero2 == 0){
                    do {
                        System.out.println("No se puede dividir entre cero, digite otro numero");
                        numero2 = Integer.parseInt(lector.next());
                    } while(numero2 == 0);
                }
               
                System.out.println("Total: "+ (numero1 / numero2));
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }



}
