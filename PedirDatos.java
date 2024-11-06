import java.util.Scanner;

public class PedirDatos {

    public static void main(String[] args) {
        
        var entrada = new Scanner(System.in);

        System.out.println("Ingresa la palabra numero 1");
        var palabra1 = entrada.nextLine();

        System.out.println("Ingresa la palabra numero 2");
        var palabra2 = entrada.nextLine();

        System.out.println("Ingresa la palabra numero 3");
        var palabra3 = entrada.nextLine();


        System.out.println(palabra1+" "+palabra2+" "+ palabra3);

        entrada.close();
    }
    
}
