package poo;

import java.util.*;

public class Agencia {

	static Propiedad p1 = new Propiedad(1, 0);
	static Propiedad p2 = new Propiedad(0, 0);
	static Propiedad p3 = new Propiedad(1, 1);
	static Propiedad p4 = new Propiedad(0, 1);

	public static void main(String[] args) {
		int salir = 1;
		Scanner sc = new Scanner(System.in);

		do {
			int opcion = sc.nextInt();
			System.out.println("Es usted un propietario, ingrese 1.");
			System.out.println("Quiere arrendar, ingrese 2.");
			System.out.println("Quiere comprar, ingrese 3.");
			System.out.println("Quiere salir, ingrese 4");
			switch (opcion) {
			case 1:
				System.out.println("Bienvenido, por favor registrese");
				Cliente c1 = new Cliente(sc.nextLine(), sc.nextInt());
				System.out.println("si quiere vender ingrese 0-1, si quiere arrendar ingrese 1-0");
				Propiedad p5 = new Propiedad(sc.nextInt(), sc.nextInt());
				break;
			case 2:
				System.out.println("Que propiedad desea arrendar, ingrese");
				if (p1.getDispArrend() == 1);
				{
				System.out.println("Se ha generado un contrato de arrendamiento");
				}
				if (p1.getDispArrend() == 0) {
					System.out.println("la propiedad no está disponible");
				}
				break;
			case 3:
				System.out.println("Que propiedad desea comprar , ingrese");
				if (p1.getDispVent() == 1);{
					System.out.println("Se ha generado un contrato de arrendamiento");
				}
				if (p1.getDispVent() == 0) {
					System.out.println("la propiedad no está disponible");
				}
				break;
			case 4:
				salir = -1;
				break;

			}
		} while (salir != -1);
	}
}