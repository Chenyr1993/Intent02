package com.example.intent02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText edittext_c,edittext_F;
Button btn_CtoF,btn_FtoC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext_c=findViewById(R.id.edittext_c);
        btn_CtoF=findViewById(R.id.btn_CtoF);
        edittext_F=findViewById(R.id.edittext_F);
        btn_FtoC=findViewById(R.id.btn_FtoC);

        btn_CtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Activity_F.class);

                //Bundle傳送複數資料
                Bundle b=new Bundle();

                // 因為實際內容型態為String,所以用putString(key,存放的實際內容)
                b.putString("TEMP_C",edittext_c.getText().toString());

                  //bundle 用putExtras存放值(Extra"s")
                i.putExtras(b);
                startActivity(i);

            }
        });

        btn_FtoC.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i=new Intent(MainActivity.this,Activity_C.class);
            Bundle b=new Bundle();
            b.putString("TEMP_F",edittext_F.getText().toString());

            i.putExtras(b);
            startActivity(i);

        }
    });
    }
}