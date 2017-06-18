package datetime;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class DateRangeTest {
    private DateRange range = new DateRange();

    @Test
    public void dateRange_oneWeekInDays() throws Exception {
        LocalDate now = LocalDate.now();
        LocalDate then = now.plusWeeks(1);

        List<LocalDate> dates = range.getDays_java9(now, then);

        assertEquals(7, dates.size());
        assertEquals(dates, range.getDays_java8(now, then));
    }

    @Test
    public void dateRange_oneYearInMonths() throws Exception {
        LocalDate now = LocalDate.now();
        LocalDate then = now.plusYears(1);

        List<LocalDate> dates = range.getMonths_java9(now, then);

        assertEquals(12, dates.size());
        assertEquals(dates, range.getMonths_java8(now, then));
    }

}