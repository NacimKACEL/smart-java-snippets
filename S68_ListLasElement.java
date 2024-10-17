import java.util.List;

interface S68_ListLasElement {

    static void main(String... args) {
        var list = List.of("nacim", "and","java");
        var last = list.getLast();
        System.out.println(last);
        System.out.println(list.size()-1);
    }
}
