package example.chpter12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 설명작성란
 *
 * @author : 유호철
 * @see
 * @since 1.0
 */
public class DateTimeFormatterEx {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.of(2014, 3, 18);
        String format = date1.format(formatter);
        LocalDate.parse(format, formatter);
    }
}
