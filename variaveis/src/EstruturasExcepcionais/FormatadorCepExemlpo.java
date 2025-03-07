package EstruturasExcepcionais;

public class FormatadorCepExemlpo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23567890");
            System.out.println(cepFormatado);
        } catch (CepInvalido e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    static String formatarCep(String cep) throws CepInvalido {
        if (cep.length() != 8) 
            throw new CepInvalido(cep); 
        return "23.567-890";
    }   
}

