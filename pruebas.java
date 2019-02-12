import java.util.Scanner;
public class pruebas{
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		
		//Declaracion de variables
		String Matricula;
		String Estudiante; 	
		
		int ASISTENCIA=0; 
		int PrimerParcial=0;
		int TrabajoPractico=0; 
		int ExamenFinal=0;
		int NOTA=0;
		int MatLongitud = 13; 
		int EstLongitud = 8;
		char Nl = ' ';
		System.out.println("                          UNIVERSIDAD DOMINICANA O&M                           ");
		System.out.println ("Departamento de registro" + "                              Reporte de calificaciones");
		System.out.print("--------------------------------------------------------------------------------\n");
		
		// Datos Constantes	
		System.out.print("Carrera.....: " + "Ingenieria en Sistemas\n");	
		System.out.print("Asignatura..: " + "PROGRAMACION ORIENTADA A OBJETO\n");
		System.out.print("Seccion.....: " + "0422\n");
		System.out.print("Horario.....:" + " Miercoles de 03:30 PM - 06:20 PM\n");
		System.out.print("Edificio....:" + " IV- 4ta. Planta. Aula: 30\n");
		System.out.print("Profesor....:" + " JOSE RAFAEL ROJAS\n");
		System.out.print("********************************************************************************\n");
		
		//Datos del estudiante
		System.out.print("Matricula...: ");
		Matricula = sc.nextLine();	
		
		while (MatLongitud != Matricula.length()) {
			System.out.println("Matricula incompleta. Volver a introducir\n");
			System.out.print("Matricula...:");
			Matricula = sc.nextLine();
			}
		
		System.out.print("Estudiante...: ");
		Estudiante = sc.nextLine();
		System.out.print("\n");
		
		while (Estudiante.length() <= EstLongitud){
			System.out.println("Por favor introducir nombre completo del estudiante\n");
			System.out.print("Estudiante...:");
			Estudiante = sc.nextLine();
			}
		
	
		
		 //Obtencion de calificaciones
		
		System.out.print("Introduzca las siguientes calificaciones\n\n");
		System.out.print("AS\t");
		ASISTENCIA = sc.nextInt();
		
		while (ASISTENCIA > 10){
			System.out.println("Calificacion dentro de el rango 0-20. Vuelva a introducir el valor\n");
			System.out.print("AS\t");
			ASISTENCIA = sc.nextInt();
			System.out.print("\n");
			} 
			
		System.out.print("PP\t");
		PrimerParcial = sc.nextInt();
		
		while (PrimerParcial>20) {
			System.out.println("Vuelva a digitar la calificacion\n");
			System.out.print("PP\t");
			PrimerParcial = sc.nextInt();
			System.out.print("\n");
			}
		System.out.print("TP\t");
		TrabajoPractico = sc.nextInt();

		while (TrabajoPractico > 20){
			System.out.println("Vuelva a digitar la calificacion\n");
			System.out.print("TP\t");
			TrabajoPractico = sc.nextInt();
			System.out.print("\n");
			}
		System.out.print("EF\t");
		ExamenFinal = sc.nextInt();
		
		while (ExamenFinal > 50){
			System.out.println("Vuelva a digitar la calificacion\n");
			System.out.print("EF\t");
			ExamenFinal = sc.nextInt();
			System.out.print("\n");
			}
		NOTA = ASISTENCIA + PrimerParcial + TrabajoPractico + ExamenFinal;
		
		if (NOTA>=90){
			Nl = 'A';
			}
			else if (NOTA>79){
				Nl = 'B';
				System.out.print(Nl);
				}
				else if (NOTA>74){
					Nl = 'C';
					}
					else if (NOTA>69){
						Nl='D';
						}
						else {
							Nl='F';
							}
					
		
		
		System.out.print("____________________________________________________\n");
		System.out.print("AS\t" + "PP\t" + "TP\t" + "EX\t" + "NOTA\t" + "NL\n");
		int array [];
		array = new int [5];
		
		char array2 [];
		array2 = new char[1];
		
		array [0] = ASISTENCIA;
		array [1] = PrimerParcial;
		array [2] = TrabajoPractico;
		array [3] = ExamenFinal;
		array [4] = NOTA;
		array2 [0]=Nl;
		System.out.print(array[0] + "\t" + array[1] + "\t" + array[2]+ "\t" + array[3] + "\t" + array[4] + "\t" + array2[0]);			
		
	}
}
