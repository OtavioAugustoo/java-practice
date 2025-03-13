package MSN;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMesenger msn = new MSNMesenger();

        msn.enviarMensagem("Oi, tudo bem?");
        msn.receberMensagem("Oi, tudo bem e você?");

        
    }
}
