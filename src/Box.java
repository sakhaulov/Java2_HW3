import Templates.Fruit;
import java.util.ArrayList;

public class Box<Type extends Fruit> {

    private ArrayList<Type> box;
    private float weight;

    public Box() {
        this.box = new ArrayList<>();
    }

    public void addContent(Type content) {
        this.box.add(content);
    }

    public void moveContent(Box box) {
        box.box.addAll(this.box);
        this.box.clear();
    }

    public float getWeight() {
        float weight = 0;
        int storedAmount = this.getStoredAmount();
        if (!(this.box.isEmpty())) {
            Fruit content = (Fruit) this.box.get(0);
            weight = storedAmount * content.getWeight();
        }
        return weight;
    }

    public int getStoredAmount() {
        int storedAmount = 0;
        if (!(this.box.isEmpty())) {
            for (Type type : this.box) {
                if (type != null) {
                    storedAmount += 1;
                }
            }
        }
        return storedAmount;
    }

    public boolean compareWeight(Box box) {
        return this.getWeight() == box.getWeight();
    }


}
