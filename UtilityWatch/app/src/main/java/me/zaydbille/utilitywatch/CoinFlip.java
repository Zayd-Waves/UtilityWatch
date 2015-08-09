/*
 -----------------------------------------------------------------------
|                                                                       |
|   Author:         Waves                                               |
|   Date:           8/06/2015                                           |
|                                                                       |
 -----------------------------------------------------------------------
*/

package me.zaydbille.utilitywatch;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class CoinFlip extends Fragment {

    Button      flipButton;
    Random      randomizer;
    ImageView   mSpinningCoin;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.coin_flip,container,false);

        flipButton = (Button) v.findViewById(R.id.flipButton);
        mSpinningCoin = (ImageView) v.findViewById(R.id.coin_spinning);

        flipButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                randomizer = new Random();
                int number = randomizer.nextInt(2);

                if (number == 0) { // Heads
                    ((AnimationDrawable) mSpinningCoin.getBackground()).stop();
                    mSpinningCoin.setBackgroundResource(R.drawable.coin_spin_heads);
                    ((AnimationDrawable) mSpinningCoin.getBackground()).start();
                } else if (number == 1) { // Tails
                    ((AnimationDrawable) mSpinningCoin.getBackground()).stop();
                    mSpinningCoin.setBackgroundResource(R.drawable.coin_spin_tails);
                    ((AnimationDrawable) mSpinningCoin.getBackground()).start();
                }
            }
        });

        return v;
    }
}