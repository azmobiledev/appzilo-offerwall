package com.resonetmobiledev.appzilo.offerwall.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.appzilo.sdk.Offerwall;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private final String APP_KEY = "APP_KEY"; // key can be generated in appzilo dashboard
    private final String MEMBER_ID = "MEMBER_ID"; // unique id/member id used in your app

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HashMap<String, String> params = new HashMap<>();
        // custom parameters that needed to be passed back in postback url
        params.put(Offerwall.SUB_ID, "1234567");
        params.put(Offerwall.SUB_ID2, "abcdefg");
        Offerwall.initApp(MainActivity.this
                , APP_KEY
                , MEMBER_ID
                , params);
        Button offerwallButton = findViewById(R.id.open_btn);
        offerwallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Offerwall.show();
            }
        });
    }
}
