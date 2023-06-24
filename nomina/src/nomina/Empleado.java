package nomina;

import java.util.Scanner;

public class Empleado {
	private String nombre;
	private String puesto;
	public Sueldo sueldo=new Sueldo();
	
	public void ingresaDatosPersonales()
	{
		Scanner iEntrada=new Scanner(System.in);
		
		System.out.println("Ingrese un nombre:");
		nombre=iEntrada.nextLine();
		System.out.println("Ingrese un puesto:");
		puesto=iEntrada.nextLine(); 
	}
	
	public void ingresaSueldo(double $ht,double $hx)
	{
		sueldo.set$xHoraTrabajada($ht);
		sueldo.set$xHoraExtra($hx);
		sueldo.ingresaDatos();
	}

}
