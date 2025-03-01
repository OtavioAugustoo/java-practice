package metodos;

public class SmartTv {
    boolean ligada;
    int canal=1;
    int volume=25;
    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
    public void avancarCanal() {
        if (ligada) {
            canal++;
        }
    }
    public void voltarCanal() {
        if (ligada) {
            canal--;
        }
    }   
    public void aumentarVolume() {
        if (ligada) {
            volume++;
        }
    }
    public void diminuirVolume() {
        if (ligada) {
            volume--;
        }
    }
    public void escolherCanal(int canal) {
        if (ligada) {
            this.canal = canal;
        }
    }
}
