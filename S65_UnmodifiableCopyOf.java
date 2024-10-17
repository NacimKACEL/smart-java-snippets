import java.util.ArrayList;
import java.util.List;

interface S65_UnmodifiableCopyOf {
    static void main(String... args) {
        var list = new ArrayList<>();
        list.add("duke");
        var ulist = List.copyOf(list);
        list.add("other");
        //ulist.add("java");  // immutable list
        System.out.println(ulist);
    }
}
