import  java.util.Scanner;

public class entrada1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        System.err.println("Digite o valor da primeira nota.");
        double nota1 = scanner.nextDouble();

        System.err.println("Digite o valor da segunda nota.");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("a média final é: " + media);

        scanner.close();

    }
    
}
