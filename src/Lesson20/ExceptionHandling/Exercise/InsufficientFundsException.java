package Lesson20.ExceptionHandling.Exercise;

// Hvis saldoen ikke rækker
public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}