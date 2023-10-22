import java.time.LocalDate;
public class Date extends Triad{
    public Date(int year, int month, int day) {
        super(year, month, day);
    }

    private LocalDate toLocalDate() {
        return LocalDate.of(a, b, c);
    }

    @Override
    Date increment() {
        LocalDate rez = toLocalDate().plusDays(1);
        return new Date(rez.getYear(), rez.getMonthValue(), rez.getDayOfMonth());
    }

    @Override
    public boolean equals(Object obj) {
        Date date = (Date) obj;
        return toLocalDate().isEqual(date.toLocalDate());
    }

    @Override
    public String toString() {
        return "Date: " +
                "year=" + a +
                ", month=" + b +
                ", day=" + c;
    }
}
