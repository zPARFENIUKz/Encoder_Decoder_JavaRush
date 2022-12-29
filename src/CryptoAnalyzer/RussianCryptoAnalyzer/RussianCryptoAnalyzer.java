package CryptoAnalyzer.RussianCryptoAnalyzer;

import CryptoAnalyzer.CryptoAnalyzer;
import CryptoAnalyzer.CryptoAnalyzerExceptions.*;

import java.io.IOException;
import java.nio.file.Files;
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
    }

    @Override
    public void encode(Path src, Path dest, int key) {
        validateFiles(src, dest);
        //if (key < 0) throw new CryptoAnalyzerInvalidKey("Invalid key was passed, it must be greater tha 0");
        final String sourceText;
        try {
             sourceText = new String(Files.readAllBytes(src));
        } catch (IOException e) {
            throw new CryptoAnalyzerIOException(e);
        }

        final String encodedText = ceasarChipherEncoder(sourceText, key);
        try {
            Files.write(dest, encodedText.getBytes());
        } catch (IOException e) {
            throw new CryptoAnalyzerIOException(e);
        }
    }

    private void validateFiles(Path src, Path dest) {
        if (src == null) throw new CryptoAnalyzerNullPointerException("src can't be null");
        if (dest == null) throw new CryptoAnalyzerNullPointerException("dest can't be null");
        if (src.toFile().isDirectory()) throw new CryptoAnalyzerPathToDirectory("src is path to directory, it must be a file");
        if (!src.toFile().exists()) throw new CryptoAnalyzerFileNotFoundException("src file doesn't exists");
        if (dest.toFile().isDirectory()) throw new CryptoAnalyzerPathToDirectory("dest is path to directory, it must be a file");
        if (dest.toFile().exists()) throw new CryptoAnalyzerFileAlreadyExistsException("dest file already exists");
    }

    private String ceasarChipherEncoder(String sourceText, int key) {
        final StringBuilder sb = new StringBuilder(sourceText.length());
        for (final Character c : sourceText.toCharArray()) {
            int charIndex = ENCODED_CHARACTERS.indexOf(c);
            // -1 if ENCODED_CHARACTERS doesn't contain c
            // therefore we don't need to encode it :)
            Character newCharacter;
            if (charIndex == -1) {
                newCharacter = c;
            } else {
                int pos = charIndex + key;
                if (pos > 0) {
                    newCharacter = ENCODED_CHARACTERS.get(pos % ENCODED_CHARACTERS.size());
                } else {
                    newCharacter = ENCODED_CHARACTERS.get(ENCODED_CHARACTERS.size() - (Math.abs(pos) % ENCODED_CHARACTERS.size()));
                }
            }
            sb.append(newCharacter);
        }
        return sb.toString();
    }

    @Override
    public void decode(Path src, Path dest, int key) {
        encode(src, dest, -key);
    }

    @Override
    public boolean decodeBrutForce(Path src, Path dest, int minKey, int maxKey) {
        validateFiles(src, dest);
        if (minKey >= maxKey) throw new CryptoAnalyzerInvalidKey("minKey must be less than maxKey");
        final String sourceText;
        try {
             sourceText = new String(Files.readAllBytes(src));
        } catch (IOException e) {
            throw new CryptoAnalyzerIOException(e);
        }

        for (int key = minKey; key <= maxKey; ++key) {
            final String decoded = ceasarChipherEncoder(sourceText, key);
            if (isCorrectText(decoded)) {
                try {
                    Files.write(dest, decoded.getBytes());
                } catch (IOException e) {
                    throw new CryptoAnalyzerIOException(e);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public void decodeStatisticAnalysis(Path src, Path example, Path dest) {

    }
}
