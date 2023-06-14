package example.chpter10;

/**
 * 사람 클래스
 *
 * @author : 유호철
 * @since 1.0
 */
public class Person {
    private Integer age;
    private String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
