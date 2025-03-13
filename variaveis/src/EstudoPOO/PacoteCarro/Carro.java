package EstudoPOO.PacoteCarro;

public class Carro extends Veiculo {


    public void ligar(){
        conferirGasolina();
        conferirCambio();
        System.out.println("Carro ligado");
        
    }

    private void conferirGasolina(){
        System.out.println("Gasolina ok");
    }
    private void conferirCambio(){
        System.out.println("Cambio em neutro");
    }
}
