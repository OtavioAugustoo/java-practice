package EstruturasDeRepeticao;

public class ForArrays {
    public static void main(String[] args) {
        double[] notas = {9.9, 8.7, 7.2, 9.4};
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + " = " + notas[i]);
        }

        String familia[] = {"João", "Maria", "José"};
        for (int x=0; x < familia.length; x++) {
            System.out.println("Família " + (x + 1) + " = " + familia[x]);
            
        }
    }
}
