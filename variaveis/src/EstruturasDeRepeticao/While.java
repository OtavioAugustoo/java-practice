package EstruturasDeRepeticao;

public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            System.out.println("i = " + i);
            i++;
        }

        double mesada = 50;
        while (mesada >0) {
            Double valorDoce = 25.0;
            if (valorDoce> mesada)
                valorDoce = mesada - valorDoce;
            System.out.println("Doce do valor de " + valorDoce + " adicionar ao carrinho");
                mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("joaozinho gastou toda a mesada");

    }
}
