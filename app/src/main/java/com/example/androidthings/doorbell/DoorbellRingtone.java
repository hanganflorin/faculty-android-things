package com.example.androidthings.doorbell;

import android.content.Context;
import android.media.MediaPlayer;

class DoorbellRingtone {
    private MediaPlayer mediaPlayer;

    DoorbellRingtone(Context context) {
        mediaPlayer = MediaPlayer.create(context, R.raw.doorbell);
    }

    void play() {
        mediaPlayer.start();
    }

}
