package fen.code.loopingactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import fen.code.loopingactivity.utils.Strings;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* init number and number */
        int number = 0;
        int max = 10;

    }

    private void startLoop(int number, int max) {
        /* init intent to LoopActivity */
        Intent intent = new Intent(MainActivity.this, LoopActivity.class);
        /* init Extra INT to intent */
        intent.putExtra(Strings.EXTRA_INT, number);
        /* init Extra MAX to intent */
        intent.putExtra(Strings.EXTRA_MAX, max);
        /* start intent activity */
        startActivity(intent);
    }
}
