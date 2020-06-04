package aulas.list.optionals;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class ExemploOptionalsEstados {
    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Null = Não está presente"));

        Optional<String> emptyOptional = Optional.empty();


        System.out.println("Valor opcional que está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Empty = Não está presente"));



        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("Valor opcional que está presente");
        optionalString.ifPresent(System.out::println);

        System.out.println("Não opcional que lança erro NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("Erro = Não está presente"));

    }
}
