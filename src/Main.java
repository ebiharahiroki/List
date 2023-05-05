import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<java.lang.String> names = new ArrayList<>();
        names.add("りんご");
        names.add("みかん");
        names.add("ぶどう");
        for(java.lang.String l : names) {
            if (l.equals("みかん"))
                System.out.println("私の好きな食べ物は" + l + "です");
        }
    }

}