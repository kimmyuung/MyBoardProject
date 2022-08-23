package org.example;

public class User {
    private String password;

    public void initPassword() {
        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String randomPa = randomPasswordGenerator.generatePassword();
        // 비밀번호는 최소 8자 이상 12자 이하
        if(randomPa.length() >= 8 && randomPa.length() <= 12) {
            this.password = randomPa;
        }
    }

    public String getPassword() {
        return password;
    }
}
