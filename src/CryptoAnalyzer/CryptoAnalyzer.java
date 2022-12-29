package CryptoAnalyzer;

import java.nio.file.Path;

public interface CryptoAnalyzer {
    void encode(Path src, Path dest, int key);
    void decode(Path src, Path dest, int key);
    boolean decodeBrutForce(Path src, Path dest, int minKey, int maxKey);
    boolean decodeStatisticAnalysis(Path src, Path example, Path dest);

}
