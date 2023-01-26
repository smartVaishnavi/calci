package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    Button add,sub,mul,div;
    TextView tv;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            ed1=findViewById(R.id.ed1);
            ed2=findViewById(R.id.ed2);
            add=findViewById(R.id.add);
            sub=findViewById(R.id.sub);
            mul=findViewById(R.id.mul);
            div=findViewById(R.id.div);
            tv=findViewById(R.id.tv);

            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int f,s,a;
                    f=Integer.parseInt(ed1.getText().toString());
                    s=Integer.parseInt(ed2.getText().toString());
                    a=f+s;
                    tv.setText("result="   +a);

                }

            });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f,s,a;
                f=Integer.parseInt(ed1.getText().toString());
                s=Integer.parseInt(ed2.getText().toString());
                a=f-s;
                tv.setText("result="   +a);

            }

        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f,s,a;
                f=Integer.parseInt(ed1.getText().toString());
                s=Integer.parseInt(ed2.getText().toString());
                a=f*s;
                tv.setText("result="   +a);

            }

        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f,s,a;
                f=Integer.parseInt(ed1.getText().toString());
                s=Integer.parseInt(ed2.getText().toString());
                a=f/s;
                tv.setText("result="   +a);

            }

        });
    }
}