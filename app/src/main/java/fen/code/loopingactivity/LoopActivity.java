package fen.code.loopingactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import fen.code.loopingactivity.utils.Strings;

public class LoopActivity extends AppCompatActivity {

    int number;
    int max;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop);

        /* init number using getIntExtra from intent default 0*/
        number = getIntent().getIntExtra(Strings.EXTRA_INT, 0);
        /* init max using getIntExtra from intent default 1*/
        max = getIntent().getIntExtra(Strings.EXTRA_MAX, 1);

        /* set number incremental */
        number++;

        /* init TextView */
        TextView textView = (TextView) findViewById(R.id.textview);
        /* set number on TextView */
        textView.setText(String.valueOf(number));

        /* declare button */
        Button button = (Button) findViewById(R.id.button);
        /* add setOnClickListener */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* call activityLoop */
                activityLoop(number, max);
            }
        });

        /* add maximum number loop */
        if (number >= max) {
            /* add alpha on button */
            button.setAlpha((float) 0.5);
            /* add enabled false on button */
            button.setEnabled(false);
            /* add last toast */
            Toast.makeText(this, "This is the last activity", Toast.LENGTH_SHORT).show();
        }
    }

    private void activityLoop(int number, int max) {
        /* init intent to LoopActivity */
        Intent intent = new Intent(LoopActivity.this, LoopActivity.class);
        /* init Extra INT to intent */
        intent.putExtra(Strings.EXTRA_INT, number);
        /* init Extra MAX to intent */
        intent.putExtra(Strings.EXTRA_MAX, max);
        /* start intent activity */
        startActivity(intent);
    }
}
