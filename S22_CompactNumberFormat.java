import java.text.NumberFormat;

interface S22_CompactNumberFormat {
    static void main(String... args) {
        var number = 10000;
        var f = NumberFormat.getCompactNumberInstance();
        var result = f.format(number);
        System.out.println(result);
    }

}
