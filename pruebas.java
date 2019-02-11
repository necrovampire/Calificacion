import java.util.Scanner;
public class pruebas{
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		//Declaracion de variables
		String Matricula;
		String Estudiante; 	
		int AS=0; //Asistencia
		int PP=0; //Primer parcial
		int TP=0; //Trabajo Practico
		int EF=0; //Examen final
		int NOTA=0; //Nota final
		int NL=0; // Nota literal
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
		System.out.print("Estudiante..: ");
		Estudiante = sc.nextLine();
		System.out.print("\n");
		//Obtencion de calificaciones
		System.out.print("Introduzca las siguientes calificaciones\n\n");
		System.out.print("AS\t");
		AS = sc.nextInt();
		while (AS > 10 || AS < 0){
			System.out.println("Vuelva a introducir la calificacion\n");
			System.out.print("AS\t");
			AS = sc.nextInt();
			System.out.print("\n");
			}
			
		System.out.print("PP\t");
		PP = sc.nextInt();
		while (PP>20) {
			System.out.println("Vuelva a digitar la calificacion\n");
			System.out.print("PP\t");
			PP = sc.nextInt();
			System.out.print("\n");
			}
		System.out.print("TP\t");
		TP = sc.nextInt();
		while (TP > 20){
			System.out.println("Vuelva a digitar la calificacion\n");
			System.out.print("TP\t");
			TP = sc.nextInt();
			System.out.print("\n");
			}
		System.out.print("EF\t");
		TP = sc.nextInt();
		while (EF > 50){
			System.out.println("Vuelva a digitar la calificacion\n");
			System.out.print("EF\t");
			EF = sc.nextInt();
			System.out.print("\n");
			}

	}
}
