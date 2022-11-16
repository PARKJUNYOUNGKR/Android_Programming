package com.example.pr7_3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] versionArray = new String[]{"Q(10)", "R(11)", "S(12)"};
                final boolean[] checkArray = new boolean[] {true, false, false};
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("좋아하는 버전은?");
//                dlg.setTitle("제목입니다.");
//                dlg.setMessage("이곳이 내용입니다");
                dlg.setIcon(R.mipmap.ic_launcher);
//                dlg.setItems(versionArray, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int which) {
//                        button1.setText(versionArray[which]);
//                    }
//                });
                // 버튼 클릭 시 작동하는 대화상자의 Java 코드

//                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener(){
//                   public void onClick(DialogInterface dialog, int which){
//                       Toast.makeText(MainActivity.this, "확인을 눌렀네요", Toast.LENGTH_SHORT).show();
//                   }
//                });
                // 기본적인 목록 대화상자의 Java코드


//                dlg.setSingleChoiceItems(versionArray, 0, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int which) {
//                        button1.setText(versionArray[which]);
//                    }
//                });
                // 라디오버튼 목록 대화상자의 Java코드

                dlg.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        button1.setText(versionArray[which]);
                    }
                });
                //체크박스 목록 대화상자의 Java 코드
//                dlg.setPositiveButton("확인", null);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
    }
}
