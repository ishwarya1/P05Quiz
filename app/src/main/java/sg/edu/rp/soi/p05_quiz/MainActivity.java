package sg.edu.rp.soi.p05_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1=100*pax;
        B2=100*pax;
        btn.setOnClickListener(new View.onClickListener()){
            @Override
                    public void onClick(View view){
                checkbox i= new checkbox(MainActivity.this,SecondActivity.class);
                i.putExtra("key   ",a);
                startActivity(i);
            }
        });
    }
}
