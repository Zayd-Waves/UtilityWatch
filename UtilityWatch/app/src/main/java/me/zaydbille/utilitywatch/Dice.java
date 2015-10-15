/*
 -----------------------------------------------------------------------
|                                                                       |
|   Author:         Waves                                               |
|   Date:           8/18/2015                                           |
|                                                                       |
 -----------------------------------------------------------------------
*/

package me.zaydbille.utilitywatch;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

import java.util.Random;

public class Dice extends Fragment{

    View        v;
    TextView    diceLabel;
    Random      randomizer;
    ImageView   firstDice;
    ImageView   secondDice;
    RadioGroup  diceNumberSelector;
    RadioGroup  diceAmountSelector;
    int diceNumber = 6; // Acts as a boolean value and indicates if the current dice number is 6, 12 or 20.
    int diceAmount = 1; // Same as above

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.dice,container,false);

        firstDice = (ImageView) v.findViewById(R.id.firstDice);
        secondDice = (ImageView) v.findViewById(R.id.secondDice);
        diceLabel = (TextView) v.findViewById(R.id.diceLabel);

        firstDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // could use switch statements instead
                if(diceNumber == 6){
                    randomizer = new Random();
                    int number = randomizer.nextInt(7);

                    if (number == 1) {
                        firstDice.setBackgroundResource(R.drawable.dice6_animation_1);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if(number == 2) {
                        firstDice.setBackgroundResource(R.drawable.dice6_animation_2);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if(number == 3) {
                        firstDice.setBackgroundResource(R.drawable.dice6_animation_3);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 4) {
                        firstDice.setBackgroundResource(R.drawable.dice6_animation_4);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 5) {
                        firstDice.setBackgroundResource(R.drawable.dice6_animation_5);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 6) {
                        firstDice.setBackgroundResource(R.drawable.dice6_animation_6);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    }

                } else if(diceNumber == 12) {
                    randomizer = new Random();
                    int number = randomizer.nextInt(13);

                    if (number == 1) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_1);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if(number == 2) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_2);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if(number == 3) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_3);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 4) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_4);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 5) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_5);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 6) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_6);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 7) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_7);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 8) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_8);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 9) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_9);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 10) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_10);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 11) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_11);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 12) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_12);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    }

                } else if(diceNumber == 20) {
                    randomizer = new Random();
                    int number = randomizer.nextInt(21);

                    if (number == 1) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_1);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if(number == 2) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_2);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if(number == 3) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_3);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 4) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_4);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 5) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_5);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 6) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_6);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 7) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_7);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 8) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_8);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 9) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_9);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 10) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_10);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 11) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_11);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 12) {
                        firstDice.setBackgroundResource(R.drawable.dice12_animation_12);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 13) {
                        firstDice.setBackgroundResource(R.drawable.dice20_animation_13);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 14) {
                        firstDice.setBackgroundResource(R.drawable.dice20_animation_14);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 15) {
                        firstDice.setBackgroundResource(R.drawable.dice20_animation_15);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 16) {
                        firstDice.setBackgroundResource(R.drawable.dice20_animation_16);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 17) {
                        firstDice.setBackgroundResource(R.drawable.dice20_animation_17);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 18) {
                        firstDice.setBackgroundResource(R.drawable.dice20_animation_18);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 19) {
                        firstDice.setBackgroundResource(R.drawable.dice20_animation_19);
                        ((AnimationDrawable) firstDice.getBackground()).start();

                    } else if (number == 20) {
                        firstDice.setBackgroundResource(R.drawable.dice20_animation_20);
                        ((AnimationDrawable) firstDice.getBackground()).start();
                    }
                }
                diceLabel.setText("");
            }
        });

        secondDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // could use switch statements instead
                if(diceNumber == 6){
                    randomizer = new Random();
                    int number = randomizer.nextInt(7);

                    if (number == 1) {
                        secondDice.setBackgroundResource(R.drawable.dice6_animation_1);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if(number == 2) {
                        secondDice.setBackgroundResource(R.drawable.dice6_animation_2);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if(number == 3) {
                        secondDice.setBackgroundResource(R.drawable.dice6_animation_3);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 4) {
                        secondDice.setBackgroundResource(R.drawable.dice6_animation_4);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 5) {
                        secondDice.setBackgroundResource(R.drawable.dice6_animation_5);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 6) {
                        secondDice.setBackgroundResource(R.drawable.dice6_animation_6);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    }

                } else if(diceNumber == 12) {
                    randomizer = new Random();
                    int number = randomizer.nextInt(13);

                    if (number == 1) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_1);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if(number == 2) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_2);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if(number == 3) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_3);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 4) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_4);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 5) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_5);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 6) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_6);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 7) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_7);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 8) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_8);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 9) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_9);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 10) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_10);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 11) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_11);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 12) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_12);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    }

                } else if(diceNumber == 20) {
                    randomizer = new Random();
                    int number = randomizer.nextInt(21);

                    if (number == 1) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_1);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if(number == 2) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_2);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if(number == 3) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_3);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 4) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_4);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 5) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_5);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 6) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_6);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 7) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_7);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 8) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_8);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 9) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_9);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 10) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_10);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 11) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_11);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 12) {
                        secondDice.setBackgroundResource(R.drawable.dice12_animation_12);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 13) {
                        secondDice.setBackgroundResource(R.drawable.dice20_animation_13);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 14) {
                        secondDice.setBackgroundResource(R.drawable.dice20_animation_14);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 15) {
                        secondDice.setBackgroundResource(R.drawable.dice20_animation_15);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 16) {
                        secondDice.setBackgroundResource(R.drawable.dice20_animation_16);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 17) {
                        secondDice.setBackgroundResource(R.drawable.dice20_animation_17);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 18) {
                        secondDice.setBackgroundResource(R.drawable.dice20_animation_18);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 19) {
                        secondDice.setBackgroundResource(R.drawable.dice20_animation_19);
                        ((AnimationDrawable) secondDice.getBackground()).start();

                    } else if (number == 20) {
                        secondDice.setBackgroundResource(R.drawable.dice20_animation_20);
                        ((AnimationDrawable) secondDice.getBackground()).start();
                    }
                }
                diceLabel.setText("");
            }
        });

        diceNumberSelector = (RadioGroup) v.findViewById(R.id.diceNumberSelector);
        diceAmountSelector = (RadioGroup) v.findViewById(R.id.diceAmountSelector);

        diceNumberSelector.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checkedButton = (RadioButton) v.findViewById(checkedId);
                if (checkedButton.getText().equals("6 Sided Dice")) {
                    diceNumber = 6;
                    firstDice.setBackgroundResource(R.mipmap.dice_6);
                    secondDice.setBackgroundResource(R.mipmap.dice_6);

                } else if (checkedButton.getText().equals("12 Sided Dice")) {
                    diceNumber = 12;
                    firstDice.setBackgroundResource(R.mipmap.dice12_12);
                    secondDice.setBackgroundResource(R.mipmap.dice12_12);

                } else if (checkedButton.getText().equals("20 Sided Dice")) {
                    diceNumber = 20;
                    firstDice.setBackgroundResource(R.mipmap.dice20_20);
                    secondDice.setBackgroundResource(R.mipmap.dice20_20);
                }
            }
        });

        diceAmountSelector.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checkedButton = (RadioButton) v.findViewById(checkedId);
                if (checkedButton.getText().toString().equals("1 Dice")) {
                    secondDice.setVisibility(View.GONE);
                    diceAmount = 1;
                } else if (checkedButton.getText().toString().equals("2 Dice")) {
                    secondDice.setVisibility(View.VISIBLE);
                    diceAmount = 2;
                }
            }
        });

        secondDice.setVisibility(View.GONE); // Invisible by deafult
        return v;
    }
}