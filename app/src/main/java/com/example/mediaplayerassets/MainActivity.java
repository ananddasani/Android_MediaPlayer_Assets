package com.example.mediaplayerassets;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    Button playPauseButton;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playPauseButton = findViewById(R.id.playPuaseButton);
        seekBar = findViewById(R.id.seekBar);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.faded);
        mediaPlayer.start();
        mediaPlayer.pause();

        seekBar.setMax(mediaPlayer.getDuration());

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser)
                    mediaPlayer.seekTo(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        playPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Music is paused then start (initially)
                if (playPauseButton.getText().toString() == "Play") {
                    playPauseButton.setText("Pause");

                    mediaPlayer.start();
                } else {
                    playPauseButton.setText("Play");

                    mediaPlayer.pause();
                }
            }
        });
    }
}