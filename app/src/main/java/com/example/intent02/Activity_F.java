package com.example.intent02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_F extends AppCompatActivity {
 Button btn_returnBack;
 TextView textView_F;
 Double c,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f);

        btn_returnBack=findViewById(R.id.btn_returnBack);
        textView_F=findViewById(R.id.textView_F);

        //宣告bundle物件取MainActivity的bundle物件
                    //在本程式裡.取得intent(變更畫面方法).取bundle內容(存在Extras裡了)
        Bundle bundle=this.getIntent().getExtras();
        //如果bundle內容不為空值
        if(bundle!= null)
        {  //把bundle值轉成double //利用key從bundle取出內容，原型態為string
            c=Double.parseDouble(bundle.getString("TEMP_C"));
            f=(9.0*c)/5+32;
            textView_F.setText("華氏溫度："+f);
        }
        btn_returnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}