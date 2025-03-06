public class Condicionais {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        double saldo= 25.0;
        double valorSaque = 5;

        if (valorSaque<=saldo){
            saldo = saldo - valorSaque;
            System.out.println("Saque realizado com sucesso!"+saldo);
        } else {
            System.out.println("Saldo insuficiente!"+ saldo);
            
        }
    }
}
