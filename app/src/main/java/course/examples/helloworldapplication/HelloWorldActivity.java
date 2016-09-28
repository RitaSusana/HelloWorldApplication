package course.examples.helloworldapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        Button nextButton = (Button) findViewById(R.id.btnNext);
        nextButton.SetOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent i = new Intent(HelloWorldActivity.this, NextActivity.class);
                startActivity(i);
            }
        });
    }



}
