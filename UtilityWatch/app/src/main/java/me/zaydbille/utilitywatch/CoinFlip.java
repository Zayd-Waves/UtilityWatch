/*
 -----------------------------------------------------------------------
|                                                                       |
|   Author:         Waves                                               |
|   Date:           8/06/2015                                           |
|                                                                       |
 -----------------------------------------------------------------------
*/

package me.zaydbille.utilitywatch;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class CoinFlip extends Fragment implements View.OnClickListener {

    TextView    coinLabel;
    Random      randomizer;
    ImageView   mSpinningCoin;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.coin_flip,container,false);

        mSpinningCoin = (ImageView) v.findViewById(R.id.coin_spinning);
        coinLabel = (TextView) v.findViewById(R.id.coinLabel);
        mSpinningCoin.setOnClickListener(this);
        ((AnimationDrawable) mSpinningCoin.getBackground()).start();


        return v;
    }

    @Override
    public void onClick(View v) {
        randomizer = new Random();
        int number = randomizer.nextInt(2);
        coinLabel.setText("");

        if (number == 0) { // Heads
            ((AnimationDrawable) mSpinningCoin.getBackground()).stop(); // Stop any lingering animation

            mSpinningCoin.setBackgroundResource(R.drawable.coin_spin_heads);
            ((AnimationDrawable) mSpinningCoin.getBackground()).start();

            long totalDuration = 0;
            for(int i = 0; i< ((AnimationDrawable)mSpinningCoin.getBackground()).getNumberOfFrames();i++){
                totalDuration += ((AnimationDrawable)mSpinningCoin.getBackground()).getDuration(i);
            }
            Timer timer = new Timer();
            TimerTask timerTask = new TimerTask(){
                @Override
                public void run() {
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            coinLabel.setText(" Heads!");
                        }
                    });
                }
            };
            timer.schedule(timerTask, totalDuration);
        } else if (number == 1) { // Tails
            ((AnimationDrawable) mSpinningCoin.getBackground()).stop();

            mSpinningCoin.setBackgroundResource(R.drawable.coin_spin_tails);
            ((AnimationDrawable) mSpinningCoin.getBackground()).start();

            long totalDuration = 0;
            for(int i = 0; i< ((AnimationDrawable)mSpinningCoin.getBackground()).getNumberOfFrames();i++){
                totalDuration += ((AnimationDrawable)mSpinningCoin.getBackground()).getDuration(i);
            }
            Timer timer = new Timer();
            TimerTask timerTask = new TimerTask(){
                @Override
                public void run() {
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            coinLabel.setText(" Tails!");
                        }
                    });
                }
            };
            timer.schedule(timerTask, totalDuration);
        }

    }
}