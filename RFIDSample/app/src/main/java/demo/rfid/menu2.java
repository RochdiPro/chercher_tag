package demo.rfid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu2 extends AppCompatActivity {


    Button btn_cher ;
    Button btn_inv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_menu2);

        btn_cher  = (Button) findViewById(R.id.btn_cher );
        btn_cher.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tocherc();
            }});


        btn_inv  = (Button) findViewById(R.id.btn_inv);
        btn_inv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toinv();
            }});
    }

    private void  toinv()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void  tocherc()
    {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}