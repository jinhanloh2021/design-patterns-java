package com.coffeepoweredcrew.flyweight;

import java.util.Map;

// Implemented as a Singleton
//Flyweight factory. Returns shared flyweight based on key
public class ErrorMessageFactory {

    // This serves as key for getting flyweight instance
    public enum ErrorType {
        GenericSystemError, PageNotFoundError, ServerError
    }

    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

    public static ErrorMessageFactory getInstance() {
        return FACTORY;
    }

    private Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();

    private ErrorMessageFactory() {
        errorMessages.put(ErrorType.GenericSystemError,
                new SystemErrorMessage("A generic system error $errorCode occured.", "http://somedomain.com/help?"));
        errorMessages.put(ErrorType.PageNotFoundError,
                new SystemErrorMessage("A page not found error $errorCode occured.", "http://somedomain.com/help?"));
    }

    public SystemErrorMessage getError(ErrorType type) {
        return errorMessages.get(type);
    }

    public UserBannedErrorMessage getUserBannedMessage(String caseId) {
        return new UserBannedErrorMessage(caseId);
    }
}
