package com.first.rohittaleja.myvocablary;
import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class phase1 extends Activity {
    DatabaseHelper myDb;
    private TextView textview1;
    private TextView textview2;
    private TextView textview3;
    private TextView textview4;
    private TextView textview5;
    int i;
    int j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myDb = new DatabaseHelper(this);
        setContentView(R.layout.phase1_layout);
        textview1= (TextView) findViewById(R.id.ptextView1);
        textview2= (TextView) findViewById(R.id.ptextView2);
        textview3= (TextView) findViewById(R.id.ptextView3);
        textview4= (TextView) findViewById(R.id.ptextView4);
        textview5= (TextView) findViewById(R.id.ptextView5);

        Cursor res = myDb.getAllData();
        if(res.getCount() == 0) {
            // show message
        //    showMessage("Error","Nothing found");
            return;
        }
        //StringBuffer buffer = new StringBuffer();
        i=0;
        while (res.moveToNext()) {
            word.str[i]=res.getString(1);
                    i++;
        }
        textview1.setText(word.str[0]);
        new Thread(new Runnable() {
            public void run() {
                i = 1;
                while (i < 5) {
                    j=i;
                    textview1.post(new Runnable() {
                        public void run() {
                            while(j>=1) {
                                hello();
                                j--;
                            }
                            i++;
                        }
                    });
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
    }

    public void hello()
    {
        if(j==-1)
            return;
        textview1.setText(word.str[j]);
        j--;
        if(j==-1)
            return;
        textview2.setText(word.str[j]);
        j--;
        if(j==-1)
            return;
        textview3.setText(word.str[j]);
        j--;
        if(j==-1)
            return;
        textview4.setText(word.str[j]);
        j--;
        if(j==-1)
            return;
        textview5.setText(word.str[j]);
    }
}
