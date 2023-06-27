package example.chpter12;

import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

/**
 * 설명작성란
 *
 * @author : 유호철
 * @since 1.0
 */
public class NextWorking implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dow = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int datToAdd = 1;

        if(dow == DayOfWeek.FRIDAY){
            datToAdd = 3;
        }
        else if (dow == DayOfWeek.SATURDAY){
            datToAdd =2;
        }
        return temporal.plus(datToAdd, ChronoUnit.DAYS);
    }
}
