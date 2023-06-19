package com.coffeepoweredcrew.flyweight;

import com.coffeepoweredcrew.flyweight.ErrorMessageFactory.ErrorType;

public class Client {

    public static void main(String[] args) {
        SystemErrorMessage msg1 = ErrorMessageFactory().getInstance().getError(ErrorType.GenericSystemError);
        System.out.println(msg1.getText("4056"));
    }

}
