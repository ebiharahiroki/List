import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("りんご");
        names.add("みかん");
        names.add("ぶどう");
        for (String name : names) {
            if (name.equals("みかん"))
                System.out.println("私の好きな食べ物は" + name + "です");
        }
    }

}