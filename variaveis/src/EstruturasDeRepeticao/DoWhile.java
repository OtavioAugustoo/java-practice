package EstruturasDeRepeticao;

import java.util.Random;

public class DoWhile {
    
    public static void main(String[] args) {
        System.out.println("Discando...");
        do {
            System.out.println("Tentando contato...");
        } while (tocando());
        System.out.println("Atendeu!");        
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 0;
        System.out.println("Atendeu? "+atendeu);
        return ! atendeu;
    }
}
