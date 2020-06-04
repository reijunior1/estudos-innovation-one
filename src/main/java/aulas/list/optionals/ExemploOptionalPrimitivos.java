package aulas.list.optionals;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivos {
    public static void main(String[] args) {

        System.out.println("*** Valor inteiro opcional ***");
        OptionalInt.of(39).ifPresent(System.out::println);

        System.out.println("*** Valor decimal opcional ***");
        OptionalDouble.of(19.5).ifPresent(System.out::println);

        System.out.println("*** Valor longo opcional ***");
        OptionalLong.of(39L).ifPresent(System.out::println);
    }
}
