package org.example;

public class User {
    public String getPassword() {
        return password;
    }

    private String userId;
    private String name;
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {
        //RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String password = passwordGenerator.generatePassword();

        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */

        if (password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }
    }

    public User() {

    }

    public User(String userId, String name, String password) {
        this.userId = userId;
        this.name = name;
        this.password = password;
    }
}
