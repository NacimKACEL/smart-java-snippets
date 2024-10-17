interface S81_IsLowerCase {
    static void main(String... args) {
        var isLowerCase = "duke".chars()
            .allMatch(Character::isLowerCase);
        
        System.out.println(isLowerCase);
    }
}
