package es.unileon.prg.date;

/* Clase Date con los métodos dados en clase de teoría sobre sentencias de control */

public class Date {
	private int _day;
	private int _month;
	private int _year;


	public Date(int day, int month, int year){
		this._day = day;
		this._month = month;
		this._year = year;
	}

	public Date(){
		_day = 6;
		_month = 9;
		_year = 2010;
	}

	public Date(Date another){
		this._day = another.getDay();
		this._month = another.getMonth();
		this._year = another.getYear();
	}

	public int getDay(){
		return _day;
	}

	public int getMonth(){
		return _month;
	}

	public int getYear(){
		return _year;
	}

	public void setDay(int day){
		this._day = day;
	}

	public void setMonth(int month){
		this._month =  month;
	}

	public void setYear(int year){
		this._year = year;
	}

	public boolean isSameDay(Date other){
		if (this._day == other.getDay()) {
			return true;
		} else{
			return false;
		}
	}

	public boolean isSameMonth(Date other){
		if (this._month == other.getMonth()) {
			return true;
		} else{
			return false;
		}
	}

	public boolean isSameYear(Date other){
		if (this._year == other.getYear()) {
			return true;
		} else{
			return false;
		}
	}

	public boolean isSame(Date other){
		if (this.isSameDay(other) && this.isSameMonth(other) && this.isSameYear(other)) {
			return true;
		} else{
			return false;
		}
	}

	public boolean isSameDay_NonIf(Date other){
		return this._day == other.getDay();
	}

	public boolean isSameMonth_NonIf(Date other){
		return this._month == other.getMonth();
	}

	public boolean isSameYear_NonIf(Date other){
		return this._year == other.getYear();
	}

	public boolean isSame_NonIf(Date other){
		return this.isSameDay(other) && this.isSameMonth(other) && this.isSameYear(other);
	}

	public String getNameMonth(){
		String name_Month = null;

		switch(this._month){
			case 1:
				name_Month = "January";
				break;

			case 2:
				name_Month = "February";
				break;

			case 3:
				name_Month = "March";
				break;

			case 4:
				name_Month = "April";
				break;

			case 5:
				name_Month = "May";
				break;

			case 6:
				name_Month = "June";
				break;

			case 7:
				name_Month = "July";
				break;

			case 8:
				name_Month = "August";
				break;

			case 9:
				name_Month = "September";
				break;

			case 10:
				name_Month = "October";
				break;

			case 11:
				name_Month = "November";
				break;

			case 12:
				name_Month = "December";
				break;
		}

		return name_Month;
	}

	public boolean isDayOfTheMonthRight(){
		int numDaysOfTheMonth;

		switch(this._month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:

				break;

			case 2:

				break;

			case 4:
			case 6:
			case 9:
			case 11:

				break;
		}

	}

	public String season(){

	}
}
