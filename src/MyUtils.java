import java.util.ArrayList;

public class MyUtils<Type> {
    public void swapArrayElems(ArrayList<Type> ar, int indexFirst, int indexSecond) {
        try {
            if (ar.size() >= 2 && indexFirst != indexSecond) {
                Type temp = ar.get(indexSecond);
                ar.set(indexSecond, ar.get(indexFirst));
                ar.set(indexFirst, temp);
            } else {
                System.out.println("Не удалось поменять элементы местами");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Не удалось поменять элементы местами");
        }

    }

}
