import java.util.stream.IntStream;

interface S79_AllEmojis {

    static void main(String... args) {
        System.out.println(Character.isEmoji(0));
        IntStream.range(0, Integer.MAX_VALUE)
                .filter(Character::isEmoji)
                .mapToObj(Character::toChars)
                .map(String::valueOf)
                .forEach(System.out::print);
    }
}
