# JOBSHEET II
##### Dherisma Hanindita Utami
##### TI 1H_2041720018_09

## 2.2
### Pertanyaan 2.2.3
1. Sebutkan 2 karakteristik class/objek!
2. Kata kunci apakah yang digunakan untuk mendeklarasikan class?
3. Perhatikan class Barang yang ada di Praktikum di atas, ada berapa atribut yang dimiliki oleh class
tersebut? Sebutkan! Dan pada baris berapa saja deklarasi atribut dilakukan?
4. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja
deklarasi method dilakukan?
5. Perhatikan method kurangiStok() yang ada di class Barang, modifikasi isi method tersebut
sehingga proses pengurangan hanya dilakukan jika stok masih ada (masih lebih besar dari 0)
6. Menurut Anda, mengapa method tambahStok() dibuat dengan memiliki 1 parameter berupa
bilangan int?
7. Menurut Anda, mengapa method hitungHargaTotal() memiliki tipe data int?
8. Menurut Anda, mengapa method tambahStok() memiliki tipe data void?

Jawaban
1. Atribut dan method
~Atribut merupakan status object 
~Method merupakan tingkah laku dari object tersebut
2. Deklarasi Class Kelas pada Java dideklarasikan dengan menggunakan kata kunci class.
3.	Ada 4 yaitu namaBarang, jenisBarang, stok, dan hargaSatuan. Deklarasi atribut pada baris ke 2 dan ke 3
4.	Ada 4 yaitu tampilBarang, tambahStok, kurangstok, dan hitungHargaTotal. Deklarasi atribut ke 4, ke 10, ke 13, ke 16, dan ke 19
5.	If (stok > 0 ){ stok – n; }
6.	Karena fungsi dari method tersebut adalah untuk menambah jumlah stok yang ada dengan data yang berasal dari luar method itu sendiri, sehingga membutuhkan parameter untuk mengambil nilai dari data yang di inputkan. Dan karena fungsinya adalah untuk menambah stok, maka tipe yang sesuai adalah integer 
7.	 Karena method tersebut digunakan untuk menghitung sebuah operasi matematika dan variabel jumlah yang dikali dengan variabel hargaSatuan, sehingga diperlukan tipe data kembalian berupa integer agar ketika dipanggil dimethod lain, method itu bisa menerima atau mendapatkan nilai dari perhitungan atau pengolahan data dari method hitungHargaTotal().
8.	Karena pada metod tambahStok() tidak memerlukan nilai kembalian yaitu hanya digunakan untuk menjalankan aksi tanpa menyimpan tipe data kembalian

* <img src="./ss/ssnomor2.png">

* <img src="./ss/ssnomor2.png">
