package kr.hs.emirim.chaehyeon.fourbuttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button btnChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHome = findViewById(R.id.btn_home);
        Button btncall = findViewById(R.id.btn_call);
        Button brnGallery = findViewById(R.id.btn_gallery);
        Button btnFinish = findViewById(R.id.btn_finish);

        btnChange = findViewById(R.id.btn_changecolor);

        btnHome.setOnClickListener(btnListner);
        btncall.setOnClickListener(btnListner);
        brnGallery.setOnClickListener(btnListner);
        btnFinish.setOnClickListener(btnListner);
        btnChange.setOnClickListener(btnListner);

    }

    View.OnClickListener btnListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_home:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                    break;
                case R.id.btn_call:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/010-1234-5678"));
                    break;
                case R.id.btn_gallery:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                    break;
                case R.id.btn_changecolor:
                    btnChange.setBackgroundColor(Color.MAGENTA);
                    return;
                case R.id.btn_finish:
                    finish();
                    return;
            }
            startActivity(intent);
        }
    };
}