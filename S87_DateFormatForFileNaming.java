import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

interface S87_DateFormatForFileNaming {
    static void main(String... args) {
        var date = LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(date);
    }
}
