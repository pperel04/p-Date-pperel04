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
}
