public class Killer_whale extends Mammal implements Sweemable, Speakable{

    public Killer_whale(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Морские котики";
    }

    @Override
    public String speak() {
        return "Уууиии!";
    }

    @Override
    public int sweemSpeed() {
        return 30;
    }
}
