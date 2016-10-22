package game.baihuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.twonum);
        Button b2 = (Button) findViewById(R.id.threenum);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(MainActivity.this,Main2Activity.class);
        if(v.getId()==R.id.twonum){
            i.putExtra("Digits", 2);
        }else if(v.getId()==R.id.threenum){
            i.putExtra("Digits", 3);
        }
        startActivity(i);
    }
}