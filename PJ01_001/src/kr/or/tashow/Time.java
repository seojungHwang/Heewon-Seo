package kr.or.tashow;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static kr.or.tashow.BikeService.rentList;

public class Time {
    Calendar startTime;
    Calendar endTime;
    SimpleDateFormat dateFormat;
    int diffHour;
    int diffMinute;

    public Time() {
        dateFormat = new SimpleDateFormat("HH:mm");
    }

    Calendar setStartTime (){
        startTime = Calendar.getInstance();
        System.out.println(dateFormat.format(startTime.getTime()));
        return startTime;
    }
    Calendar setEndTime (){
        endTime = Calendar.getInstance();
        System.out.println(dateFormat.format(endTime.getTime()));
        return endTime;
    }

    void inputStartTime(int index) { // 안쓰임..
        rentList.get(index).setStartTime(setStartTime());
    }
    void inputEndTime(int index) {
        rentList.get(index).setEndTime(setEndTime());
    }

    int getTime(Calendar startTime, Calendar endTime) {
        diffHour = endTime.get(Calendar.HOUR_OF_DAY) - startTime.get(Calendar.HOUR_OF_DAY);
        diffMinute = endTime.get(Calendar.MINUTE) - startTime.get(Calendar.MINUTE);
        if (diffMinute > 0) {
            return diffHour++;
        } else {
            return diffHour;
        }
    }

}