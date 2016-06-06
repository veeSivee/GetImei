package vee.apps.getimei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button cekDeviceID, cekImeiNumber;
    TextView txtDeviceID, txtImeiNuumber;

    GetImeiDevice getimei;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cekDeviceID = (Button)findViewById(R.id.button);
        cekImeiNumber = (Button)findViewById(R.id.button2);
        txtDeviceID = (TextView)findViewById(R.id.textView2);
        txtImeiNuumber = (TextView)findViewById(R.id.textView3);

        getimei = new GetImeiDevice(this);

        cekDeviceID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDeviceID.setText("Device ID : \n" + getimei.getDeviceID());
            }
        });

        cekImeiNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtImeiNuumber.setText("Imei Number : \n" + getimei.getImeiNumber());
            }
        });
    }
}
