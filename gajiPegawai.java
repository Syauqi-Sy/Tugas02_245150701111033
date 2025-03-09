class Pegawai {
    String workerName;
    String workerChair;
    double priSalary;
    double secSalary;
    double compTax;
    double compBonus;
    double extCompBonus;
    Pegawai() {
        workerName = "";
        workerChair = "";
        priSalary = 0;
        secSalary = 0;
        compTax = 0;
        compBonus = 0;
        extCompBonus = 0;
    }
    Pegawai(String nama, String jabatan, double gaji, double tunjangan, double pajak, double bonus) {
        workerName = nama;
        workerChair = jabatan;
        priSalary = gaji;
        secSalary = tunjangan;
        compTax = pajak;
        compBonus = bonus;
    }
    double hitungGajiTotal() {
        return priSalary + secSalary + compBonus - compTax;
    }
    void tambahBonus(double tambahanBonus) {
        extCompBonus = compBonus + tambahanBonus;
    }

    void displayInfo() {
        System.out.println("___Data pegawai___");
        System.out.println("Nama pegawai : " + workerName);
        System.out.println("Jabatan pegawai : " + workerChair);
        System.out.printf("Gaji pokok : Rp%.0f\n", priSalary);
        System.out.printf("Tunjangan : Rp%.0f\n", secSalary);
        System.out.printf("Bonus : Rp%.0f\n", compBonus);
        System.out.printf("Pajak : Rp%.0f\n", compTax);
        System.out.printf("Total gaji : Rp%.0f\n", hitungGajiTotal());
        System.out.printf("Bonus (ditambah) : Rp%.0f\n", extCompBonus);
        System.out.println("");
    }
}

public class gajiPegawai {
    public static void main (String[] args) {
        double thr = 2000000;
        Pegawai p1 = new Pegawai("dimas","dirut", 5000000, 1500000, 500000, 2500000);
        p1.tambahBonus(thr);
        p1.displayInfo();
        Pegawai p2 = new Pegawai("wahyu","kabag", 4750000, 1750000, 1000000, 2750000);
        p2.tambahBonus(thr);
        p2.displayInfo();
    }
}
