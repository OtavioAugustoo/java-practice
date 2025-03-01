package operadores;

public class Operador1 {
    public static void main(String[] args){
        int numero = 5;
        numero = -numero;
        System.out.println(numero);
        numero = -numero;
        System.out.println(numero);
        // agora treinando repeticao
        while (numero < 10) {
            numero = numero + 1;
            System.out.println(numero);
            
        }
        // booleananos
        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);
        //ternarios
        int a, b;
        a = 10;
        b = 20;
        
        String resultado = a==b ?"verdadeiro" : "falso";
        System.out.println(resultado);
    
    }
}
