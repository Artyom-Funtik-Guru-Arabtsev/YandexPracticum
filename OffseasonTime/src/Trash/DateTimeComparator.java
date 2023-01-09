package Trash;

import java.util.Comparator;

public class DateTimeComparator implements Comparator<DateTime> {

    @Override
    public int compare(DateTime dt1, DateTime dt2) {
        return dt1.year >= dt2.year
                && dt1.month >= dt2.month
                && dt1.day >= dt2.day
                && dt1.hours >= dt2.hours
                && dt1.minutes >= dt2.minutes
                && dt1.seconds >= dt2.seconds ? 1 : -1;
    }
}