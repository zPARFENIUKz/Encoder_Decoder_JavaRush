package CryptoAnalyzer.CryptoAnalyzerExceptions;

public class CryptoAnalyzerPathToDirectory extends RuntimeException {
    public CryptoAnalyzerPathToDirectory() {
    }

    public CryptoAnalyzerPathToDirectory(String message) {
        super(message);
    }

    public CryptoAnalyzerPathToDirectory(String message, Throwable cause) {
        super(message, cause);
    }

    public CryptoAnalyzerPathToDirectory(Throwable cause) {
        super(cause);
    }
}
