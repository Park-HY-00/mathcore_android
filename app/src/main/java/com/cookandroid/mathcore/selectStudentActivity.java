package com.cookandroid.mathcore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class selectStudentActivity extends AppCompatActivity {

    TextView txtResult;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_student);

    }

    public void mOnPopupClick01(View v){
        Intent intent = new Intent(this, PopupActivity.class);
        intent.putExtra("data","이름 : 유재석\n생년월일 : 20060101\n소속 : 무한고등학교\n가입일자 : 22-06-01" );
        startActivityForResult(intent,1);
    }

    public void mOnPopupClick02(View v){
        Intent intent = new Intent(this, PopupActivity.class);
        intent.putExtra("data","이름 : 강호동\n생년월일 : 20050202\n소속 : 일박고등학교\n가입일자 : 22-06-01");
        startActivityForResult(intent,1);
    }
    public void mOnPopupClick03(View v){
        Intent intent = new Intent(this, PopupActivity.class);
        intent.putExtra("data","이름 : 신동엽\n생년월일 : 20040303\n소속 : 동물고등학교\n가입일자 : 22-06-01");
        startActivityForResult(intent,1);
    }
    public void mOnPopupClick04(View v){
        Intent intent = new Intent(this, PopupActivity.class);
        intent.putExtra("data","이름 : 이경규\n생년월일 : 20030404\n소속 : 양심고등학교\n가입일자 : 22-06-01");
        startActivityForResult(intent,1);
    }
    public void mOnPopupClick05(View v){
        Intent intent = new Intent(this, PopupActivity.class);
        intent.putExtra("data","이름 : 이효리\n생년월일 : 20070505\n소속 : 핑클고등학교\n가입일자 : 22-06-01");
        startActivityForResult(intent,1);
    }
    @Override
    protected void onActivityResult(int requestCode, int ResultCode, Intent data) {
        super.onActivityResult(requestCode, ResultCode, data);
        if (requestCode == 1) {
            if (ResultCode == RESULT_OK) {
                //data 받기
                String result = data.getStringExtra("result");
                //txtResult.setText(result);
            }
        }
    }

}
