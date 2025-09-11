package exercicies.section14.Ex01.model.exceptions;

public class DomainException extends Exception {
    private static final Long serialVersionUID = 1L;

    public DomainException(String message) {
      super(message);
    }
}
