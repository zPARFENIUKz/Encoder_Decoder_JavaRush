package CryptoAnalyzer.CryptoAnalyzerExceptions;

public class CryptoAnalyzerFileNotFoundException extends RuntimeException {
    public CryptoAnalyzerFileNotFoundException() {
    }

    public CryptoAnalyzerFileNotFoundException(String message) {
        super(message);
    }

    public CryptoAnalyzerFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public CryptoAnalyzerFileNotFoundException(Throwable cause) {
        super(cause);
    }
}
