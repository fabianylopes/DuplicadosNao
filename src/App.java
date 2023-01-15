import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("pera", "uva", "maçã", "melancia");
        List<String> mFruits = Arrays.asList("melancia", "manga", "morango", "mamão", "uva");

        for (int i = 0; i < mFruits.size(); i++) {
            if (fruits.contains(mFruits.get(i))) {
                System.out.println(mFruits.get(i));
            }
        }
    }
}
