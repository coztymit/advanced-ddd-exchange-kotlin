package pl.coztymit.exchange.account.domain.exception;

public class AccountAlreadyExistsException extends RuntimeException{

    public AccountAlreadyExistsException(String message) {
        super(message);
    }
}
