package model;

public class Password {

    private int length;
    private boolean lowerCase;
    private boolean upperCase;
    private boolean numbers;
    private boolean specialCharacters;

    private String password;

    public Password(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isLowerCase() {
        return lowerCase;
    }

    public void setHaveLowerCase(boolean haveLowerCase) {
        this.lowerCase = haveLowerCase;
    }

    public boolean isUpperCase() {
        return upperCase;
    }

    public void setUpperCase(boolean haveUpperCase) {
        this.upperCase = haveUpperCase;
    }

    public boolean isNumbers() {
        return numbers;
    }

    public void setNumbers(boolean haveNumbers) {
        this.numbers = haveNumbers;
    }

    public boolean isSpecialCharacters() {
        return specialCharacters;
    }

    public void setSpecialCharacters(boolean haveSpecialCharacters) {
        this.specialCharacters = haveSpecialCharacters;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
