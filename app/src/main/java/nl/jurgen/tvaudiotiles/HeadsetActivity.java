package nl.jurgen.tvaudiotiles;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Writes the same logcat line as the Home Assistant script
 * "TVQuickActions - Bluetooth headset aan", so tvQuickActions'
 * Logcat Entry trigger runs the headset macro. Then closes immediately.
 */
public class HeadsetActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("TVQA_BT_HEADSET_ON", "TVQA_BT_HEADSET_ON");
        finish();
        overridePendingTransition(0, 0);
    }
}
