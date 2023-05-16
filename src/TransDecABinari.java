import java.util.*;

public class TransDecABinari {
	public static String InvertirString(String stringOriginal) {
        String stringInvertido = "";
        for (int i = stringOriginal.length() - 1; i >= 0; i--)
            stringInvertido += stringOriginal.charAt(i);
        return stringInvertido;
    }
	// Decimal 2 numeros
	public static String Dec2Bin(int numDecimal){
		String numBinario = "";
		while (numDecimal > 0){
			numBinario += (numDecimal % 2);
			numDecimal /= 2;
		}
		numBinario=InvertirString(numBinario);
		return numBinario;
	}
	public static String Dec2Oct(int numDecimal){
		String numOctal = "";
		while (numDecimal > 0){
			numOctal += (numDecimal % 8);
			numDecimal /= 8;
		}
		numOctal=InvertirString(numOctal);
		return numOctal;
	}
	public static String Dec2Hex(int numDecimal){
		String numHexa = "";
		while (numDecimal > 0){
			switch (numDecimal % 16) {
				case 10:
					numHexa += "A";
					break;
				case 11:
					numHexa += "B";
					break;
				case 12:
					numHexa += "C";
					break;
				case 13:
					numHexa += "D";
					break;
				case 14:
					numHexa += "E";
					break;
				case 15:
					numHexa += "F";
					break;
				default:
					numHexa += (numDecimal % 16);
					break;
			}
			numDecimal /= 16;
		}
		numHexa=InvertirString(numHexa);
		return numHexa;
	}
	// numeros 2 decimal
	public static int Bin2Dec(String numBinario) {
        int numDecimal = 0;
        int base = 1;
        for (int i = numBinario.length() - 1; i >= 0; i--) {
            int digito = numBinario.charAt(i) - '0';
            numDecimal += digito * base;
            base *= 2;
        }
        return numDecimal;
    }
	public static int Oct2Dec(String numOctal) {
        int numDecimal = 0;
        int base = 1;
        for (int i = numOctal.length() - 1; i >= 0; i--) {
            int digito = numOctal.charAt(i) - '0';
            numDecimal += digito * base;
            base *= 8;
        }
        return numDecimal;
    }
	public static int Hex2Dec(String numHexadecimal) {
        int numDecimal = 0;
        int base = 1;
		int digito=0;
        for (int i = numHexadecimal.length() - 1; i >= 0; i--) {
			switch (numHexadecimal.charAt(i)) {
				case 'A':
				case 'a':
					digito = 10;
					break;
				case 'B':
				case 'b':
					digito = 11;
					break;
				case 'C':
				case 'c':
					digito = 12;
					break;
				case 'D':
				case 'd':
					digito = 13;
					break;
				case 'E':
				case 'e':
					digito = 14;
					break;
				case 'F':
				case 'f':
					digito = 15;
					break;
				default:
					digito = numHexadecimal.charAt(i) - '0';
					break;
			}
            numDecimal += digito * base;
            base *= 16;
        }
        return numDecimal;
    }
    //menu
	public static void DesplegarMenu() {
        System.out.println("---- MENÚ ----");
        System.out.println("1. Decimal to Binario");
        System.out.println("2. Decimal to Octal");
        System.out.println("3. Decimal to Hexadecimal");
        System.out.println("4. Binario to Decimal");
		System.out.println("5. Octal to Decimal");
		System.out.println("6. Hexadecimal to Decimal");
        System.out.println("7. Salir");
        System.out.print("Selecciona una opción: ");
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numDecimal;
		int opcion;
		String numOtro;
		//String numOtro;
		//System.out.println("algo");
		//numDecimal = sc.next();

		//System.out.println(Hex2Dec(numDecimal));
		do {
            DesplegarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el salto de línea después de leer el número

            switch (opcion) {
                case 1:
                    System.out.println("Decimal to Binario\n");
					System.out.println("Ingrese un decimal");
					System.out.print("Decimal:");
					numDecimal = sc.nextInt();
					System.out.println("Binario:"+Dec2Bin(numDecimal));
					System.out.println("\n\nPresiona cualquier tecla para continuar...");
        			sc.next();
                    break;
                case 2:
					System.out.println("Decimal to Octal\n");
					System.out.println("Ingrese un decimal");
					System.out.print("Decimal:");
					numDecimal = sc.nextInt();
					System.out.println("Octal:	"+Dec2Oct(numDecimal));
					System.out.println("\n\nPresiona cualquier tecla para continuar...");
        			sc.next();
                    break;
                case 3:
					System.out.println("Decimal to Hexa\n");
					System.out.println("Ingrese un decimal");
					System.out.print("Decimal:");
					numDecimal = sc.nextInt();
					System.out.println("Hexa:	"+Dec2Hex(numDecimal));
					System.out.println("\n\nPresiona cualquier tecla para continuar...");
        			sc.next();
                    break;
                case 4:
					System.out.println("Binario to Decimal\n");
					System.out.println("Ingrese un Binario");
					System.out.print("Binario:");
					numOtro = sc.nextLine();
					System.out.println("Decimal:"+Bin2Dec(numOtro));
					System.out.println("\n\nPresiona cualquier tecla para continuar...");
        			sc.next();
                    break;
				case 5:
					System.out.println("Octal to Decimal\n");
					System.out.println("Ingrese un Octal");
					System.out.print("Octal:");
					numOtro = sc.nextLine();
					System.out.println("Decimal:"+Oct2Dec(numOtro));
					System.out.println("\n\nPresiona cualquier tecla para continuar...");
        			sc.next();
                    break;
				case 6:
					System.out.println("Hexa to Decimal\n");
					System.out.println("Ingrese un Hexadecimal");
					System.out.print("Hexa:	");
					numOtro = sc.nextLine();
					System.out.println("Decimal:"+Hex2Dec(numOtro));
					System.out.println("\n\nPresiona cualquier tecla para continuar...");
        			sc.next();
                    break;
                case 8:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                    break;
            }
            System.out.println(); // Salto de línea para mayor legibilidad

        } while (opcion != 5);

        sc.close();
	}

}
