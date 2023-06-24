package nomina;

public class Main {

	public static void main(String[] args) {
		double precioHoraTrabajada=72.87;
		double precioHoraExtra=25.96;
		
		Empleado empleado1= new Empleado();
		empleado1.ingresaDatosPersonales();
		empleado1.ingresaSueldo(precioHoraTrabajada,precioHoraExtra);
		System.out.println("*******************");
		
		System.out.println("SUELDO BASE: "+empleado1.sueldo.calculaSueldoBase());
		System.out.println("DESCUENTO  : "+empleado1.sueldo.calculaDescuento());
		System.out.println("SUELDO TOTAL: "+empleado1.sueldo.calculaSueldoTotal());

	}

}
