package sg.edu.rp.soi.p05_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        B1 b1= getB1();
        B2 b2= getB2();
        int data=i.getIntExtra("key 1");
        Toast.makeText("Invalid data entered:-");
    }
}
