package EstruturasExcepcionais;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        try{

        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
        System.out.println("Qual é o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual seu sobrenome?");
        String sobrenome = scanner.nextLine();

        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Qual sua altura?");
        double altura = scanner.nextDouble();

        //imprimindo os dados
        System.out.println("Olá, me chamo " +nome.toUpperCase()+ " " +sobrenome.toUpperCase());
        System.out.println("Tenho "+ idade + " anos");
        System.out.println("Minha altura é " + altura + "m");
        scanner.close();
        }
        catch(InputMismatchException e){
            System.out.println("Erro: Digite um valor válido");
        }
    }
}
