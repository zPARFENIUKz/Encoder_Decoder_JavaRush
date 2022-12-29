package CryptoAnalyzer;

import CryptoAnalyzer.DecodeType.DecodeType;

import java.nio.file.Path;

public interface CryptoAnalyzer {
    void encode(Path src, Path dest, int key);
    void decode(Path src, Path dest, int key);
    void decode(Path src, Path dest, DecodeType type);
}
