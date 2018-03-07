package com.example.and_mj.tarea1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OtherActivity extends AppCompatActivity {

    Button btnSendData;
    EditText etDataSend;

    private static final int REQUEST_OTHER_ACTIVITY = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        btnSendData = findViewById(R.id.btSendData);
        etDataSend = findViewById(R.id.etDataSend);

        btnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = etDataSend.getText().toString();
                if(data == null || data.isEmpty()){
                    etDataSend.setError("Ingrese este Valor");
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("dato", data);
                setResult(RESULT_OK, intent);

                finish();
            }
        });

    }
}
