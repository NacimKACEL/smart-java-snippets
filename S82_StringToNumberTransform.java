interface S82_StringToNumberTransform {
    static void main(String... args) {
        var number = "42".transform(Integer::parseInt);
        System.out.println(number + 1);
    }

}
