package org.example;

import org.passay.CharacterRule;
import org.passay.PasswordGenerator;

import java.util.List;

public class CorrectPasswordGenerator implements PasswordGeneratePolicy {
    @Override
    public String generatePassword() {
        return "aaaabbbbcc";
    }
}
