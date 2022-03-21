import Templates.Fruit;
import java.util.ArrayList;

public class Box<Type> {

    private ArrayList<Type> box;
    private float weight;

    public Box() {
        this.box = new ArrayList<>();
    }

    public void addContent(Type content) {
        this.box.add(content);
    }

    public void moveContent(Box box) {
        if (box.box.isEmpty() || (this.box.get(0).getClass().equals(box.box.get(0).getClass()))) {
            box.box.addAll(this.box);
            this.box.clear();
        }
    }

    public float getWeight() {
        float weight = 0;
        int size = this.getSize();
        if (!(this.box.isEmpty())) {
            Fruit content = (Fruit) this.box.get(0);
            weight = size * content.getWeight();
        }
        return weight;
    }

    public int getSize() {
        int size = 0;
        if (!(this.box.isEmpty())) {
            for (int i = 0; i < this.box.size(); i++) {
                if (this.box.get(i) != null) {
                    size += 1;
                }
            }
        }
        return size;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }


}
