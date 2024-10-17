import java.util.stream.Stream;  

interface S49_SaySorry1000Times {

    static void main(String... args) {
        Stream.generate(() -> "Sorry guys")
            .limit(1001)
            .map( a -> "🌹" + a)
            .forEach(System.out::println);
    }

}
