package es.unileon.prg.date;

public static void main(String args []){
	Date fecha = new Date(31,01,2015);
	System.out.println(fecha.isSameYear(2016));

	Date fecha2 = new Date(06,09,2000);
	System.out.println(fecha.isSameYear(fecha2));
}