package exercisesOnClass.time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            return;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59){
            return;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59){
            return;
        }
        this.second = second;
    }

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        if (this.second >= 60) {
            this.minute = this.minute + 1;
            this.second -= 60;
        }
        if (this.minute >= 60) {
            this.minute -= 60;
            this.hour += 1;
        }
        if (this.second < 0) {
            this.second += 60;
            this.minute -= 1;
        }
        if (this.minute < 0) {
            this.minute += 60;
            this.hour -= 1;
        }
        if (this.hour > 23) {
            this.hour = 0;
        }
        if (this.hour < 0) {
            this.hour = 23;
        }


        String s = String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
        return s;
    }

    public Time nextSecond() {
        this.second += 1;
        return this;
    }

    public Time previousSecond() {
        this.second -= 1;
        return this;
    }

}

class TestTime {
    public static void main(String[] args) {
        // Test constructors and toString()
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1);  // toString()

        // Test Setters and Getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);  // toString()
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

        // Test setTime()
        t1.setTime(23, 59, 58);
        System.out.println(t1);  // toString()

        // Test nextSecond();
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond());

        // Test previousSecond()
        System.out.println(t1.previousSecond());
        System.out.println(t1.previousSecond().previousSecond());
    }
}
