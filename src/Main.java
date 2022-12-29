import CryptoAnalyzer.CryptoAnalyzer;
import CryptoAnalyzer.RussianCryptoAnalyzer.RussianCryptoAnalyzer;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Path SRC_PATH = Path.of("src\\Files\\src.txt");
    private static final Path DEST_PATH = Path.of("src\\Files\\dest.txt");
    private static final Path DECODED_PATH = Path.of("src\\Files\\decoded.txt");
    private static final int KEY = 463;
    public static void main(String[] args) {
        CryptoAnalyzer analyzer = new RussianCryptoAnalyzer();
        analyzer.encode(SRC_PATH, DEST_PATH, KEY);
        analyzer.decode(DEST_PATH, DECODED_PATH, KEY);
    }
}
