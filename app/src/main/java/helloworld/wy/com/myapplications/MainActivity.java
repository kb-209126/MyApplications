package helloworld.wy.com.myapplications;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.lidroid.xutils.BitmapUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gson gson=new Gson();
        BitmapUtils utils=new BitmapUtils(this);
    }
}
