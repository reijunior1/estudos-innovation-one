package aulas.list.optionals;

import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor opcional");
        // Estado do opcional true
        System.out.println(optionalString.isPresent());
        // Estado do opcional false
        System.out.println(optionalString.isEmpty());

        optionalString.ifPresent(System.out::println);

        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Valor nãp está presente"));

    }
}
