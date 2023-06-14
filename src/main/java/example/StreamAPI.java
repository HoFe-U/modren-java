package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 설명작성란
 *
 * @author : 유호철
 * @since 1.0
 */
public class StreamAPI {
    public static void main(String[] args) {
        List<String> friends = new ArrayList<>();
        friends.add("Rap");
        friends.add("A");
        friends.add("B");

        List<String> a = Arrays.asList("Rap", "A", "B");
        a.add("asdf");
        a.add("asdff");
    }
}
