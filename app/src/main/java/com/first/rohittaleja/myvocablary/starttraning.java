package com.first.rohittaleja.myvocablary;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.PrivateKey;

public class starttraning extends Activity implements View.OnClickListener {

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starttraning_layout);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button1:
                Intent inent= new Intent(starttraning.this,phase1.class);
                startActivity(inent);
                break;

            case R.id.button2:
                inent = new Intent(starttraning.this, phase2.class);
                startActivity(inent);
                break;

            case R.id.button3:
                inent = new Intent(starttraning.this, phase3.class);
                startActivity(inent);
                break;

            case R.id.button4:
                inent = new Intent(starttraning.this, next.class);
                startActivity(inent);
                break;
        }
    }
}
