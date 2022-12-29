package CryptoAnalyzer.CryptoAnalyzerExceptions;

public class CryptoAnalyzerFileAlreadyExistsException extends RuntimeException {
    public CryptoAnalyzerFileAlreadyExistsException() {
    }

    public CryptoAnalyzerFileAlreadyExistsException(String message) {
        super(message);
    }

    public CryptoAnalyzerFileAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public CryptoAnalyzerFileAlreadyExistsException(Throwable cause) {
        super(cause);
    }
}
