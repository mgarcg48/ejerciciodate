public class Date(int dia, int mes, int anio) throws Excepcion1{

	anio=Tecaldo.readInteger();	

	String mens= new String Buffer();

	if (anio<0){
		mens.append("El año introducido es incorrecto.");
	} else {
		this.anio = anio;	
	}
	if (mens.length() != 0){
		throw ExcepcionDate(mens.toSring());
	}
	
	mes=Teclado.readInteger();

	if ((mes<0) && (mes>12){
		mens.append("El mes introducido es incorrecto.");
	} else {
		this.mes = mes;
	}
	if (mens.length() !=0){
		throw new ExcepcionDate(mens.toString());
	}	

	dia=Teclado.readInteger();

	if ((dia<0) && (dia>31)){
		mens.append("El día es incorrecto.");
	} else {
		this.dia = dia;
	}
	if (mens.length() !=0){
		throw new ExcepcionDate(mens.toString());
	}
	
	if ((mes==1) || (mes==3) || (mes==5) || (mes==7) || (mes==8) || (mes==10) || (mes==12)){
		dia=<31 && dia=>1;
	} else {
		mens.append("El mes intoducido anteriormente no tiene tal día");
	}
	if (mens.length() !=0){
		throw new ExcepcionDate(mens.toString());
	}
	
	if ((mes==4) || (mes==6) || (mes==9) || (mes==11)){
		dia=<30 && dia=>0;
	} else {
		mens.append("Eñ mes introducid anteriormente no tiene tal día.");
	}
	if (mens.length() !=0){
		throw new ExcepcionDate(mens.toString());
	}

	if (mes==2){
		dia=<28 && dia=>0;
	} else {
		mens.append("El mes introducido anteriormente no tiene tal día.");
	}
	if (mens.length() !=0){
		throw new ExcepcionDate(mens.toString());
	}
}
