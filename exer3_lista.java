import java.util.Scanner;

public class exer3_lista {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        System.out.println("escreva primeiro número: ");
        int valor1 = entrada.nextInt();
        
        System.out.println("Escreva o segundo número: ");
        int valor2 = entrada.nextInt();

        double resultado = (valor1 * valor2);

        System.out.println("O resultado é: " + resultado);

        entrada.close();
    }
}
