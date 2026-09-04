import java.util.Scanner;

public class exer11_lista {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int idadeAtual = anoAtual - anoNascimento;
        int idadeEm2030 = 2030 - anoNascimento;

        System.out.println("A idade atual da pessoa é: " + idadeAtual + " anos.");
        System.out.println("A idade dessa pessoa em 2030 será: " + idadeEm2030 + " anos.");

        scanner.close();
    }
}