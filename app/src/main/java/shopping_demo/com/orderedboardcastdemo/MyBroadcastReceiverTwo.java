package shopping_demo.com.orderedboardcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by ws on 18-4-25.
 */

public class MyBroadcastReceiverTwo extends BroadcastReceiver {
    String TAG = "MyBroadcastReceiverTwo";

    public MyBroadcastReceiverTwo() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "自定义的广播接收者Two，接收到了广播事件");
    }
}
