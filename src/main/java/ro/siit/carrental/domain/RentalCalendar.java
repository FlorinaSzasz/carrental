package ro.siit.carrental.domain;

/**
 * Created by Florina Szasz on 6/7/2017.
 */
public class RentalCalendar {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minutes;
    private String userID;
    private boolean pickUpTime;
    private boolean dropOffTime;

    public RentalCalendar(int year, int month, int day, int hour, int minutes, String userID,
                          boolean pickUpTime, boolean dropOffTime) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minutes = minutes;
        this.userID = userID;
        this.pickUpTime = pickUpTime;
        this.dropOffTime = dropOffTime;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getUserID() {
        return userID;
    }

    public boolean isPickUpTime() {
        return pickUpTime;
    }

    public boolean isDropOffTime() {
        return dropOffTime;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setPickUpTime(boolean pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public void setDropOffTime(boolean dropOffTime) {
        this.dropOffTime = dropOffTime;
    }
}

