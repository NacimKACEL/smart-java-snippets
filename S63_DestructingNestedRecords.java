import static java.lang.System.*;

interface S63_DestructingNestedRecords {
    
    record Runtime(int age, int weight) {}
    record Dev(String name, Runtime runtime) {}

    static void dispatch(Object instance) {
        switch (instance) {
            case Dev(var name, Runtime(var age, var weight)) -> System.out.println(name + age + weight);
            case String message -> System.out.println("->" + message);
            default -> System.out.println("unknown");
        }
    }
    static void main(String... args) {
        dispatch(new Dev("Nacim", new Runtime(25, 65)));
        dispatch("duke");
    }
}