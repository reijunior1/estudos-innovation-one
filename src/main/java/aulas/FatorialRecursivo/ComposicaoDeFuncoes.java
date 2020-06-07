package aulas.FatorialRecursivo;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class ComposicaoDeFuncoes {
    public static void main(String[] args) {
        int valor = 30;
        UnaryOperator<Integer> retornarDobro = v -> v * 2;
        System.out.println((retornarDobro.apply(valor)));
        System.out.println(valor);
        }
    }

