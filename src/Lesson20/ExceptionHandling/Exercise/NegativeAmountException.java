package Lesson20.ExceptionHandling.Exercise;

// Hvis beløbet er negativt
public class NegativeAmountException extends RuntimeException {
    public NegativeAmountException(String message) {
        super(message);
    }
}