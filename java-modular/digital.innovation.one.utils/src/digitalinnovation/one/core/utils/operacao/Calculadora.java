package digitalinnovation.one.core.utils.operacao;


import digitalinnovation.one.core.utils.operacao.internal.Divisao;
import digitalinnovation.one.core.utils.operacao.internal.Multiplicacao;
import digitalinnovation.one.core.utils.operacao.internal.Subtracao;
import digitalinnovation.one.core.utils.operacao.internal.Soma;

public class Calculadora {

    private Soma soma;
    private Subtracao subtracao;
    private Multiplicacao multiplicacao;
    private Divisao divisao;

    public Calculadora(){

        soma = new Soma();
        subtracao = new Subtracao();
        multiplicacao = new Multiplicacao();
        divisao = new Divisao();
    }
    public  int soma(int a,int b){
        return soma.execute(a,b);
    }
    public int subt(int a, int b) {
        return subtracao.execute(a,b);
    }
    public int mult(int a, int b) {
        return multiplicacao.execute(a,b);
    }
    public int divi(int a, int b){
        return divisao.execute(a,b);
    }
}
