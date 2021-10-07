package my.id.airham.listandi;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ListActivity extends AppCompatActivity {
    ListView listOs;
    String[] os = {
            "Windows",
            "MacOS",
            "Linux",
            "Android",
            "Ubuntu",
            "Solaris",
            "iOS",
            "Symbian",
            "WindowsPhone"};
    int icons[] = {
            R.drawable.windows,
            R.drawable.macos,
            R.drawable.linux,
            R.drawable.android,
            R.drawable.ubuntu,
            R.drawable.solaris,
            R.drawable.ios,
            R.drawable.symbian,
            R.drawable.windows};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listOs = findViewById(R.id.listOS);
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_data, os);
        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), os, icons);
        listOs.setAdapter(adapter);
        listOs.setOnItemClickListener((parent, view, position, id) -> {
            String item = parent.getItemAtPosition(position).toString();
            Toast.makeText(ListActivity.this, "Item click: " + item,
                    Toast.LENGTH_LONG).show();
        });
    }
}