package CryptoAnalyzer;

import java.nio.file.Path;

public interface CryptoAnalyzer {
    void encode(Path src, Path dest, int key);
    void decode(Path src, Path dest, int key);
    int decodeBrutForce(Path src, Path dest, int minKey, int maxKey);
    void decodeStatisticAnalysis(Path src, Path example, Path dest);

}
