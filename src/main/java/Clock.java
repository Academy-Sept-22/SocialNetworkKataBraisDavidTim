import java.time.DateTimeException;
import java.util.Date;

public class Clock {
    Date date;

    public Clock(Date date) {
        this.date = date;
    }

    public long now(){
        return System.currentTimeMillis();
    }
}
