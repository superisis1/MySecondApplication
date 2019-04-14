package kr.insungjung.mysecondapplication;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText idText;
    EditText passText;
    Button loginBtn;
    Button passBtn;
    TextView logoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idText = findViewById(R.id.idText);
        passText = findViewById(R.id.passText);
        loginBtn = findViewById(R.id.loginBtn);
        passBtn = findViewById(R.id.passBtn);
        logoText = findViewById(R.id.logoText);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userIdStr = idText.getText().toString();
                String userPassStr = passText.getText().toString();
//                String userInfo = "아이디: " + userIdStr + " 비번: " + userPassStr;

//                logoText.setText(userInfo);
                logoText.setText(String.format("ID: %s, PW: %s", userIdStr, userPassStr));

                Toast.makeText(MainActivity.this, userIdStr, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
