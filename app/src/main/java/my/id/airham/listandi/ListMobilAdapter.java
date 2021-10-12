package my.id.airham.listandi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListMobilAdapter extends BaseAdapter {
    Context context;
    List<Mobil> listMobil;
    LayoutInflater inflater;

    public ListMobilAdapter(Context applicationContext, List<Mobil> listMobil) {
        this.context = applicationContext;
        this.listMobil = listMobil;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listMobil.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.list_base_mobil, null);
        ImageView icon = view.findViewById(R.id.iconMobil);
        TextView harga = view.findViewById(R.id.lbHarga);
        TextView namaMobil = view.findViewById(R.id.lbNamaMobil);
        TextView tahunMobil = view.findViewById(R.id.lbTahunMobil);
        TextView bahanBakar = view.findViewById(R.id.lbBahanBakar);
        TextView lokasi = view.findViewById(R.id.lbLokasi);

        icon.setImageResource(listMobil.get(position).icon);
        harga.setText(listMobil.get(position).harga);
        namaMobil.setText(listMobil.get(position).nama);
        tahunMobil.setText(listMobil.get(position).tahun);
        bahanBakar.setText(listMobil.get(position).bahan_bakar);
        lokasi.setText(listMobil.get(position).lokasi);
        return view;
    }
}
