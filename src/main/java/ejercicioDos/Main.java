package ejercicioDos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite una frase con cochinadas");
        String frase = sc.nextLine();
        FilterBadWord frases = new FilterBadWord();
        frases.correctingWords(frase);

    }
}
