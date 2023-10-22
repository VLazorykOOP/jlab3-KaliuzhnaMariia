import java.time.LocalTime;
public class TimeI implements ITriad{
    private int hour;
    private int minute;
    private int second;

    public TimeI(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private LocalTime toLocalTime(){
        return LocalTime.of(hour, minute, second);
    }

    @Override
    public TimeI increment() {
        LocalTime rez = toLocalTime().plusMinutes(1);
        return new TimeI (rez.getHour(), rez.getMinute(), rez.getSecond());
    }

    @Override
    public boolean equal(Object obj) {
        TimeI time = (TimeI) obj;
        if(toLocalTime().isAfter(time.toLocalTime())){return false;}
        else if (toLocalTime().isBefore(time.toLocalTime())) {return false;}
        else return true;
    }

    @Override
    public String Show() {
        return "Time: " +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second;
    }
}
