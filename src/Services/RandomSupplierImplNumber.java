package Services;

public class RandomSupplierImplNumber implements RandomSupplier {

    @Override
    public Character getCharacter() {
            return (char) random.nextInt(48, 58);
    }
}
