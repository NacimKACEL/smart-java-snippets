interface S35_LinesString {
    static void main(String... args) {
        var result = """
                duke is nice
                java rocks
                james like duke
                """
                .lines()
                .filter(l -> l.contains("java"))
                .findAny()
                .orElse("not found");
        System.out.println(result);
    }

}
