package app.hackdev.jordiie.ffcshelper;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by yogesh on 08-01-2016.
 * Message Class(Toast or Log)
 */
public class M {

    /***
     * Shows toast
     *
     * @param context context from activity or service or broadcase receiver
     * @param message message to be displayed as toast
     */
    public static void T(Context context, Object message) {
        Toast.makeText(context, message.toString(), Toast.LENGTH_SHORT).show();
    }

    /**
     * Log the message in the Logcat
     *
     * @param tag     tag for identification
     * @param message message to logged
     */
    public static void L(String tag, Object message) {
        Log.d(tag, message.toString());
    }
}