# LabSesion1-PBO
Nama : Dwi Agus M  
Nim  : L0325022  
Tema : Data Mahasiswa  
Program Java ini merupakan aplikasi sederhana pendataan mahasiswa dengan tema "Data Mahasiswa". Program menyimpan data beberapa mahasiswa ke dalam ArrayList, lalu menampilkan data tersebut, menentukan predikat kelulusan berdasarkan IPK, mengolah string (nama), serta mendemonstrasikan penanganan error (exception handling). Program ini dibuat untuk memenuhi 9 kriteria tugas pemrograman Java dasar dengan menerapkan konsep Pemrograman Berorientasi Objek (OOP).  
Alur Program  
1. Inisialisasi Data — Program membuat ArrayList<Mahasiswa> dan menambahkan 3 data mahasiswa (Agis Lentera, Budiono Siregar, Alex Putra Tama).  
2. Menampilkan Data — Program menggunakan looping for untuk menampilkan seluruh data mahasiswa satu per satu dengan method tampil().  
3. Mengambil Objek Tertentu — Program mengambil mahasiswa ke-3 (indeks 2) yaitu Alex Putra Tama untuk diolah lebih lanjut.  
4. Mengolah String & Character — Program mengambil inisial nama (charAt(0)), mengubah nama jadi huruf kapital (toUpperCase()), menghitung panjang nama (length()), dan menampilkan predikat berdasarkan IPK.  
5. Menangani Error — Program mendemonstrasikan exception handling dengan simulasi pembagian nol (100 / 0) di dalam blok try-catch.  
6. Penutup — Program menampilkan pesan "Program selesai."
```
   OUTPUT PROGRAM  
   === DATA MAHASISWA ===  
Agis Lentera - L0325022 - IPK 3.75  
Budiono Siregar - L0325006 - IPK 3.6  
Alex Putra Tama - L0325016 - IPK 3.2  

Inisial: A
Nama Upper: ALEX PUTRA TAMA  
Panjang Nama: 15

Predikat: Sangat Memuaskan  

Error: Tidak bisa membagi dengan nol!
```
