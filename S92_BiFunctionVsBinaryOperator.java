import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

// The difference is BinaryOperators are typed and BiFunctions are not

interface S92_BiFunctionVsBinaryOperator {
    static void main(String... args) {
        BinaryOperator<Integer> multi = (a,b) -> a * b;
        System.out.println(multi.apply(10, 2));

        BiFunction<Integer, Integer, Integer> multip = ( a, b) ->  a * b;
        System.out.println(multip.apply(10, 2));

    }
}
