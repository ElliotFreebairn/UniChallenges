
import java.util.ArrayList;
import java.util.*;

public class MergeChallenge {

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        List<String> result = new ArrayList<>();

        a.add("X");
        a.add("Y");
        a.add("Z");

        b.add("P");
        b.add("Q");
        b.add("R");
        b.add("S");

        // x, p, y, q
        ListIterator<String> iterator = a.listIterator();
        while(iterator.hasNext()) {
            int index = iterator.nextIndex();
            result.add(iterator.next());
            result.add(b.get(index));
        }

        List<String> leftOver = new ArrayList<>();
        System.out.println(a.size() + " " + b.size() + " " + result.size());
        leftOver = b.subList(a.size(), b.size());

        Iterator<String> leftOverIterator = leftOver.listIterator();
        while(leftOverIterator.hasNext()) {
            result.add(leftOverIterator.next());
        }

        // -------------------------------------------------

        ListIterator<String> bIterator = b.listIterator();

        for(int i = 0; i < b.size(); i++) {
            System.out.println(b.get(i));
            if((i + 1) % 2 == 0) {
                b.remove(i);
            }
        }

        displayList(b);
        System.out.println();

        bIterator = b.listIterator();
        while(bIterator.hasNext()) {
            String word = bIterator.next();
            if(result.contains(word)) {
                result.remove(word);
            }
        }

        displayList(result);

    }

    public static void displayList(List<String> list) {
        for(String str : list) {
            System.out.println(str);
        }
        System.out.println();
    }
}

