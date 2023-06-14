package example.chpter10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Native API 를 고치면서 어떤식으로 나아지는지를 볼 수 있다.
 *
 * @author : 유호철
 * @since 1.0
 */
public class CurrentDSL {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(26, "Gwan"));
        people.add(new Person(27, "Hofe"));

        // 1. Collections.sort 그냥 사용
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        });

        // 2. lambda
        people.sort((p1, p2) -> p1.getAge() - p2.getAge());

        // 3. comparing 사용
        Collections.sort(people, Comparator.comparing(p -> p.getAge()));

        // 4. 메서드 참조까지 개선
        Collections.sort(people, Comparator.comparing(Person::getAge));

        // 5. 추가적인 조건들 적용 (역순)
        Collections.sort(people, Comparator.comparing(Person::getAge).reversed());

        // 6. 추가적인 조건들 (이름)
        Collections.sort(people, Comparator.comparing(Person::getAge)
            .thenComparing(Person::getName));

        //7. 마무리
        people.sort(Comparator.comparing(Person::getAge)
            .thenComparing(Person::getName));


    }
}