import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> pre = (i) -> ( i < 10);
        System.out.println(pre.test(8));
        System.out.println(pre.test(12));
        System.out.println(pre.negate().test(11));
    }
}
