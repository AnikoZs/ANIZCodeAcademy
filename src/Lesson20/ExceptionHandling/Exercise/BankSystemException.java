package Lesson20.ExceptionHandling.Exercise;

// Hvis der sker en teknisk fejl i systemet
public class BankSystemException extends Exception {
    public BankSystemException(String message) {
        super(message);
    }
}