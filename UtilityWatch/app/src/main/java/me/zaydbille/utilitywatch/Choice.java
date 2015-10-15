/*
 -----------------------------------------------------------------------
|                                                                       |
|   Author:         Waves                                               |
|   Date:           8/05/2015                                           |
|                                                                       |
 -----------------------------------------------------------------------
*/

package me.zaydbille.utilitywatch;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class Choice extends Fragment {

    Button      addChoiceButton;
    Button      chooseButton;
    Button      clearButton;
    EditText    editText;
    ListView    listView;

    // String adapter + ArrayList that handles the data of the List View
    ArrayList<String> list = new ArrayList<String>();
    ArrayAdapter<String> adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.choice,container, false);

        addChoiceButton = (Button) v.findViewById(R.id.addChoiceButton);
        chooseButton = (Button) v.findViewById(R.id.chooseButton);
        clearButton = (Button) v.findViewById(R.id.clearButton);
        editText = (EditText) v.findViewById(R.id.editText);
        listView = (ListView) v.findViewById(R.id.listView);

        // Populate the list with saved values
        list = ((MainActivity)getActivity()).getList();

        /* Old Adapter that uses a default layout for the ListView
        adapter = new ArrayAdapter<String>(getActivity(),
                                           android.R.layout.simple_list_item_1,
                                           android.R.id.text1, list);*/

        adapter = new ArrayAdapter<String>(getActivity(),
                R.layout.custom_textview, list);

        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        // Listener for the Add Choice Button
        addChoiceButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                if (editText.getText().toString().trim().length() == 0) {
                    return;
                } else {
                    list.add(editText.getText().toString());
                    ((MainActivity)getActivity()).saveList(list);
                    editText.setText("");
                    adapter.notifyDataSetChanged();
                }
            }
        });

        // Listener for the Choose Choice Button
        chooseButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                if(list.isEmpty()){
                    return;
                }
                String random = list.get(new Random().nextInt(list.size()));
                adapter.notifyDataSetChanged();
                Toast result  = Toast.makeText(getActivity(), random, Toast.LENGTH_SHORT);
                result.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                result.show();
                ((MainActivity)getActivity()).saveList(list);
            }
        });

        // Listener for the Clear Choices Button
        clearButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                if(list.isEmpty()){
                    return;
                }
                list.clear();
                adapter.notifyDataSetChanged();
                ((MainActivity)getActivity()).saveList(list);
            }
        });


        // Listener for the List View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String)list.get(position);
                adapter.remove(item);
                adapter.notifyDataSetChanged();
                ((MainActivity)getActivity()).saveList(list);
            }
        });

        return v;
    }
}