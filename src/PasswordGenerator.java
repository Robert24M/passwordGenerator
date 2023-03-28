import builders.PasswordBuilder;
import model.Password;

public abstract class PasswordGenerator {

    private static final PasswordBuilder passwordBuilder = new PasswordBuilder();

    public static Password generatePassword(int length, boolean haveLowerCase, boolean haveUpperCase,
                                            boolean haveNumbers, boolean haveSpecialCharacters) {

        if (length < 6) {
            length = 6;
        }
        if (length > 30) {
            length = 30;
        }
        Password password = new Password(length);
        password.setHaveLowerCase(haveLowerCase);
        password.setUpperCase(haveUpperCase);
        password.setNumbers(haveNumbers);
        password.setSpecialCharacters(haveSpecialCharacters);

        passwordBuilder.buildPassword(password);

        return password;
    }

    public static Password generatePassword() {
     return generatePassword(16, true,true,true,true);
    }
}
