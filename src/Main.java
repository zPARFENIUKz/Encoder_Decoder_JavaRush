import CryptoAnalyzer.CryptoAnalyzer;
import CryptoAnalyzer.RussianCryptoAnalyzer.RussianCryptoAnalyzer;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Path SRC_PATH = Path.of("src\\Files\\src.txt");
    private static final Path DEST_PATH = Path.of("src\\Files\\dest.txt");
    public static void main(String[] args) {
        CryptoAnalyzer analyzer = new RussianCryptoAnalyzer();
        // key is 1 -> there must be all letters shifted by 1
        analyzer.encode(SRC_PATH, DEST_PATH, 1);
    }
}
