package Services;

public class RandomSupplierImplUpperCase implements RandomSupplier {
    @Override
    public Character getCharacter() {
        return (char) random.nextInt(65, 91);
    }
}
