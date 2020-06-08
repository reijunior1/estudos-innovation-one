package aulas.InterfacesFuncionais;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = (a,b) -> a+b;
        Calculo subt = (a,b) -> a-b;
        Calculo mult = (a,b) -> a*b;
        Calculo divi = (a,b) -> a/b;
        System.out.println(executarOperacao(soma, 17, 45));
        System.out.println(executarOperacao(subt, 22, 12));
        System.out.println(executarOperacao(mult, 10, 50));
        System.out.println(executarOperacao(divi, 20, 5));
    }

    public static int executarOperacao(Calculo calculo, int a , int b){

        return calculo.calcular(a,b);
    }
}

    interface Calculo{
        public int calcular(int a , int b);
}