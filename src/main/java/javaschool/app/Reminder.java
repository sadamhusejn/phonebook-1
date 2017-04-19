package javaschool.app;

import asg.cliche.Command;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reminder extends Note {
    private LocalDateTime time;

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString() + " " + time;
    }
    @Command
    public void setTime(String time){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm");
        this.time = LocalDateTime.parse(time,dtf);
    }

}

