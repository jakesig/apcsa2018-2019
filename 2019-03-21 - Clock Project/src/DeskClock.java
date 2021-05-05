
public class DeskClock implements Clock {
	private int hour;
	private int minutes;
	private final int MAXHOURS = 12;
	public DeskClock() {
		setHour(12);
		setMinutes(0);
	}
	
	public DeskClock(int hour, int minute) {
		setHour(hour);
		setMinutes(minute);
	}
	
	public void addOneMinute() {
		minutes+=1;
		normalizeTime();
	}
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	public void addMinutes(int minutes) {
		this.minutes+=minutes;
		normalizeTime();
	}
	
	public void addTime(int hours, int minutes) {
		this.minutes+=minutes;
		this.hour+=hours;
		normalizeTime();
	}
	
	public void resetTime(int hour, int minutes) {
		setMinutes(minutes);
		setHour(hour);
	}

	public void normalizeTime() {
		//If minutes is greater than 60 add minutes/60 to the hour
		hour += minutes/60;
		//minutes must be between 0 and 59
        minutes %= 60;
        //hours can't be over 12
        hour %= MAXHOURS;
        //hours can't be 0
        if (hour == 0) 
            setHour(MAXHOURS);
	}
	
	public String toString() {
		String minutePart = ""+minutes;
		String hourPart = ""+hour;
		if (minutes<10) { minutePart = "0" + minutes; }
		if (hour<10) {hourPart = "0" + hour;}
		return hourPart+":"+minutePart;
	}
}
