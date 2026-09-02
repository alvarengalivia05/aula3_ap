import java.util.Scanner;

public class exer4_lista {
    
    
    public static void main(String[] args) {
        
        Scanner entrada4 = new Scanner (System.in);

        System.out.println("escreva primeiro número: ");
        int valor1 = entrada4.nextInt();
        
        System.out.println("Escreva o segundo número: ");
        int valor2 = entrada4.nextInt();
        
        System.out.println("escreva primeiro número: ");
        int valor3 = entrada4.nextInt();
        
        System.out.println("Escreva o segundo número: ");
        int valor4 = entrada4.nextInt();

        int resultado = (valor1 + valor2 + valor3 + valor4);

        System.out.println("O resultado é: " + resultado);

        entrada4.close();
    }
}
