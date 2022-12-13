package com.example.intent02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_C extends AppCompatActivity {
TextView textView_F;
Button btn_returnBack;
Double c,f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        textView_F=findViewById(R.id.textView_F);
        btn_returnBack=findViewById(R.id.btn_returnBack);

        Bundle bundle=this.getIntent().getExtras();
        if(bundle!= null)    {  //把bundle值轉成double //利用key從bundle取出內容，原型態為string
            f=Double.parseDouble(bundle.getString("TEMP_F"));
            c=(f-32)*5/9;
            c=Math.round(c*100.0)/100.0;
            textView_F.setText("攝氏溫度："+c);
        }
        btn_returnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}