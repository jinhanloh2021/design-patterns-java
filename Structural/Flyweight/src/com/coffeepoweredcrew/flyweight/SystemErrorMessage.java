package com.coffeepoweredcrew.flyweight;

//A concrete Flyweight. Instance is shared
public class SystemErrorMessage implements ErrorMessage {

    /** Intrinsic states, shareable. Doesn't change based on context. */
    // some error message $errorCode
    private String messageTemplate;
    // http://somedomain.com/help?error=
    private String helpUrlBase;

    public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }

    /**
     * @param code - extrinsic state given to us
     */
    @Override
    public String getText(String code) {
        return messageTemplate.replace("$errorCode", code) + helpUrlBase + code;
    }
}
