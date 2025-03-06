public class CondicaoTernaria {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSaque = 5;

        saldo = (valorSaque <= saldo) ? saldo - valorSaque : saldo;
        System.out.println("Saldo: " + saldo);

        int nota = 5;

        String resutaldo = (nota >= 7) ? "Aprovado" :"Reprovado";
        System.out.println(resutaldo); 
    }
}
