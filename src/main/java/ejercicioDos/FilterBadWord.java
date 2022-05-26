package ejercicioDos;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class FilterBadWord{

    private List<String> badWord= List.of("puto", "marica","gonorrea", "malparido", "imbecil", "idiota", "maldita",
            "pirobo", "hijueputa", "monda","zunga", "verga", "malparida", "Huevón", "bobo", "Imbécil"  );


    public void correctingWords(String phrase){
        List<String> words = List.of(phrase.split(" "));

        Flux.fromIterable(words)
                .map(word -> (badWord.contains(word)) ? "*****" : word)
                .collect(joining(" "))
                .subscribe(System.out::println);

    }
}
