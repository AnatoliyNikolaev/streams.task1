import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Set<Integer> lens = new TreeSet<>();
        Set<Integer> sort = new TreeSet<>();
        for (int i = 0; i <= list.size() - 1; i++) {
            if (Math.signum(list.get(i)) == 1)
                lens.add(list.get(i));
        }
        for (int len : lens) {
            if (len % 2 == 0)
                sort.add(len);
        }
        for (int sor : sort) {
            if (sor % 2 == 0)
                System.out.println(sor);
        }
    }
}


