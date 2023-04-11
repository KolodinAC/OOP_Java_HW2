public class Pike extends Fish implements Sweemable{


    public Pike(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Рыбу";
    }

    @Override
    public int sweemSpeed() {
        return 20;
    }

    @Override
    public String speak() {
        return "Бульк";
    }
}
