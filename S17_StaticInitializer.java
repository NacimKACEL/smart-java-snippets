public class S17_StaticInitializer {
    static {
        System.out.println("s1");
    }
    static {
        System.out.println("s2");
    }

    public static void main(String... args) {
        System.out.println("In main ");
    }

}
