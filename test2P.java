// anggap ini isian (methods) *selalu run di file ini, jgn di childny

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class area {
    int len, wid;
    double jar, bas, hgt;
    area() { // constructor awal
        this.len = 0;
        this.wid = 0;
        this.bas = 0;
        this.hgt = 0;
        this.jar = 0;
    }
    area(int len, int wid) { // persegi
        this.len = len;
        this.wid = wid;
    }
    area(double jar) { // lingkaran
        this.jar = jar;
    }
    area(double bas, double hgt) { // segitiga
        this.bas = bas;
        this.hgt = hgt;
    }
    int sqArea() { // luas persegi
        return len * wid;
    }
    double ciArea() { // luas lingkaran
        return Math.PI * Math.pow(jar, 2);
    }
    double trArea() { // luas segitiga
        return bas * hgt / 2;
    }

    void sqAreaInfo() { // output luas persegi
        System.out.println("luas persegi = " + sqArea() + " cm.");
    }
    void ciAreaInfo() { // output luas lingkaran
        System.out.printf("luas lingkaran = %.0f cm.", ciArea());
        System.out.println("");
    }
    void trAreaInfo() { // output luas segitiga
        System.out.printf("luas segitiga = %.0f cm.", trArea());
        System.out.println("");
    }
}

class circle {
    double jar;
    circle() {
        this.jar = 0;
    }
    circle(double jar) {
        this.jar = jar;
    }
    double ciArea() {
        return Math.PI * Math.pow(jar, 2);
    }
    
    void circleInfo() {
        System.out.printf("luas lingkaran = %.0f", ciArea());
        System.out.println("");
    }
}

class square {
    int len;
    int wid;
    square() {
        this.len = 0;
        this.wid = 0;
    }
    square(int len, int wid) {
        this.len = len;
        this.wid = wid;
    }
    int crcmSqr() {
        return 2 * (len + wid);
    }
    int sqrArea() {
        return len * wid;
    }
    double diagSqr() {
        return Math.sqrt(Math.pow(len, 2) + Math.pow(wid, 2));
    }

    void squareInfo() {
        System.out.println("luas persegi = " + sqrArea());
    }
}

class triangle {
    int bas;
    int hgt;
    triangle() {
        this.bas = 0;
        this.hgt = 0;
    }
    triangle(int bas, int hgt) {
        this.bas = bas;
        this.hgt = hgt;
    }
    int trArea() {
        return this.bas * this.hgt / 2;
    }

    void triangleInfo() {
        System.out.println("luas segitiga = " + trArea());
    }
}

public class test2P {
    String nama;
    double a;
    int b;
    double cnvrtd;
    int year;
    int pri;
    int tax;

    void setnama (String mynama) {
        nama = mynama;
    }

    void seta (double mya) {
        a = mya;
    }

    void setb (int myb) {
        b = myb;
    }

    void setconv (double myconv) {
        cnvrtd = myconv * (36/10);
    }

    void setyear (int myyear) {
        year = myyear;
    }

    void setpri (int mypri) {
        pri = mypri;
    }

    void settax (int mytax) {
        if (year < 2020) {
            mytax = pri * 5/100;
        } else {
            mytax = pri * 10/100;
        }
        tax = mytax;
    }

    void displayInfo(String info) {
        System.out.println("Nama mobil = " + nama);
        System.out.println("Kecepatan mobil = " + a + " km/h");
        System.out.println("Kecepatan mobil = " + cnvrtd + " m/s");
        System.out.println("Garansi mobil = " + b + " tahun");
        System.out.println("Harga mobil = " + pri);
        System.out.println("Tahun mobil = " + year);
        System.out.println("Pajak mobil = " + tax);
        System.out.println(info);
    }
}

class Film {
    private String judulFilm;
    private String genreFilm;
    private LocalTime jTayangFilm;
    private int hTiketFilm;

