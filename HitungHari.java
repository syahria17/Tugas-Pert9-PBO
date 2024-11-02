package tugas9praktikum;

public class HitungHari {
    String Hitung (int tahun, String bulan) {
        
        boolean isKabisat = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);

        // Tentukan jumlah hari berdasarkan bulan
        int jumlahHari;
        switch (bulan) {
            case "Januari": case "Maret": case "Mei": case "Juli": case "Agustus": case "Oktober": case "Desember":
                jumlahHari = 31;
                break;
            case "April": case "Juni": case "September": case "November":
                jumlahHari = 30;
                break;
            case "Februari":
                jumlahHari = isKabisat ? 29 : 28;
                break;
            default:
                jumlahHari = 0; // Seharusnya tidak sampai ke sini
                break;
        }
        return "Jumlah hari pada bulan "+bulan+" tahun "+String.valueOf(tahun)+" adalah "+String.valueOf(jumlahHari);
    }

    
}