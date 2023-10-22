import java.time.LocalDate;

public class DateI implements ITriad {
    private int year;
    private int month;
    private int day;

    public DateI(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private LocalDate toLocalDate() {
        return LocalDate.of(year, month, day);
    }

    @Override
    public DateI increment() {
        LocalDate rez = toLocalDate().plusDays(1);
        return new DateI(rez.getYear(), rez.getMonthValue(), rez.getDayOfMonth());
    }

    @Override
    public boolean equal(Object obj) {
        DateI date = (DateI) obj;
        return toLocalDate().isEqual(date.toLocalDate());
    }

    @Override
    public String Show() {
        return "Date: " +
                "year=" + year +
                ", month=" + month +
                ", day=" + day;
    }
}
