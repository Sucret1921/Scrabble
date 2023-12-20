	
/*
	 *  OBJETIVO
	 *
		Obtener la mayor cantidad de puntos formando palabras en el
		tablero.
		
		ELEMENTOS DEL JUEGO
		
		1 tablero, 100 fichas de letras, 4 atriles, 1 bolsa de fichas, 1 reglamento.
		
		LETRAS
		
		Hay 98 fichas de letras con puntaje y 2 fichas en blanco sin valor
		numérico. Las fichas en blanco se pueden usar como cualquier
	    letra del abecedario y una vez que se utilizan, la letra represen-
	 *	tada no puede cambiar a lo largo del juego
	 *
	 */

public class Scrabble_main {

    private static final int FILAS = 15;
    private static final int COLUMNAS = 15;

    // Representación del tablero
    private static char[][] tablero = new char[FILAS][COLUMNAS];

    // Función para inicializar el tablero con espacios en blanco
    private static void inicializarTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    

    // Función para imprimir el tablero
    private static void imprimirTablero() {
        System.out.print("  ");
        for (int i = 0; i < COLUMNAS; i++) {
            System.out.print(" " + (char) ('A' + i) + " ");
        }
        System.out.println();

        for (int i = 0; i < FILAS; i++) {
        	System.out.print(i + 1);
        	if (i <= 8) {
        		System.out.print("  ");
        	}
        	if (i >= 9) {
        		System.out.print(" ");
        	}
        	
            for (int j = 0; j < COLUMNAS; j++) {
            	System.out.print("[" + tablero[i][j] + "]");
              
            }
            System.out.println();
        }
    }
    private static void llamarLetras() {
    	char [] vocales = {'a', 'e', 'i', 'o', 'u'}; 
    	char [] consonantes = {'q', 'w', 'r', 't', 'u','p', 's', 'd', 'f', 'g'}; 
    }
    public static void main(String[] args) {
     
  
    	inicializarTablero();
        imprimirTablero();
        

    }
}
