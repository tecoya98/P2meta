package mx.edu.tesoem.isc.meta.p2meta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Frm2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);
    }
    public void pantalla3(View v)
    {
        Intent frm3=new Intent(this, Frm3Activity.class);
        startActivity(frm3);
        finish();
    }
}
