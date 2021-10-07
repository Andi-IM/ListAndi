package my.id.airham.listandi;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] osList;
    int[] icons;
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, String[] osList, int[] icons){
        this.context = applicationContext;
        this.osList = osList;
        this.icons = icons;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return osList.length;
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
        view = inflater.inflate(R.layout.list_data, null);
        TextView label = view.findViewById(R.id.txtLabel);
        ImageView icon = view.findViewById(R.id.icon);
        label.setText(osList[position]);
        icon.setImageResource(icons[position]);
        return view;
    }
}
