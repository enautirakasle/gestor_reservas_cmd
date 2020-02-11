package aplicacion;

import java.util.Scanner;

public class Main {

	//opciones menu principal
	private static final int GESTOR_CLIENTES = 1;
	private static final int GESTOR_RESERVAS = 2;
	
	//opciones menu gestor clientes
	private static final int CREAR_CLIENTE = 1;
	
	private static final int SALIR = 0;

	
	
	
	public static void main(String[] args) {
		int aukera;
		Scanner scan = null;
		
		do {
			menuPrincipal();

			aukera = Integer.parseInt(scan.nextLine());

			switch (aukera) {
			case GESTOR_CLIENTES:
				gestorClientes(scan);
				break;
				
			case GESTOR_RESERVAS:
				gestorReservas(scan);
				break;
	
			case SALIR:
				System.out.println("El programa se ha cerrado....");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}

		} while (aukera != SALIR);


	}
	
	private static void gestorReservas(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	private static void gestorClientes(Scanner scan) {
		int aukera;
		do {
			menuClientes();
			
			aukera = Integer.parseInt(scan.nextLine());

			switch (aukera) {
			
			case CREAR_CLIENTE:
				crearCliente(scan);
				break;
				
			case SALIR:
				System.out.println("El programa se ha cerrado....");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}

		} while (aukera != SALIR);
		
	}

	private static void crearCliente(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	public static void menuPrincipal(){
		System.out.println(GESTOR_CLIENTES + "- erabiltzaileak kudeatu");
		System.out.println(SALIR + "- salir");
	}
	
	public static void menuClientes(){
		System.out.println(CREAR_CLIENTE + "- erabiltzaileak kudeatu");
		System.out.println(SALIR + "- salir");
	}
	
	public static void menuHoteles(){
		
	}
	public static void menuReservas(){
		
	}

}
