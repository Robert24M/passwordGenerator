package Services;

public class RandomSupplierImplLowerCase implements RandomSupplier {
    @Override
    public Character getCharacter() {
        return (char) random.nextInt(97, 123);
    }
}
