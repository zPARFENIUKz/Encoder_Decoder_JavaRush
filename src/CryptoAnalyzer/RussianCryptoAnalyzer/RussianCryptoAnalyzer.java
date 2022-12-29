package CryptoAnalyzer.RussianCryptoAnalyzer;

import CryptoAnalyzer.CryptoAnalyzer;
import CryptoAnalyzer.DecodeType.DecodeType;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class RussianCryptoAnalyzer implements CryptoAnalyzer {
    private static final String PUNCTUATION_CHARACTERS = " ,.?!-:;\"'";
    private static final List<Character> ENCODED_CHARACTERS;
    static {
        final int firstLetterIndex = (int) 'А';
        final int lastLetterIndex = (int) 'Я';
        ENCODED_CHARACTERS = new ArrayList<>(lastLetterIndex - firstLetterIndex);
        for (int i = firstLetterIndex; i <= lastLetterIndex; ++i) {
            ENCODED_CHARACTERS.add((char) i);
        }
        for (final int c : PUNCTUATION_CHARACTERS.toCharArray()) {
            ENCODED_CHARACTERS.add((char) c);
        }
        ENCODED_CHARACTERS.forEach(System.out::print);
    }

    @Override
    public void encode(Path src, Path dest, int key) {

    }

    @Override
    public void decode(Path scr, Path dest, int key) {

    }

    @Override
    public void decode(Path src, Path dest, DecodeType type) {

    }
}
