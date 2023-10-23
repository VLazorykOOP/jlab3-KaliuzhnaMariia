import java.time.LocalTime;

public class Time extends Triad {
    public Time(int hour, int minute, int second) {
        super(hour, minute, second);
    }

    private LocalTime toLocalTime() {
        return LocalTime.of(a, b, c);
    }

    @Override
    public Time increment() {
        LocalTime rez = toLocalTime().plusMinutes(1);
        return new Time(rez.getHour(), rez.getMinute(), rez.getSecond());
    }

    @Override
    public boolean equals(Object obj) {
        Time time = (Time) obj;
        if (toLocalTime().isAfter(time.toLocalTime())) {
            return false;
        } else if (toLocalTime().isBefore(time.toLocalTime())) {
            return false;
        } else return true;
    }

    @Override
    public String toString() {
        return "Time: " +
                "hour=" + a +
                ", minute=" + b +
                ", second=" + c;
    }
}
