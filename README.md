# TV Audio Tiles

Tiny Android TV app with two launcher tiles for the NVIDIA Shield:

| Tile | Logcat line written | tvQuickActions macro |
|------|--------------------|----------------------|
| **AirPods** | `TVQA_BT_HEADSET_ON` | switch audio to Bluetooth headset |
| **Soundbar** | `TVQA_BT_HEADSET_OFF` | switch audio back to the Sonos soundbar |

Opening a tile writes the logcat line and closes at once. tvQuickActions Pro picks it up
with a **Logcat Entry** trigger — the same lines the Home Assistant scripts send over ADB,
so the existing macros work unchanged.

## Build

GitHub Actions builds the APK on every push to `main` and publishes it at:

`https://github.com/<owner>/<repo>/releases/download/latest/tv-audio-tiles.apk`
