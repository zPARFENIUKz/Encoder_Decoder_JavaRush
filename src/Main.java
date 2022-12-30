import CryptoAnalyzer.CryptoAnalyzer;
import CryptoAnalyzer.RussianCryptoAnalyzer.RussianCryptoAnalyzer;

import java.nio.file.Path;

public class Main {
    private static final Path SRC_PATH = Path.of("src\\Files\\src.txt");
    private static final Path DEST_PATH = Path.of("src\\Files\\dest.txt");
    private static final Path EXAMPLE_PATH = Path.of("src\\Files\\example.txt");
    private static final Path DECODED_PATH = Path.of("src\\Files\\decoded.txt");
    private static final int KEY = 73;
    public static void main(String[] args) {
        CryptoAnalyzer analyzer = new RussianCryptoAnalyzer();
        analyzer.encode(SRC_PATH, DEST_PATH, KEY);
        int decodedKey = analyzer.decodeStatisticAnalysis(DEST_PATH, EXAMPLE_PATH, DECODED_PATH);
        System.out.println(decodedKey);
        //int brutForcedKey = analyzer.decodeBrutForce(DEST_PATH, DECODED_PATH, -50, 150);
        //System.out.println(brutForcedKey);
    }
}
