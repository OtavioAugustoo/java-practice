package EstruturasDeRepeticao;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
                System.out.println("i = " + i);
                break;
            }
        }
        
        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
