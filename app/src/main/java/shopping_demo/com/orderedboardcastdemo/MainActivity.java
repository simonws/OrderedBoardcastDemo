package shopping_demo.com.orderedboardcastdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send();
    }

    public void send() {
        Intent intent = new Intent();
        //定义广播事件类型
        intent.setAction("Intercept_Stitch");
        //发送广播
        sendOrderedBroadcast(intent, null);
    }
}
