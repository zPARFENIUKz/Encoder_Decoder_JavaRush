import CryptoAnalyzer.RussianCryptoAnalyzer.RussianCryptoAnalyzer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        int firstLetterIndex = (int) 'А';
//        int lastLetterIndex = (int) 'Я';
//        System.out.println(firstLetterIndex);
//        System.out.println(lastLetterIndex);
//
//        List<Character> alphabetRu = new ArrayList<>(lastLetterIndex - firstLetterIndex);
//        for (int i = firstLetterIndex; i <= lastLetterIndex; ++i) {
//            alphabetRu.add((char) i);
//        }
//        alphabetRu.forEach(System.out::print);
//        List<Character> allChars = new ArrayList<>(alphabetRu);
//        for (final int c : " ,.?!-:;\"'".toCharArray()) {
//            allChars.add((char) c);
//        }
//        allChars.forEach(System.out::print);
        new RussianCryptoAnalyzer();
    }
}
