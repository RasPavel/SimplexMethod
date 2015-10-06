package com.example.pavel.simplex;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {



    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.fragment_main, container, false);


        Context context = getActivity().getApplicationContext();
        Context context2 = inflater.getContext();

        int rows = 10;

        LinearLayout constraintsLayout = (LinearLayout) view.findViewById(R.id.constraints_layout);
        //constraintsLayout.setBackgroundColor(Color.BLUE);





        for (int i = 0; i < rows; i++) {
            ConstraintRow cRow = new ConstraintRow(context, 3);
            LinearLayout row = cRow.getTableRow();

            constraintsLayout.addView(row);
        }

        return view;
    }


}