    public Film(String aJFilm, String aGFilm, LocalTime aJTFilm, int aHTFilm) {
        this.judulFilm = aJFilm;
        this.genreFilm = aGFilm;
        this.jTayangFilm = aJTFilm;
        this.hTiketFilm = aHTFilm;
    }

    void filmInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String jTayangFilm = this.jTayangFilm.format(formatter);
        System.out.println("Judul film: " + judulFilm);
        System.out.println("Genre film: " + genreFilm);
        System.out.println("Jam tayang film: " + jTayangFilm + " WIB");
        System.out.println("Harga tiket film: Rp" + hTiketFilm);
    }
}

class Studio {
    private int noStudio;
    private int kursiStudio;
    private Film film;

    public Studio(int aNStudio,int aKStudio, Film film) {
        this.noStudio = aNStudio;
        this.kursiStudio = aKStudio;
        this.film = film;
    }

    void setFilm(Film film) {
        this.film = film;
    }

    int getKursi() {
        return kursiStudio;
    }

    void studioInfo() {
        System.out.println("Nomor studio: " + noStudio);
        System.out.println("Kapasitas studio: " + kursiStudio + " orang");
        film.filmInfo();
    }
}

class Audiens {
    private String name;

    public Audiens(String name) {
        this.name = name;
    }

    void audiensInfo() {
        System.out.println("Nama: " + name);
    }
}

class Tiket {
    int noTiket;
    Film film;
    Studio studio;
    int tempatDuduk;
    Audiens audiens;

    public Tiket(int noTiket, Film film, Studio studio, int tempatDuduk, Audiens audiens) {
        this.noTiket = noTiket;
        this.film = film;
        this.studio = studio;
        // a
        // if (tempatDuduk > studio.getKursi()) {
        //     System.out.println("Kursi melebihi kapasitas.");
        //     this.tempatDuduk = studio.getKursi();
        // } else if (tempatDuduk < 1) {
        //     System.out.println("Kursi tidak boleh kurang dari 1.");
        //     this.tempatDuduk = 1;
        // } else {
        //     this.tempatDuduk = tempatDuduk;
        // }
        this.tempatDuduk = tempatDuduk;
        this.audiens = audiens;
    }

    void tiketInfo() {
        audiens.audiensInfo();
        System.out.println("Kursi: " + tempatDuduk);
        System.out.println("No. Tiket: " + noTiket);
        studio.studioInfo();
        System.out.println("");
    }
}

class Pegawai {
    String workerName;
    String workerChair;
    double priSalary;
    double secSalary;
    double compTax;
    double compBonus;
    double extCompBonus;
    Pegawai() {
        this.workerName = "";
        this.workerChair = "";
        this.priSalary = 0;
        this.secSalary = 0;
        this.compTax = 0;
        this.compBonus = 0;
        this.extCompBonus = 0;
    }
    Pegawai(String nama, String jabatan) {
        workerName = nama;
        workerChair = jabatan;
    }
    Pegawai(/*Pegawai pegawai,*/ double gaji, double tunjangan, double pajak, double bonus) {
        priSalary = gaji;
        secSalary = tunjangan;
        compTax = pajak;
        compBonus = bonus;
    }
    double hitungGajiTotal() {
        return priSalary + secSalary + compBonus - compTax;
    }
    double tambahBonus(double tambahanBonus) {
        return compBonus + tambahanBonus;
    }

    void displayInfo() {
        System.out.println("Nama pegawai : " + workerName);
        System.out.println("Jabatan pegawai : " + workerChair);
        System.out.println("Gaji pokok : Rp" + priSalary);
        System.out.println("Tunjangan : Rp" + secSalary);
        System.out.println("Bonus : Rp" + compBonus);
        System.out.println("Bonus Tambahan : Rp" + tambahBonus(compBonus));
        System.out.println("Pajak : Rp" + compTax);
        System.out.println("Total gaji : Rp" + hitungGajiTotal());
        System.out.println("");
    }
}