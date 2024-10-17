import java.util.Scanner;

interface S84_ReadingIntStream {

    static void main(String... args) {
        try (var s = new Scanner(System.in)){
            while (s.hasNext()) {
                System.out.println("> " + s.nextInt());
            }
        }
    }
}
