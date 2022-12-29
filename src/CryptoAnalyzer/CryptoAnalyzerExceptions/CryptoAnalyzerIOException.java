package CryptoAnalyzer.CryptoAnalyzerExceptions;

public class CryptoAnalyzerIOException extends RuntimeException {
    public CryptoAnalyzerIOException() {
    }

    public CryptoAnalyzerIOException(String message) {
        super(message);
    }

    public CryptoAnalyzerIOException(String message, Throwable cause) {
        super(message, cause);
    }

    public CryptoAnalyzerIOException(Throwable cause) {
        super(cause);
    }
}
