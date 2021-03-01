package com.example.paulopuu;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(a);
            }
        });






    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       if(item.getItemId()==R.id.ayarlar){
           Toast.makeText(this,"İNTERNET YOK",Toast.LENGTH_SHORT).show();
       }else  if(item.getItemId()==R.id.yardım){
           Toast.makeText(this,"YARDIMA İHTİYACIN YOK :D",Toast.LENGTH_SHORT).show();
       }else  if(item.getItemId()==R.id.hakkında){
        Toast.makeText(this,"VERSİYON 6.91",Toast.LENGTH_SHORT).show();
       }else{
           return super.onOptionsItemSelected(item);
       }
       return true;



    }

}
