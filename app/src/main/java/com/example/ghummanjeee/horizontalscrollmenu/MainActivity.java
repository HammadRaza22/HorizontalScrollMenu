package com.example.ghummanjeee.horizontalscrollmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.darwindeveloper.horizontalscrollmenulibrary.custom_views.HorizontalScrollMenuView;
import com.darwindeveloper.horizontalscrollmenulibrary.extras.MenuItem;

public class MainActivity extends AppCompatActivity {
    HorizontalScrollMenuView horizontal_menu;
   TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        horizontal_menu = (HorizontalScrollMenuView) findViewById(R.id.horizontal_menu);
            txt1=(TextView)findViewById(R.id.txt1);
        horizontal_menu.addItem("Account", R.drawable.ic_acc, true);        horizontal_menu.addItem("Money", R.drawable.ic_money);
        horizontal_menu.addItem("Payment", R.drawable.ic_action_name);
        horizontal_menu.addItem("Done", R.drawable.ic_tick);

        horizontal_menu.showItems();
        horizontal_menu.setOnHSMenuClickListener(new HorizontalScrollMenuView.OnHSMenuClickListener(){
            @Override
            public void onHSMClick(MenuItem menuItem, int position) {
                Toast.makeText(MainActivity.this, ""+menuItem.getText(), Toast.LENGTH_SHORT).show();
                 txt1.setText(menuItem.getText());
            }
        });
    }
}
