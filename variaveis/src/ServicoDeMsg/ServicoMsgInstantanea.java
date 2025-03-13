package ServicoDeMsg;

public class ServicoMsgInstantanea {
    public void enviarMensagem(String mensagem){
        validarConexaoInternet();
        salvarHistoricoMensagem();
        System.out.println("Mensagem enviada: " + mensagem);
    }
    
    public void receberMensagem(String mensagem){
        validarConexaoInternet();
        salvarHistoricoMensagem();
        System.out.println("Mensagem recebida: " + mensagem);
    }
    
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico de mensagens...");
    }

    private void validarConexaoInternet(){
        System.out.println("Validando conexão com a internet...");
    }
    
}
