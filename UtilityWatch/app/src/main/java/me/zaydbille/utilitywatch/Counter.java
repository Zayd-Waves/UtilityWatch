/*
 -----------------------------------------------------------------------
|                                                                       |
|   Author:         Waves                                               |
|   Date:           8/06/2015                                           |
|                                                                       |
 -----------------------------------------------------------------------
*/

package me.zaydbille.utilitywatch;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Counter extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.counter, container, false);

        // Initializing the view objects
        final TextView counter = (TextView) v.findViewById(R.id.counterText);
        Button addButton = (Button) v.findViewById(R.id.addButton);
        Button clearButton = (Button) v.findViewById(R.id.clearButton);
        counter.setText(((MainActivity)getActivity()).getCount() + "");

        // Listener for the Add Button
        addButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                ((MainActivity)getActivity()).addCount();
                counter.setText(((MainActivity)getActivity()).getCount() + "");
            }
        });

        // Listener for the Clear Button
        clearButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                ((MainActivity)getActivity()).clearCount();
                counter.setText(((MainActivity)getActivity()).getCount() + "");
            }
        });

        return v;
    }
}
