/* NIM : 13020210152 */
/* Nama : Sofia Amanda */
/* Hari/tanggal : Kamis, 09/03/2023 */

/* contoh pengoperasian variabel bertype dasar */

public class Oprator {

	public static void main(String[] args) {
		//	TODO Auto-generated method stub
		/* KAMUS */
			boolean Bool1, Bool2, TF;
			int i,j, hsl ;
			float x,y,res;
		/* algoritma */
			System.out.println ("silahkan baca teksnya dan tambahkan perintah program di bawah ini untuk menampilkan output program");
			
			Bool1 = true; Bool2 = false;
			TF = Bool1 && Bool2 ; /* Boolean AND */
			TF = Bool1 || Bool2 ; /* Boolean OR */
			TF = ! Bool1 ; 	/* NOT */
			TF = Bool1 ^Bool2; 	/* XOR */
			/* operasi numerik */
			i = 5; j = 2;
			hsl = i+j;
			hsl = i - j;
			hsl = i / j;
			hsl = i * j;
			hsl = i / j; /* pembagian bulat */
			hsl = i&j; /* sisa modulo */

			/* operasi numerik */
			x = 5 ; y = 5 ;
			res = x + y;
			res = x - y;
			res = x / y;
			res = x * y;
			/* operasi relasional numerik */
			TF = (i==j);
			TF = (i!=j);
			TF = (i < j);
			TF = (i > j);
			TF = (i <= j);
			TF = (i >= j);
			/* operasi relasional numerik */
			TF = (x != y);
			TF = (x < y);
			TF = (x > y);
			TF = (x <= y);
			TF = (x >= y);

			System.out.println("Nilai hs1 = " +hsl);
			System.out.println("Nilai res = " +res);
			System.out.println("Nilai tf = " + TF);
	}
}