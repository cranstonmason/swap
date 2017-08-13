package com.lollipop.swap;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Created by Cranston Mason on 14/07/2017.
 */

public class Tab1 extends Fragment {

    /**
     * Variables initialized globally
     */
    public Spinner baseCurr_spin;
    public Button checkRate;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.tab_1, container, false); //Initialise a new View

        baseCurr_spin = (Spinner) v.findViewById(R.id.baseCurr_spin); //drop down list of base currencies
        checkRate = (Button) v.findViewById(R.id.checkRate); //check rate button

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.currency,
                android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_selectable_list_item);
        baseCurr_spin.setAdapter(adapter);

        /*baseCurr_spin.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });*/

        return v;

    }
}
