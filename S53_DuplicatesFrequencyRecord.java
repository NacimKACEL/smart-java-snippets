import java.util.List;
import static java.util.Collections.frequency;

interface S53_DuplicatesFrequencyRecord {

    static void main(String... args) {
        var numbers = List.of(1,2, 3,3,4,2);
        record Duplicate(int number, int frequency) {
            boolean isDuplicate(){
                return frequency > 1;
            }
        }

        var duplicates = numbers
            .stream()
            .map(n -> new Duplicate(n, frequency(numbers, n)))
            .filter(Duplicate::isDuplicate)
            .distinct()
            .toList();
        
        System.out.println(duplicates);
    }
}
