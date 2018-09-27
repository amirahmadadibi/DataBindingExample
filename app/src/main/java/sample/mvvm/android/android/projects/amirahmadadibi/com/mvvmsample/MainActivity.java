package sample.mvvm.android.android.projects.amirahmadadibi.com.mvvmsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //we are using ModelView as data manager in our application,simply because  letting activity do data handling is not a good idea
    /*
        Simple Rule: Don’t let your android classes handle everything. Especially not data.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
