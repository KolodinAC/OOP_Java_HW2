public class Roach extends Fish implements Sweemable{


    public Roach(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Планктон";
    }

    @Override
    public String speak() {
        return "Буль-буль";
    }

    @Override
    public int sweemSpeed() {
        return 10;
    }
}
