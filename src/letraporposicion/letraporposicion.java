package letraporposicion;

import java.util.Scanner;

public class letraporposicion
{

	public static void main(String[] args)
	{
        final int FILAS = 3;
        final int COLUMNAS = 3;
        char matriz[][] = new char[FILAS][COLUMNAS];
        int matrizFinal[][] = new int[FILAS][COLUMNAS];

		Scanner teclado = new Scanner(System.in);

        int i,j;
        for(i=0;i<FILAS;i++)
        {
                for(j=0;j<COLUMNAS;j++)
                {
                        System.out.println("Dame el carácter ["+i+"]["+j+"]");
                        matriz[i][j] = teclado.nextLine().charAt(0);
                }
        }
        teclado.close();
        for(i=0;i<FILAS;i++)
        {
                for(j=0;j<COLUMNAS;j++)
                {
                        matrizFinal[i][j] = matriz[i][j]-96;
                }
        }
        for(i=0;i<FILAS;i++)
        {
                for(j=0;j<COLUMNAS;j++)
                {
                        System.out.print(matrizFinal[i][j]+"\t");
                }
                System.out.println();
        }
}
}
