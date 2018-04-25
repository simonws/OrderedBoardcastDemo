package shopping_demo.com.orderedboardcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by ws on 18-4-25.
 */

public class MyBroadcastReceiverOne extends BroadcastReceiver {
    public MyBroadcastReceiverOne() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("MyBroadcastReceiverOne", "自定义的广播接收者one，接收到了广播事件");
        abortBroadcast();
    }
}
