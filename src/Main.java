import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		String ruta = "usuarios.txt";
		File archivoUsuarios = new File(ruta);
		
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		String alias = "";
		
		leerArchivo(archivoUsuarios, empleados);
		
		do {
			mostrarMenu();
			opc=sn.nextInt();
			switch (opc) {
			case 1:
				numUsuariosTotales(empleados);
				break;
				
			case 2:
				numUsuariosHM(empleados);
				break;
				
			case 3:
				datosCasados(empleados);
				break;
				
			case 4:
				nombreApSaludEx(empleados);
				break;
				
			case 5:
				System.out.println("Introduce el alias:");
				alias=sc.nextLine();
				eliminarUsuario(alias, empleados);
				break;
				
			case 6:
				modificarDatos(empleados, sc, sn);
				break;
				
			case 7:
				System.out.println("Saliste del programa");
				break;

			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (opc!=7);

		escribirArchivo(archivoUsuarios, empleados);
	}
	
	public static void leerArchivo(File archivoUsuarios, ArrayList<Empleado> empleados) {
		if (archivoUsuarios.exists()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(archivoUsuarios));
				try {
					String linea = br.readLine();
					while (linea!=null) {
						String[] partes = linea.split(Pattern.quote(";"));
						boolean desempleado = false, fumador = false, disponible = false;
						double ahorros = 0;
						int hijos = 0;
						
						/* Si la condición se cumple, la variables pasan a ser verdaderas
						 * para después ser almacenadas en el constructor.
						 * (1 = true, 0 = false) 
						 */
						if (Integer.parseInt(partes[13])==1) {
							desempleado=true;
						}else if (Integer.parseInt(partes[23])==1) {
							fumador=true;
						}else if (Integer.parseInt(partes[33])==1) {
							disponible=true;
						}
						
						/* Si el campo esta vacío, inicializo las variables a 0 para
						 * introducirlas en el constructor y que no de error.
						 */
						if (partes[18].equalsIgnoreCase("")) {
							ahorros = 0;
						}else {
							ahorros = Double.parseDouble(partes[17].substring(0, partes[17].length()-1).replace(",", "."));
						}
						if (partes[12].equalsIgnoreCase("")) {
							hijos = 0;
						}else {
							hijos = Integer.parseInt(partes[12]);
						}
						Empleado nuevoEmpleado = new Empleado(partes[0], partes[1], partes[2], partes[3], partes[4],
								partes[5], partes[6], partes[7], partes[8], partes[9], partes[10], partes[11],
								hijos, desempleado, partes[14], partes[15], partes[16],
								Double.parseDouble(partes[17].substring(0, partes[17].length()-1).replace(",", ".")), 
								ahorros, Double.parseDouble(partes[19].replace(",", ".")), Double.parseDouble(partes[20].replace(",", ".")), 
								partes[21], partes[22], fumador, partes[24], partes[25],
								partes[26], partes[27], partes[28], partes[29], partes[30], partes[31], partes[32], disponible);
						empleados.add(nuevoEmpleado);
						linea = br.readLine();
					}
					br.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}else {
			try {
				archivoUsuarios.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void escribirArchivo(File archivoUsuarios, ArrayList<Empleado> empleados) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivoUsuarios, false));
			String linea = "";
			int desempleado = 0, fumador = 0, disponible = 0;
			for (int i=0; i < empleados.size(); i++) {
				if (empleados.get(i).isDesempleado()) {
					desempleado = 1;
				}else {
					desempleado = 0;
				}
				if (empleados.get(i).isFumador()) {
					fumador = 1;
				}else {
					fumador = 0;
				}
				if (empleados.get(i).isDisponible()) {
					disponible = 1;
				}else {
					disponible = 0;
				}
				linea = empleados.get(i).getAlias() + ";" + empleados.get(i).getApellidos() + ";" + empleados.get(i).getNombre() + ";" +
						empleados.get(i).getDireccion() + ";" + empleados.get(i).getPoblacion() + ";" + empleados.get(i).getTelefono() + ";" +
						empleados.get(i).getMovil() + ";" + empleados.get(i).getEmail() + ";" + empleados.get(i).getObservaciones() + ";" +
						empleados.get(i).getSexo() + ";" + empleados.get(i).getFechaNac() + ";" + empleados.get(i).getEstadoCivil() + ";" +
						empleados.get(i).getHijos() + ";" + desempleado + ";" + empleados.get(i).getProfesion() + ";" + 
						empleados.get(i).getNivelAcademico() + ";" + empleados.get(i).getLenguaUsual() + ";" +
						String.valueOf(empleados.get(i).getIngresosMensuales()).replace(".", ",") + "€" + ";" + 
						String.valueOf(empleados.get(i).getAhorros()).replace(".", ",") + "€" + ";" +
						String.valueOf(empleados.get(i).getPeso()).replace(".", ",") + ";" +
						String.valueOf(empleados.get(i).getAltura()).replace(".", ",") + ";" +
						empleados.get(i).getCabello() + ";" + empleados.get(i).getOjos() + ";" +
						fumador + ";" + empleados.get(i).getSalud() + ";" + empleados.get(i).getAficion1() + ";" + empleados.get(i).getAficion2() + ";" +
						empleados.get(i).getCaracteristica1() + ";" + empleados.get(i).getCaracteristica2() + ";" +
						empleados.get(i).getValora1() + ";" + empleados.get(i).getValora2() + ";" + empleados.get(i).getFobias() + ";" +
						empleados.get(i).getSexualidad() + ";" + disponible;
				bw.write(linea);
				if (empleados.size()-1!=i) {
					bw.newLine();
				}
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void mostrarMenu() {
		System.out.println("1. Mostrar por pantalla el Nº de usuarios totales.");
		System.out.println("2. Mostrar por pantalla el Nº de usuarios hombre y el nº de usuarios mujer.");
		System.out.println("3. Mostrar por pantalla los datos de los usuarios que estén casados.");
		System.out.println("4. Mostrar por pantalla el nombre y apellidos de los usuarios con salud “excelente”.");
		System.out.println("5. Eliminar un usuario por alias.");
		System.out.println("6. Modificar un dato de un usuario.");
		System.out.println("7. Salir");
	}
	
	public static void numUsuariosTotales(ArrayList<Empleado> empleados) {
		System.out.println("El número de usuarios totales es: " + empleados.size());
	}
	
	public static void numUsuariosHM(ArrayList<Empleado> empleados) {
		int contH = 0, contM = 0;
		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).getSexo().substring(1, empleados.get(i).getSexo().length()-1).equalsIgnoreCase("Hombre")) {
				contH++;
			}else {
				contM++;
			}
		}
		System.out.println("El número de usuarios hombres es: " + contH);
		System.out.println("El número de usuarios mujeres es: " + contM);
	}
	
	public static void datosCasados(ArrayList<Empleado> empleados) {
		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).getEstadoCivil().substring(1, empleados.get(i).getEstadoCivil().length()-1).equalsIgnoreCase("Casado/a")) {
				System.out.println(empleados.get(i));
			}
		}
	}
	
	public static void nombreApSaludEx(ArrayList<Empleado> empleados) {
		System.out.println("Usuarios con salud Excelente:");
		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).getSalud().substring(1, empleados.get(i).getSalud().length()-1).equalsIgnoreCase("Excelente")) {
				System.out.println(empleados.get(i).getNombre().substring(1, empleados.get(i).getNombre().length()-1) 
						+ " " + empleados.get(i).getApellidos().substring(1, empleados.get(i).getApellidos().length()-1));
			}
		}
	}
	
	public static void eliminarUsuario(String alias, ArrayList<Empleado> empleados) {
		boolean encontrado = false;
		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).getAlias().substring(1, empleados.get(i).getAlias().length()-1).equalsIgnoreCase(alias)) {
				empleados.remove(i);
				encontrado = true;
			}
		}
		if (encontrado == false) {
			System.out.println("No se ha encontrado a ese usuario en el archivo.");
		}
		
	}
	
	public static void modificarDatos(ArrayList<Empleado> empleados, Scanner sc, Scanner sn) {
		boolean encontrado = false, desempleado = false;
		int opc = 0, hijos;
		String poblacion, profesion, desemp, alias;
		System.out.println("Introduce el alias:");
		alias=sc.nextLine();
		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).getAlias().substring(1, empleados.get(i).getAlias().length()-1).equalsIgnoreCase(alias)) {
				encontrado = true;
				do {
					System.out.println("1. Hijos");
					System.out.println("2. Poblacion");
					System.out.println("3. Desempleado");
					System.out.println("4. Profesion");
					System.out.println("5. Salir");
					opc=sn.nextInt();
					switch (opc) {
					case 1:
						System.out.println("Introduce el número de hijos que tengas:");
						hijos=sn.nextInt();
						empleados.get(i).setHijos(hijos);
						break;
					case 2:
						System.out.println("Introduce tu población:");
						poblacion=sc.nextLine();
						empleados.get(i).setPoblacion(poblacion);
						break;
					case 3:
						System.out.println("¿Estas desempleado? (Si / No):");
						desemp=sc.nextLine();
						if (desemp.equalsIgnoreCase("Si")) {
							desempleado = true;
							empleados.get(i).setDesempleado(desempleado);
						}else {
							desempleado = false;
							empleados.get(i).setDesempleado(desempleado);
						}
						break;
					case 4:
						System.out.println("Introduce tu profesión:");
						profesion=sc.nextLine();
						empleados.get(i).setProfesion(profesion);
						break;
					case 5:
						System.out.println("Saliste del menú");
						break;
					default:
						System.out.println("Introduciste una opción errónea");
						break;
					}
				} while (opc!=5);
				System.out.println("Datos cambiados");
			}
		}
		if (encontrado == false) {
			System.out.println("No se ha encontrado a ese usuario en el archivo.");
		}
		
	}

}
