import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class abc {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ni好");
        List<String> list2 = new ArrayList<>();
        list2 = list.stream().filter(x  -> x.contains("n"))
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}
