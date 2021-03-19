public class ContohTipeData{
	public static void main(String[] args) {
		char golonganDarah = 'A';
		byte jarak = (byte) 130;
		short jumlahPenduduk = 1025;
		double suhu = 60.50;
		double berat = 0.5467812345;
		long saldo = 150000000;
		int angka = 0x10;
		System.out.println("Golongan Darah\t: " + (byte) golonganDarah);
		System.out.println("Jarak\t\t: " + jarak);
		System.out.println("Jumlah penduduk\t: " + jumlahPenduduk);
		System.out.println("Suhu\t\t: " + suhu);
		System.out.println("Berat\t\t: " + (float) berat);
		System.out.println("Saldo\t\t: " + saldo);
		System.out.println("Angka\t\t: " + angka);
	}
}