import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        ArbolBST arbol = new ArbolBST();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===========================================");
            System.out.println("  GanaderosCasanare S.A.S. - Inventario BST");
            System.out.println("===========================================");
            System.out.println("1. Insertar un nuevo animal");
            System.out.println("2. Modificar datos de un animal existente");
            System.out.println("3. Consultar datos de un animal escribe codigo");
            System.out.println("4. Listar inventario completo (recorrido inorden)");
            System.out.println("5. Salir");
            System.out.println("-------------------------------------------");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida. Ingrese un número del 1 al 5.");
                opcion = -1;
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Código de chapeta: ");
                    int codigo = Integer.parseInt(sc.nextLine().trim());
                    System.out.print("Raza: ");
                    String raza = sc.nextLine().trim();
                    System.out.print("Peso (kg): ");
                    double peso = Double.parseDouble(sc.nextLine().trim());
                    System.out.print("Edad (meses): ");
                    int edad = Integer.parseInt(sc.nextLine().trim());
                    arbol.insertar(codigo, raza, peso, edad);
                    System.out.println("Animal insertado correctamente.");
                    break;

                case 2:
                    System.out.print("Código a modificar: ");
                    int codMod = Integer.parseInt(sc.nextLine().trim());
                    System.out.print("Nuevo peso (kg): ");
                    double nuevoPeso = Double.parseDouble(sc.nextLine().trim());
                    System.out.print("Nueva edad (meses): ");
                    int nuevaEdad = Integer.parseInt(sc.nextLine().trim());
                    if (arbol.modificar(codMod, nuevoPeso, nuevaEdad))
                        System.out.println("Animal modificado correctamente.");
                    else
                        System.out.println("Código no encontrado.");
                    break;

                case 3:
                    System.out.print("Código a consultar: ");
                    int codBus = Integer.parseInt(sc.nextLine().trim());
                    NodoAnimal encontrado = arbol.buscar(codBus);
                    if (encontrado != null)
                        System.out.println(encontrado);
                    else
                        System.out.println("Animal no encontrado.");
                    break;

                case 4:
                    System.out.println("\n=== INVENTARIO COMPLETO ===");
                    arbol.recorrerInorden();
                    break;

                case 5:
                    System.out.println("Cerrando sistema. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Elija entre 1 y 5.");
            }

        } while (opcion != 5);

        sc.close();
    }
}