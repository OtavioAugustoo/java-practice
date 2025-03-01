package metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada: "+ smartTv.ligada);
        System.out.println("Canal: "+ smartTv.canal);
        System.out.println("Volume: "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("novo status TV ligada? "+ smartTv.ligada);
        smartTv.desligar();
        System.out.println("novo status TV ligada? "+ smartTv.ligada);
        smartTv.ligar();
        smartTv.avancarCanal();
        System.out.println("Canal: "+ smartTv.canal);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume: "+ smartTv.volume);
        smartTv.escolherCanal(12);
        System.out.println("Canal: "+ smartTv.canal);
    }
}
