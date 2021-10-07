package my.id.airham.listandi;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityListBase extends AppCompatActivity {
    ListView osBaseList;

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

    int[] icon = {
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
        setContentView(R.layout.activity_list_base);
        osBaseList = findViewById(R.id.listOSIcon);

        ListBaseAdapter adapter = new ListBaseAdapter(getApplicationContext(), os, icon);
        osBaseList.setAdapter(adapter);
    }
}