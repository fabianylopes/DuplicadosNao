import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("pera");
        fruits.add("uva");
        fruits.add("maçã");
        fruits.add("melancia");

        List<String> mFruits = new ArrayList<>();
        mFruits.add("melancia");
        mFruits.add("manga");
        mFruits.add("morango");
        mFruits.add("mamão");

        for (int i = 0; i < mFruits.size(); i++) {
            if (fruits.contains(mFruits.get(i))) {
                System.out.println(mFruits.get(i));
            }
        }
    }
}
