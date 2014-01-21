/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author panchal
 */
public class time {
    private int hour;
    private int minute;
    private int second;
    
    // First Constructor gets called when time object is created without any
    // arguments. As you see inside this constructor/method in turn its calling 
    // constructor again using this which takes 3 args. which is the last
    // constructor. This is true for infact all constructors below.
    // Overloaded Constructors
    public time () {
        this(0, 0, 0);
    }
    // This Constructor gets called when ojecte created with 1 arg.
    public time (int h) {
        this(h, 0, 0);
    }
    // This Constructor gets called when ojecte created with 2 args.
    public time (int h, int m) {
        this(h, m, 0);
    }
    // This Constructor gets called when ojecte created with 3 args. This in
    // intruns calls setTime function as sets those passed values.
    public time (int h, int m, int s) {
        setTime(h, m, s);
    }
    
    public void setTime (int h, int m, int s) {
        
        // below basically says, if hour range is not between those limits
        // hours should be by default to zero.
        hour =((h>=0 && h<24) ? h : 0);
        minute =((m>=0 && m<60) ? m : 0);
        second =((s>=0 && s<60) ? s : 0);
    }
    
    public String getMilitaryTime () {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
    public String getRegularTime () {
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour ==12) ? 12 : hour % 12), minute, second, (hour < 12 ? "AM" : "PM"));
    }
}
