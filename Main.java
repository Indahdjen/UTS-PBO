public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("STUDI KASUS UTS PBO 2022/2023");
        System.out.println("=============================");
        System.out.println("\n");
        System.out.println("Nama    : Indah Nuraini A. M. Djen");
        System.out.println("NIM     : 2100018204");
        System.out.println("Jurusan : Informatika");
        System.out.println("Kelas   : D");

        System.out.println("------------------------------");
        System.out.println("\n");
        Staff staff = new Staff();
        staff.setNama("Rose");
        staff.setNip(74658374);
        staff.setTglLahir("20/11/1997");
        staff.setAlamat("Gangnam");
        staff.setJk("Perempuan");
        staff.setTahunMasuk(2020);

        Dosen uad = new Dosen();
        uad.setJurusan("Informatika");
        uad.setNidn(647685767);
        uad.setNama("Park Chanyeol");
        uad.setNip(213456789);
        uad.setTglLahir("12/02/1992");
        uad.setJk("Laki-Laki");
        uad.setAlamat("Seoul");
        uad.setTahunMasuk(2012);

        System.out.println("Nama Tenaga Pendidik    : "+ staff.getNama());
        System.out.println("NIP  Tenaga Pendidik    : "+ staff.getNip());
        System.out.println("Tanggal Lahir           : "+ staff.getTglLahir());
        System.out.println("Jenis Kelamin           : "+ staff.getjenkel());
        System.out.println("Alamat                  : "+ staff.getAlamat());
        System.out.println("Tahun masuk             : "+ staff.getTahunMasuk());
        System.out.println("Gaji pokok              : "+ staff.gajiTotal());
        System.out.println("Bonus lembur(20 jam)     : "+ staff.lembur(20));
        System.out.println("Gaji total              : "+ staff.gajiTotal(20));
        System.out.println("--------------------------------------------");
        System.out.println("Nama Dosen          : "+ uad.getNama());
        System.out.println("NIDN                : "+ uad.getNidn());
        System.out.println("Jurusan             : "+ uad.getJurusan());
        System.out.println("NIP  Dosen          : "+ uad.getNip());
        System.out.println("Tanggal Lahir       : "+ uad.getTglLahir());
        System.out.println("Jenis Kelamin       : "+ uad.getjenkel());
        System.out.println("Alamat              : "+ uad.getAlamat());
        System.out.println("Tahun masuk         : "+ uad.getTahunMasuk());
        System.out.println("Gaji pokok          : "+ uad.gajiTotal());
        System.out.println("Kelas lebih (6 SKS) : "+ uad.kelebihanNgajar(6));
        System.out.println("Gaji total          : "+ uad.gajiTotal(6));

    }
}