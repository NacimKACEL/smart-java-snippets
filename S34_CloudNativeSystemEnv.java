interface S34_CloudNativeSystemEnv {
    static void main(String... args) {
        var home = System.getenv().get("JAVA_HOME");
        var homeOrDefault = System.getenv().getOrDefault("JAVA_", "/opt/homebrew/opt/openjdk");
        System.out.println(home);
        System.out.println(homeOrDefault);
    }
}
