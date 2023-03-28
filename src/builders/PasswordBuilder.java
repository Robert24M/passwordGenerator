package builders;

import Services.*;
import model.Password;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PasswordBuilder {

    private final StringBuilder stringBuilder = new StringBuilder();
    private final List<Character> passwordCharactersList = new ArrayList<>();
    private final List<RandomSupplier> randomSuppliers = new ArrayList<>();

    private void createPasswordCharactersList(Password password){

        if (password.isLowerCase()) {
            RandomSupplier lowerCaseSupplier = new RandomSupplierImplLowerCase();
            randomSuppliers.add(lowerCaseSupplier);
            passwordCharactersList.add(lowerCaseSupplier.getCharacter());
        }
        if (password.isUpperCase()) {
            RandomSupplier upperCaseSupplier = new RandomSupplierImplUpperCase();
            randomSuppliers.add(upperCaseSupplier);
            passwordCharactersList.add(upperCaseSupplier.getCharacter());
        }
        if (password.isNumbers()) {
            RandomSupplier numberSupplier = new RandomSupplierImplNumber();
            randomSuppliers.add(numberSupplier);
            passwordCharactersList.add(numberSupplier.getCharacter());
        }
        if (password.isSpecialCharacters()) {
            RandomSupplier specialCharacterSupplier = new RandomSupplierImplSpecialCharacter();
            randomSuppliers.add(specialCharacterSupplier);
            passwordCharactersList.add(specialCharacterSupplier.getCharacter());
        }

        while (passwordCharactersList.size() < password.getLength()) {
            passwordCharactersList.add(randomSuppliers
                    .get(ThreadLocalRandom.current()
                    .nextInt(randomSuppliers.size()))
                    .getCharacter());
        }

        Collections.shuffle(passwordCharactersList);
    }

    public void buildPassword(Password password) {
        createPasswordCharactersList(password);

        passwordCharactersList.forEach(stringBuilder::append);
        password.setPassword(stringBuilder.toString());

        passwordCharactersList.clear();
        stringBuilder.setLength(0);
    }
}
