package my.id.airham.listandi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnList, btnListWithIcon, btnListMobilBekas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnList = findViewById(R.id.btnList);
        btnList.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ListActivity.class))
        );

        btnListWithIcon = findViewById(R.id.btnListWithIcon);
        btnListWithIcon.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ActivityListBase.class)));

        btnListMobilBekas = findViewById(R.id.btnListMobilBekas);
        btnListMobilBekas.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ListMobileBekasActivity.class)));
    }
}