package sample.mvvm.android.android.projects.amirahmadadibi.com.mvvmsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import sample.mvvm.android.android.projects.amirahmadadibi.com.mvvmsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
     ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.tvHeading.setText("Welcome to JournalDev.com");
        binding.tvSubHeading.setText("Welcome to this Android Tutorial on DataBinding");
        
        
        binding.btnOnClickTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "this is just for test", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
