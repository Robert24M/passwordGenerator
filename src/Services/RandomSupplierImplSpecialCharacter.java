package Services;

public class RandomSupplierImplSpecialCharacter implements RandomSupplier {
    @Override
    public Character getCharacter() {
        int set = random.nextInt(4);

        return (char) switch (set) {
            case 0 -> random.nextInt(32, 48);
            case 1 -> random.nextInt(58, 65);
            case 2 -> random.nextInt(91, 97);
            case 3 -> random.nextInt(123, 127);
            default -> throw new IllegalStateException("Unexpected value: " + set);
        };
    }
}
