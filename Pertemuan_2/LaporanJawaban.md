# JOBSHEET II
##### Dherisma Hanindita Utami
##### TI 1H_2041720018_09

## 2.2 Praktikum
### 2.2.1 Percobaan 
tidak dapat dijalankan karena tidak memiliki nilai main pada hasil codingannya
### 2.2.2 Hasil Percobaan 
 * <img src="./ss/ssPraktikum2.2.2.jpeg">
 Hasil yang muncul akan seperti di atas

### 2.2.3 Pertanyaan 
1. Sebutkan 2 karakteristik class/objek!
2. Kata kunci apakah yang digunakan untuk mendeklarasikan class?
3. Perhatikan class Barang yang ada di Praktikum di atas, ada berapa atribut yang dimiliki oleh class
4. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja
deklarasi method dilakukan?
5. Perhatikan method kurangiStok() yang ada di class Barang, modifikasi isi method tersebut
sehingga proses pengurangan hanya dilakukan jika stok masih ada (masih lebih besar dari 0)
6. Menurut Anda, mengapa method tambahStok() dibuat dengan memiliki 1 parameter berupa
bilangan int?
7. Menurut Anda, mengapa method hitungHargaTotal() memiliki tipe data int?
8. Menurut Anda, mengapa method tambahStok() memiliki tipe data void?

jawaban

1. Atribut dan method/behavior
~Atribut merupakan status object 
~Method merupakan tingkah laku dari object tersebut
2. deklarasi Class kelas pada Java dideklarasikan dengan menggunakan kata kunci class
3. Ada 4 yaitu namaBarang, jenisBarang, stok, dan hargaSatuan. Deklarasi atribut pada baris ke 2 dan ke 3
tersebut? Sebutkan! Dan pada baris berapa saja deklarasi atribut dilakukan?
4. Ada 4 yaitu tampilBarang, tambahStok, kurangstok, dan hitungHargaTotal. Deklarasi atribut ke 4, ke 10, ke 13, ke 16, dan ke 19
5. if (stok > 0 ){ stok – n; }
6. Karena berfungsi  untuk menambah jumlah stok yang ada dengan data yang berasal dari luar method itu sendiri, sehingga membutuhkan parameter untuk mengambil nilai dari data yang di inputkan. Dan karena fungsinya adalah untuk menambah stok, maka tipe yang sesuai adalah integer 
7. Karena method tersebut digunakan untuk menghitung sebuah operasi matematika dan variabel jumlah yang dikali dengan variabel hargaSatuan, sehingga diperlukan tipe data kembalian berupa integer agar ketika dipanggil dimethod lain, method itu bisa menerima atau mendapatkan nilai dari perhitungan atau pengolahan data dari method hitungHargaTotal().
8. Karena pada metod tambahStok() tidak memerlukan nilai kembalian yaitu hanya digunakan untuk menjalankan aksi tanpa menyimpan tipe data kembalian



## 2.3 Praktikum
### 2.3.1 Percobaan
* <img src="./ss/ssPercobaan2.3.1.jpeg">

### 2.3.2 Hasil Percobaan
Hasil yang di dapat akan sama dengan modul Jobsheet dan tidak ada pemberitahuan, karena nilai fungsi main sudah dijalankan di dalam program sehingga dapat memunculkan hasil output
* <img src="./ss/ssPercobaan2.3.1.jpeg">

### 2.3.3 Pertanyaan 
1. Pada class BarangMain, pada baris berapakah proses instansiasi dilakukan? Dan apa nama objek
yang dihasilkan?
2. Bagaimana cara mengakses atribut dan method dari suatu objek?

Jawaban
1. Pada baris ke 6, terdapat instansiasi objek pada class barang dengan nama objek b1. Dengan syntax barang b1 = new barang();
2.	Dengan cara  menginstansiasi barang b1 = new barang();

## 2.4 Praktikum
### 2.4.1 Percobaan
* <img src="./ss/ssPercobaan2.4.2.jpeg">

### 2.4.2 Hasil Percobaan
* <img src="./ss/ssHasil2.4.2.jpeg">

### 2.4.3 Pertanyaan 
1. Perhatikan class Barang yang ada di Praktikum 2.4.1, pada baris berapakah deklarasi
konstruktor berparameter dilakukan?
2. Perhatikan class BarangMain di Praktikum 2.4.1, apa sebenarnya yang dilakukan pada baris
program dibawah ini?
* <img src="./ss/ssNomor1.jpeg">
3. Coba buat objek dengan nama b3 dengan menggunakan konstruktor berparameter dari class
Barang.

Jawaban
1. Barang (String nm, String jn, int st, int hs) {
namaBarang = nm;
jenisBarang = jn;
stok = st;
hargaSatuan = hs;
}
2.	Mengisi konstruktor yang tidak berparameter pada class main
3.	Barang b3 = new barang ();
B3.namaBarang = “Balon”;
B3.jenisBarang = “Mainan”;
B3.stok = 4;
B3.hargaSatuan = 12000;
B3.kurangStok(2);
B3.tambahStok(5);
B3.tampilBarang();
Int hargaTotal = b3.hitungHargaTotal(2);
Sytem.out.println(“Harga 2 buah =” + hargaTotal)

## 2.5 Praktikum
1. Lingkaran
Hasil 
* <img src="./ss/l1.jpeg">
* <img src="./ss/l2.jpeg">
2. Video Game
Diagram Class
* <img src="./ss/diagramClass.jpeg">
Hasil 
* <img src="./ss/v1.jpeg">
* <img src="./ss/v2.jpeg">
* <img src="./ss/v3.jpeg">
* <img src="./ss/v4.jpeg">
3. Barang
* <img src="./ss/b1.jpeg">
* <img src="./ss/b2.jpeg">
* <img src="./ss/b3.jpeg">
* <img src="./ss/b4.jpeg">
4. PacMan
Hasil
* <img src="./ss/p1.jpeg">
Hasil main
* <img src="./ss/pcmn1.jpeg">
* <img src="./ss/pcmn2.jpeg">


