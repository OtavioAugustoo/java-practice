public class SwitchCase {
    public static void main(String[] args) {
        String sigla ="PR";

        switch (sigla){
            case "RJ":
                System.out.println("Rio de Janeiro");
                break;
            case "SP":
                System.out.println("São Paulo");
                break;
            case "MG":
                System.out.println("Minas Gerais");
                break;
            case "PR":
                System.out.println("Paraná");
                break;
            default:
                System.out.println("Estado não encontrado");
        }
    }
}
