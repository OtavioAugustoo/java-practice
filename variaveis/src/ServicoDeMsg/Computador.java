package ServicoDeMsg;

public class Computador {
    public static void main(String[] args) {
        ServicoMsgInstantanea smi= null;

        String appEscolhido="tlg";
        
        if (appEscolhido.equals("msn")){
            smi = new Msn();
        } else if (appEscolhido.equals("fb")){
            smi = new Facebook();
        } else if (appEscolhido.equals("tlg")){
            smi = new Telegram();
        }
        smi.enviarMensagem("Oi, tudo bem?");
        smi.receberMensagem("Oi, tudo bem e você?");
    }
}
