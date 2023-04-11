public class Platypus extends Mammal implements Walkable, Sweemable{
    public Platypus(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Ttt";
    }

    @Override
    public String feed() {
        return "Рыба, трава";
    }

    @Override
    public int runSpeed() {
        return 6;
    }

    @Override
    public int sweemSpeed() {
        return 10;
    }
}
