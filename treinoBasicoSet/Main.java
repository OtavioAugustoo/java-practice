package treinoBasicoSet;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();
        
        // Adicionando convidados
        conjunto.adicionarConvidado("Alice", 101);
        conjunto.adicionarConvidado("Bob", 102);
        conjunto.adicionarConvidado("Charlie", 103);
        
        // Contando convidados
        conjunto.contarConvidados();
        
        // Removendo um convidado
        conjunto.removerConvidadoPorCodigoConvite(102);
        
        // Contando novamente
        conjunto.contarConvidados();
    }
}
