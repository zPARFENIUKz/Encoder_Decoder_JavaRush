package CryptoAnalyzer.RussianCryptoAnalyzer;

import CryptoAnalyzer.CryptoAnalyzer;
import CryptoAnalyzer.CryptoAnalyzerExceptions.*;
import CryptoAnalyzer.DecodeType.DecodeType;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
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
            ENCODED_CHARACTERS.add((char) (i + 32));
        }
        for (final int c : PUNCTUATION_CHARACTERS.toCharArray()) {
            ENCODED_CHARACTERS.add((char) c);
        }
        ENCODED_CHARACTERS.forEach(System.out::print);
    }

    @Override
    public void encode(Path src, Path dest, int key) {
        if (src == null) throw new CryptoAnalyzerNullPointerException("src can't be null");
        if (dest == null) throw new CryptoAnalyzerNullPointerException("dest can't be null");
        if (src.toFile().isDirectory()) throw new CryptoAnalyzerPathToDirectory("src is path to directory, it must be a file");
        if (!src.toFile().exists()) throw new CryptoAnalyzerFileNotFoundException("src file doesn't exists");
        if (dest.toFile().isDirectory()) throw new CryptoAnalyzerPathToDirectory("dest is path to directory, it must be a file");
        if (dest.toFile().exists()) throw new CryptoAnalyzerFileAlreadyExistsException("dest file already exists");
        if (key < 0) throw new CryptoAnalyzerInvalidKey("Invalid key was passed, it must be greater tha 0");

    }

    @Override
    public void decode(Path scr, Path dest, int key) {

    }

    @Override
    public void decode(Path src, Path dest, DecodeType type) {

    }
}
