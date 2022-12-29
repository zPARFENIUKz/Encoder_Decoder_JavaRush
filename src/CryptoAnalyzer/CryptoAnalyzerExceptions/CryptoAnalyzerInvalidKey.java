package CryptoAnalyzer.CryptoAnalyzerExceptions;

public class CryptoAnalyzerInvalidKey extends RuntimeException {
    public CryptoAnalyzerInvalidKey() {
    }

    public CryptoAnalyzerInvalidKey(String message) {
        super(message);
    }

    public CryptoAnalyzerInvalidKey(String message, Throwable cause) {
        super(message, cause);
    }

    public CryptoAnalyzerInvalidKey(Throwable cause) {
        super(cause);
    }
}
