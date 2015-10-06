package com.example.pavel.simplex;

import android.content.Context;
import android.graphics.Color;
import android.text.InputType;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Pavel on 06.10.2015.
 */
public class ConstraintRow {
    private Context context;
    private int x_count;
    private EditText[] coefficients;

    public ConstraintRow(Context context, int x_count) {
        this.context = context;
        this.x_count = x_count;
        this.coefficients = new EditText[x_count + 1];
    }

    public LinearLayout getTableRow() {
        LinearLayout.LayoutParams rowParams = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT,1f);
        rowParams.setMargins(5,5,5,5);
        LinearLayout linearLayout = new LinearLayout(context);



        for (int i = 0; i < x_count; i++) {
            EditText coef = new EditText(context);
            coef.setInputType(InputType.TYPE_CLASS_NUMBER);

//            coef.setBackgroundColor(Color.WHITE);
            coef.setLayoutParams(rowParams);
            coef.setEms(10);
            coef.setHint("0");
            coefficients[i] = coef;
            linearLayout.addView(coef);

            TextView text = new TextView(context);
            text.setText("X" + i + " + ");
            text.setTextColor(Color.BLACK);
            if (i == x_count - 1) text.setText("X" + i + " = ");
            linearLayout.addView(text);
        }
        EditText lastCoef = new EditText(context);
        lastCoef.setInputType(InputType.TYPE_CLASS_NUMBER);
        lastCoef.setLayoutParams(rowParams);
        lastCoef.setEms(3);
        lastCoef.setHint("0");
//        lastCoef.setBackgroundColor(Color.WHITE);
        coefficients[x_count - 1] = lastCoef;
        linearLayout.addView(lastCoef);



        return linearLayout;
    }
}
