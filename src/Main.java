import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    private static final Random random = new Random();

    public static void main(String[] args) {
        IntStream.range(0, 20).forEach(x -> System.out.println(
                PasswordGenerator.generatePassword(random.nextInt(),
                        random.nextBoolean(),
                        random.nextBoolean(),
                        random.nextBoolean(),
                        random.nextBoolean()
                ).getPassword()));

        System.out.println(PasswordGenerator.generatePassword().getPassword());
    }
}
