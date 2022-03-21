public class Main {

    public static void main(String[] args) {
        //Созадали коробки с фруктами
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBoxNew = new Box<>();
        Box<Orange> orangeBoxAnother = new Box<>();

        //Создали объекты фруктов
        Orange orange = new Orange();
        Apple apple = new Apple();

        //Заполняем коробки фруктами
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

        //Проверяем работу методов Box
        System.out.println("Вес первой коробки: " + orangeBox.getWeight() + "\n" +
                           "Вес второй коробки: " + appleBox.getWeight() + "\n" +
                           "Сравнили их вес, результат: " + orangeBox.compareWeight(appleBox) + "\n");

        orangeBox.moveContent(orangeBoxNew);
        System.out.println("Переместили содержимое первой коробки в пустую третью коробку \n" +
                           "Вес первой коробки: " + orangeBox.getWeight() + "\n" +
                           "Вес третьей коробки: " + orangeBoxNew.getWeight() + "\n" +
                           "Сравнили их вес, результат: " + orangeBox.compareWeight(orangeBoxNew) + "\n");

        System.out.println("Переместили содержимое третьей коробки в четвертую коробку с весом " + orangeBoxAnother.getWeight());
        orangeBoxNew.moveContent(orangeBoxAnother);
        System.out.println("Вес третьей коробки: " + orangeBoxNew.getWeight() + "\n" +
                           "Вес четвёртой коробки: " + orangeBoxAnother.getWeight() + "\n" +
                           "Сравнили их вес, результат: " + orangeBoxNew.compareWeight(orangeBoxAnother) + "\n");

    }
}
