package nl.jurgen.tvaudiotiles;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Writes the same logcat line as the Home Assistant script
 * "TVQuickActions - Soundbar Sonos", so tvQuickActions'
 * Logcat Entry trigger runs the soundbar macro. Then closes immediately.
 */
public class SoundbarActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("TVQA_BT_HEADSET_OFF", "TVQA_BT_HEADSET_OFF");
        finish();
        overridePendingTransition(0, 0);
    }
}
