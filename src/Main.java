public class Main {

    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBoxNew = new Box<>();
        Box<Orange> orangeBoxAnother = new Box<>();

        Orange orange = new Orange();
        Apple apple = new Apple();

        Orange[] tempOrange = {orange, orange};
        Apple[] tempApple = {apple, apple, apple};

        for (Orange value : tempOrange) {
            orangeBox.addContent(value);
        }

        for (Apple value : tempApple) {
            appleBox.addContent(value);
        }

        for (Orange value : tempOrange) {
            orangeBoxAnother.addContent(value);
        }

        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox.getSize());
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox.getSize());
        System.out.println(orangeBox.compare(appleBox));
        orangeBox.moveContent(orangeBoxNew);
        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox.getSize());
        System.out.println(orangeBoxNew.getWeight());
        System.out.println(orangeBoxNew.getSize());
        orangeBoxNew.moveContent(orangeBoxAnother);
        System.out.println(orangeBoxNew.getWeight());
        System.out.println(orangeBoxNew.getSize());
        System.out.println(orangeBoxAnother.getWeight());
        System.out.println(orangeBoxAnother.getSize());
    }
}
