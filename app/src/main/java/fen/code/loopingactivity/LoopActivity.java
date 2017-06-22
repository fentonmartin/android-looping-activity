package fen.code.loopingactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

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
    }
}
