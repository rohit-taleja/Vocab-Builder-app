package com.first.rohittaleja.myvocablary;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class index extends Activity implements View.OnClickListener {
    private Button bun1;
    private Button bun2;
    private Intent inent;
    private int num=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index_layout);
        bun1=(Button)findViewById(R.id.button);
        bun2=(Button)findViewById(R.id.button1);
        bun1.setOnClickListener(this);
        bun2.setOnClickListener(this);
    }

                @Override
                public void onClick(View v) {
                    switch (v.getId())
                    {
                        case R.id.button:
                        Intent inent= new Intent(index.this,addword.class);
                        startActivity(inent);
                        break;

                        case R.id.button1:
                        inent = new Intent(index.this, starttraning.class);
                        startActivity(inent);
                            break;
                }
        }
}