package es.unileon.prg.date;

/* Clase Date con los métodos dados en clase de teoría sobre sentencias de control */

public class Date {
	private int day;
	private int month;
	private int year;


	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date(){
		day = 6;
		month = 9;
		year = 2010;
	}

	public Date(Date another){
		this.day = another.getDay();
		this.month = another.getMonth();
		this.year = another.getYear();
	}

	public int getDay(){
		return day;
	}

	public int getMonth(){
		return month;
	}

	public int getYear(){
		return year;
	}

	public void setDay(int day){
		this.day = day;
	}

	public void setMonth(int month){
		this.month =  month;
	}

	public void setYear(int year){
		this.year = year;
	}

	public boolean isSameDay(Date other){
		if (this.day == other.getDay()) {
			return true;
		} else{
			return false;
		}
	}

	public boolean isSameMonth(Date other){
		if (this.month == other.getMonth()) {
			return true;
		} else{
			return false;
		}
	}

	public boolean isSameYear(Date other){
		if (this.year == other.getYear()) {
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
		return this.day == other.getDay();
	}

	public boolean isSameMonth_NonIf(Date other){
		return this.month == other.getMonth();
	}

	public boolean isSameYear_NonIf(Date other){
		return this.year == other.getYear();
	}

	public boolean isSame_NonIf(Date other){
		return this.isSameDay(other) && this.isSameMonth(other) && this.isSameYear(other);
	}

	public String getNameMonth(){
		String name_Month = null;

		switch(this.month){
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
		

	}

	public String getSeason(){
		String season = null;

		switch(this.month){
			case 3:
			case 4:
			case 5:
			case 6:
				season = "Primavera";
			break;

			case 7:
			case 8:
			case 9:
				season = "Verano";
			break;

			case 10:
			case 11:
				season = "Otoño";
			break;

			case 12:
			case 1:
			case 2:
				season = "Invierno"; 
		}

		return season;
	}

	private int getNumDaysOfTheMonth(){
		int numDaysOfTheMonth = 0;

		switch(this.month){
			case 2:
				numDaysOfTheMonth = 28;
			break;

			case 4:
			case 6:
			case 9:
			case 11:
				numDaysOfTheMonth = 30;

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				numDaysOfTheMonth = 31;
		}
	}
}
