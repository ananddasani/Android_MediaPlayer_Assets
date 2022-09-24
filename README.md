# Android_MediaPlayer_Assets
Playing Music From Assets with seek bar

This topic is a part of [My Complete Andorid Course](https://github.com/ananddasani/Android_Apps)

# Code

#### MainActivity.java
```
Button playPauseButton;
SeekBar seekBar;
    
    MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.faded);
        mediaPlayer.start();
        mediaPlayer.pause();
        
        //working of seek bar
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

        //working of button
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
```

# App Highlight

![Media Player Assets App](https://user-images.githubusercontent.com/74413402/192093057-31b37880-eeb3-4ad2-bec3-1eca0ff8cdbe.png)
![Media Player Assets Code](https://user-images.githubusercontent.com/74413402/192093059-8cca0276-4b71-4b68-9619-8ad9b7e55547.png)
