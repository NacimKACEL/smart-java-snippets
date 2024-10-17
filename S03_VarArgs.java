interface S03_VarArgs {
    static void hello(String... messages) {
        for (var message: messages) {
            System.out.println(message);
        }
    }

    static void main (String... args) {
        S03_VarArgs.hello("hey", "nacim", "java");
        S03_VarArgs.hello("is", "working");
        S03_VarArgs.hello(new String[] {"is", "always", "working"});
    }
}
