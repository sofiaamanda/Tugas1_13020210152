/* NIM : 13020210152 */
/* Nama : Sofia Amanda */
/* Hari/tanggal : kamis, 09/03/2023 */

import java.util.Scanner;

/* contoh membaca integer menggunakan class Scanner */
public class BacaData {
	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* kamus */
		int a;
		Scanner masukan;
		/* program */
		System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
		masukan = new Scanner(System.in);
		a = masukan.nextInt(); /* coba ketik : 
Apa akibatnya ?*/
		System.out.print ("Nilai yang dibaca : "+ a);

	}
}

