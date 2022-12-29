package CryptoAnalyzer.CryptoAnalyzerExceptions;

public class CryptoAnalyzerNullPointerException extends RuntimeException {
    public CryptoAnalyzerNullPointerException() {
    }

    public CryptoAnalyzerNullPointerException(String message) {
        super(message);
    }

    public CryptoAnalyzerNullPointerException(String message, Throwable cause) {
        super(message, cause);
    }

    public CryptoAnalyzerNullPointerException(Throwable cause) {
        super(cause);
    }
}
