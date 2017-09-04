package org.bits_waves.waves2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class OurTeam extends AppCompatActivity {
    public ImageButton backBut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_team);
        backBut = (ImageButton) findViewById(R.id.backit);

        backBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OurTeam.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.transition.left_to_right, R.transition.right_to_left);

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.transition.left_to_right, R.transition.right_to_left);
    }


}
