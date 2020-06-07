package aulas.LambdaNoJava;

public class aulaLambda {
    // criaçao da Lambda
    public static void main(String[] args) {
        Funcao colocarPrefixoSenhorNaString = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixoSenhorNaString.gerar("Reinaldo"));
    }
}

@FunctionalInterface
// criado Interface funcão para gerar o prefixo Sr. na String valor
interface Funcao {
    String gerar(String valor);
}
