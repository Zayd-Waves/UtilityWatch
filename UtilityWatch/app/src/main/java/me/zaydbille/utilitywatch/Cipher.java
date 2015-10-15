/*
 -----------------------------------------------------------------------
|                                                                       |
|   Author:         Waves                                               |
|   Date:           8/18/2015                                           |
|                                                                       |
 -----------------------------------------------------------------------
*/

package me.zaydbille.utilitywatch;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.ShareActionProvider;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class Cipher extends Fragment {

    EditText                   editText;
    Button                     encryptButton;
    Button                     decryptButton;
    NumberPicker               numPicker;
    TextView                   cipherMessage;
    Character lettersLower[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    Character lettersUpper[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                                'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.cipher,container, false);

        numPicker = (NumberPicker)v.findViewById(R.id.numberPicker);
        numPicker.setMaxValue(25);
        numPicker.setMinValue(1);
        numPicker.setWrapSelectorWheel(false);

        editText = (EditText)v.findViewById(R.id.editText);
        encryptButton = (Button)v.findViewById(R.id.encryptButton);
        decryptButton = (Button)v.findViewById(R.id.decryptButton);
        cipherMessage = (TextView)v.findViewById(R.id.cipherMessage);

        encryptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cipherMessage.setText(cipher(editText.getText().toString(), numPicker.getValue()));
            }
        });

        decryptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cipherMessage.setText(reverseCipher(editText.getText().toString(), (numPicker.getValue())));
            }
        });
        return v;
    }


    // Caesar encryption method
    private String cipher(String message, int shift) {
        String s = "";

        for(int i = 0; i < message.length(); i++) {
            char c = (char)(message.charAt(i));
            int letterPosition = 0;
            if (c >= 'A' && c <= 'Z') {
                for(int j = 0; j < lettersUpper.length; j++) {
                    if(lettersUpper[j].equals(c)) {
                        letterPosition = j;
                    }
                }
                letterPosition += shift;
                if(letterPosition > 25) {
                    letterPosition = letterPosition - 26;
                }
                s += lettersUpper[letterPosition];
            } else if (c >= 'a' && c <= 'z') {
                for(int j = 0; j < lettersLower.length; j++) {
                    if(lettersLower[j].equals(c)) {
                        letterPosition = j;
                    }
                }
                letterPosition += shift;
                if(letterPosition > 25) {
                    letterPosition = letterPosition - 26;
                }
                s += lettersLower[letterPosition];
            } else {
                s += c;
            }
        }

        return s;
    }

    private String reverseCipher(String message, int shift) {
        String s = "";

        for(int i = 0; i < message.length(); i++) {
            char c = (char)(message.charAt(i));
            int letterPosition = 0;
            if (c >= 'A' && c <= 'Z') {
                for(int j = 0; j < lettersUpper.length; j++) {
                    if(lettersUpper[j] == c) {
                        letterPosition = j;
                    }
                }
                letterPosition -= shift;
                if(letterPosition < 0) {
                    letterPosition = 26 + letterPosition;
                }
                s += lettersUpper[letterPosition];
            } else if (c >= 'a' && c <= 'z') {
                for(int j = 0; j < lettersLower.length; j++) {
                    if(lettersLower[j] == c) {
                        letterPosition = j;
                    }
                }
                letterPosition -= shift;
                if(letterPosition < 0) {
                    letterPosition = 26 + letterPosition;
                }
                s += lettersLower[letterPosition];
            } else {
                s += c;
            }
        }

        return s;
    }
}