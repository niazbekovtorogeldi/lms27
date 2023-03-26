import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Torogeldi");
        strings.add("Matmusa");
        strings.add("Manas");
        strings.add("Erjigit");
        strings.add("Anna");
        methods(strings);

    }

    public static <T> void methods(ArrayList<T> arrayList) {
        System.out.println("биринчи элемент :" + arrayList.get(0));
        System.out.println("экинчи элемент  :" + arrayList.get(4));
        System.out.println("все элементы" + arrayList);

    }
}