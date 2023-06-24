package nomina;

import java.util.Scanner;

public class Sueldo {
	private double sueldobase;
	private double descuento;	
	private double sueldoTotal;
	private double horasTrabajadas;
	private double horasExtra;
	private double $xHoraTrabajada;
	private double $xHoraExtra;	

	public double get$xHoraTrabajada() {
		return $xHoraTrabajada;
	}

	public void set$xHoraTrabajada(double $xHoraTrabajada) {
		this.$xHoraTrabajada = $xHoraTrabajada;
	}

	public double get$xHoraExtra() {
		return $xHoraExtra;
	}

	public void set$xHoraExtra(double $xHoraExtra) {
		this.$xHoraExtra = $xHoraExtra;
	}

	
	public void ingresaDatos()
	{
		Scanner iEntrada=new Scanner(System.in);
		
		System.out.println("Ingrese horas trabajadas:");
		horasTrabajadas=iEntrada.nextDouble();
		System.out.println("Ingrese horas extra:");
		horasExtra=iEntrada.nextDouble();
	}
	
	public double calculaSueldoBase()
	{
		sueldobase=(horasTrabajadas*$xHoraTrabajada)+(horasExtra*$xHoraExtra);
		return sueldobase;
	}
	
	public double calculaDescuento()
	{
		if(sueldobase<=2000.00)
		{
			descuento=sueldobase*0.16;
		}
		else
		{
			descuento=sueldobase*0.18;
		}
		
		return descuento;
	}
	
	public double calculaSueldoTotal()
	{
		sueldoTotal=sueldobase-descuento;
		return sueldoTotal;
	}

}
