/// Why because java cache internaly integer
interface S42_IntegerCaching {
    static void main(String... args) {
        var number = 128;
        var first = Integer.valueOf(number);
        var second = Integer.valueOf(number);

        if (first == second) {
            System.out.println("%1$d == %1$d".formatted(first));
        } else {
            System.out.println("%1$d != %1$d".formatted(first));
        }
    }
}
