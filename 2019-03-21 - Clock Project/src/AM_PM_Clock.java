
public class AM_PM_Clock implements Clock{
	private int hour;
	private int minutes;
	private String timeOfDay;
	private final int MAXHOURS = 12;
	public AM_PM_Clock() {
		setHour(12);
		setMinutes(0);
		setTimeOfDay("AM");
	}
	
	public AM_PM_Clock(int hour, int minute, String timeOfDay) {
		setHour(hour);
		setMinutes(minute);
		setTimeOfDay(timeOfDay);
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
	
	public String getTimeOfDay() {
		return timeOfDay;
	}

	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
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
	
	public void resetTime(int hour, int minutes, String timeOfDay) {
		setMinutes(minutes);
		setHour(hour);
		setTimeOfDay(timeOfDay);
	}
	
	public void resetTime(int hour, int minutes) {
		setMinutes(minutes);
		setHour(hour);
	}
	
	public void timeOfDay() {
		if (timeOfDay.equals("AM"))
			setTimeOfDay("PM");
		else if (timeOfDay.equals("PM"))
			setTimeOfDay("AM");
	}

	public void normalizeTime() {
		//If minutes is greater than 60 add minutes/60 to the hour
		hour += minutes/60;
		if (hour==12) { timeOfDay(); }
		//minutes must be between 0 and 59
        minutes %= 60;
        //hours can't be over 12
        hour %= MAXHOURS;
        //hours can't be 0
        if (hour == 0) {
            setHour(MAXHOURS);
        }
	}
	
	public String toString() {
		String minutePart = ""+minutes;
		String hourPart = ""+hour;
		if (minutes<10) { minutePart = "0" + minutes; }
		if (hour<10) {hourPart = "0" + hour;}
		return hourPart+":"+minutePart+getTimeOfDay();
	}
}
