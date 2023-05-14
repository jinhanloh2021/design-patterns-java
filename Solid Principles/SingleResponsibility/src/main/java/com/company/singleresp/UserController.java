package com.company.singleresp;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

//Handles incoming JSON requests that work on User resource/entity
//Not suppose to have business logic. Controller responsibility is routing. 
public class UserController {
    // Store used by service
    private UserPersistenceService persistentService = new UserPersistenceService();

    // Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        User user = mapper.readValue(userJson, User.class);
        UserValidator validator = new UserValidator();
        boolean isValid = validator.validateUser(user);

        if (!isValid) {
            return "Error";
        }
        persistentService.saveUser(user);
        return "SUCCESS";
    }

    // Validates the user object

}