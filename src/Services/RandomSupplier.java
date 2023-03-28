package Services;

import java.security.SecureRandom;

public interface RandomSupplier {
    SecureRandom random = new SecureRandom();

    Character getCharacter();
}
