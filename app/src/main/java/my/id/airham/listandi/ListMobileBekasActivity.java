package my.id.airham.listandi;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ListMobileBekasActivity extends AppCompatActivity {
    ListView listMobil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mobile_bekas);
        listMobil = findViewById(R.id.listMobil);
        List<Mobil> daftarMobil = new ArrayList<>();
        daftarMobil.add(new Mobil(
                R.drawable.daihatsuxenia,
                "Rp. 250.000.000,00",
                "Daihatsu Xenia",
                "Bahan Bakar : Bensin",
                "2018",
                "BANTEN, JABAR"
        ));
        daftarMobil.add(new Mobil(
                R.drawable.jazz,
                "Rp. 266.000.000,00",
                "Honda Jazz",
                "Bahan Bakar : Bensin",
                "2016",
                "DKIJAKARTA, JAKARTA PUSAT"
        ));
        daftarMobil.add(new Mobil(
                R.drawable.lancer,
                "Rp. 250.000.000,00",
                "Mitsubishi Lancer",
                "Bahan Bakar : Bensin",
                "2018",
                "PADANG, SUMBAR"
        ));
        daftarMobil.add(new Mobil(
                R.drawable.mobilalya,
                "Rp. 150.000.000,00",
                "Toyota Ayla",
                "Bahan Bakar : Bensin",
                "2019",
                "BANDUNG, JABAR"
        ));
        daftarMobil.add(new Mobil(
                R.drawable.mobilavanza,
                "Rp. 200.000.000,00",
                "Toyota Avanza",
                "Bahan Bakar : Bensin",
                "2017",
                "BANDUNG, JABAR"
        ));
        daftarMobil.add(new Mobil(
                R.drawable.mobilinnova,
                "Rp. 350.000.000,00",
                "Toyota Innova",
                "Bahan Bakar : Diesel",
                "2018",
                "MALANG, JATIM"
        ));
        daftarMobil.add(new Mobil(
                R.drawable.sigra,
                "Rp. 420.000.000,00",
                "Daihatsu Sigra",
                "Bahan Bakar : Bensin",
                "2016",
                "DKIJAKARTA, JAKARTA PUSAT"
        ));
        daftarMobil.add(new Mobil(
                R.drawable.yaris,
                "Rp. 250.000.000,00",
                "Toyota Yaris",
                "Bahan Bakar : Bensin",
                "2018",
                "PADANG, SUMBAR"
        ));
        daftarMobil.add(new Mobil(
                R.drawable.toyotafortuner,
                "Rp. 500.000.000,00",
                "Toyota Fortuner",
                "Bahan Bakar : Diesel",
                "2019",
                "BANDUNG, JABAR"
        ));
        daftarMobil.add(new Mobil(
                R.drawable.mobildaihatsurocky,
                "Rp. 200.000.000,00",
                "Daihatsu Rocky",
                "Bahan Bakar : Bensin",
                "2017",
                "Makassar, SULSEL"
        ));

        ListMobilAdapter adapter = new ListMobilAdapter(getApplicationContext(), daftarMobil);
        listMobil.setAdapter(adapter);
    }
}