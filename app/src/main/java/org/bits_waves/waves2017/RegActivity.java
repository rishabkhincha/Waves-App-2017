package org.bits_waves.waves2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RegActivity extends AppCompatActivity {
    public ImageButton backBut1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        backBut1 = (ImageButton) findViewById(R.id.backit1);

        backBut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegActivity.this,MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.transition.enter, R.transition.exit);

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.transition.enter, R.transition.exit);
    }
}
