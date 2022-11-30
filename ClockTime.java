/**
 * Name:  Kyle Fletcher (fletcher)  <-- FILL THIS IN
 * Course:  CSCI-241 - Computer Science I
 * Section: 002
 * Assignment: 9
 * 
 * Project/Class Description <-- FILL THIS IN
 * Creates and compares times in two newly created clocks
 * 
 * Known Bugs:  none.
 */
import java.util.*;
public class ClockTime
{
    // instance variables 
    private int hour;
    private int minute;
    private int second;

    //-----------------------------------
    //Constructors
    //sets all instance variables to zero
    public ClockTime(){
        hour = 0; 
        minute = 0;
        second = 0;
    }
    //takes 3 integer parameters, holding the hour, minute and second 
    public ClockTime(int ho, int min, int sec){
        hour = ho;
        minute = min;
        second = sec;

    }
    //-----------------------------------

    //-----------------------------------
    //getters
    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }
    //-----------------------------------

    //-----------------------------------
    //setters
    public void setHour(int hou){
        hour = hou;
    }

    public void setMinute(int minu){
        minute = minu;
    }

    public void setSecond(int seco){
        second = seco; 
    }
    //-----------------------------------

    //-----------------------------------
    //building the strings
    public String toString(){
        String time = hour +":0"+ minute + ":0"+ second;   
        if (hour < 10 && minute < 10 && second < 10){
            time = "0" + hour +":0"+ minute + ":0"+ second;
        }
        
        return time;
    }

    public String toString12(){
        String amPm = " A.M.";
        if (hour > 12){
            amPm = " P.M.";
        }
        if (hour > 12){
            hour = hour - 12;
        }

        String time12 = hour +":"+ minute + ":"+ second + amPm;
        return time12;
    }
    //-----------------------------------
    //-----------------------------------
    //advance method
    public void advance(int inc){
        second = second + inc;
        int minInc = second / 60;
        second = second % 60;
        minute = minute + minInc;
        int hourInc = minute / 60;
        hour = hour + hourInc;
        minute = minute % 60;

    }

    public boolean equals(ClockTime clockA, ClockTime clockB){
        

        if (clockA.getHour() == clockB.getHour()){
              return true;
        } else {
            return false;
        }

    }

    
}
