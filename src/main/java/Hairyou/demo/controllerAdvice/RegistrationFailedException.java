package Hairyou.demo.controllerAdvice;

public class RegistrationFailedException extends RuntimeException {

    public RegistrationFailedException(String message) {
        super(message);
    }
}
