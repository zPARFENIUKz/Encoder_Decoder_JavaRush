package CryptoAnalyzer.CryptoAnalyzerExceptions;

public class CryptoAnalyzerStatisticAnalysisException extends RuntimeException {
    public CryptoAnalyzerStatisticAnalysisException() {
    }

    public CryptoAnalyzerStatisticAnalysisException(String message) {
        super(message);
    }

    public CryptoAnalyzerStatisticAnalysisException(String message, Throwable cause) {
        super(message, cause);
    }

    public CryptoAnalyzerStatisticAnalysisException(Throwable cause) {
        super(cause);
    }
}
