public class S18_InitializersAndConstructors {

    public S18_InitializersAndConstructors() {
        System.out.println("parametterless");
    }

    public S18_InitializersAndConstructors(String name) {
        System.out.println(name);
    }

    {
        System.out.println("Shared code");
    }

    public static void main(String... args) {
        new S18_InitializersAndConstructors();
        new S18_InitializersAndConstructors("with parameters");
    }
}
