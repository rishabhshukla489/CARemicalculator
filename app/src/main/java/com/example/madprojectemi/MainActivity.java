package com.example.madprojectemi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b1;
    EditText t1,t2,t3,t4;
    TextView tt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(this);
        t1=(EditText)findViewById(R.id.pa);
        t2=(EditText)findViewById(R.id.dp);
        t3=(EditText)findViewById(R.id.ir);
        t4=(EditText)findViewById(R.id.lt);
        tt1=(TextView)findViewById(R.id.emi);
    }
    public void onClick(View v){
        double p,r,n,d,emi;
        p=Double.parseDouble(t1.getText().toString());
        d=Double.parseDouble(t2.getText().toString());
        p=p-d;
        r=Double.parseDouble(t3.getText().toString());
        r=(r/12)/100;
        n=Double.parseDouble(t4.getText().toString());
        emi=(p*r*(Math.pow((1+r),n)))/((Math.pow((1+r),n)-1));
        tt1.setText("EMI: "+String.valueOf(emi));
    }
}