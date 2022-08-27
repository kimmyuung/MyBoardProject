package org.example;

public class PasswordValidator {

    public static final String PASSWROD_MUST_BE_AT_LEAST_8_AND_AT_UPPER_12_CHARACTERS_LONG
            = "Passwrod must be at least 8 and at upper 12 characters long";

    public static void validate(String password) {
        int length = password.length();
        if(length < 8 || length > 12) {
            throw new IllegalArgumentException(PASSWROD_MUST_BE_AT_LEAST_8_AND_AT_UPPER_12_CHARACTERS_LONG);
        }
    }

    public void validate2(PasswordGeneratePolicy passwordGeneratePolicy) {
        String password = passwordGeneratePolicy.generatePassword();

        int length = password.length();
        if (length < 8 || length > 12) {
            throw new IllegalArgumentException("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
        }
    }

}
