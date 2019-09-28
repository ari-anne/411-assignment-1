package com.cpsc411.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        constants
        int ROWS = 11;
        int COLUMNS = 5;
        int CENTER_ALIGN = View.TEXT_ALIGNMENT_CENTER;
        int RIGHT_ALIGN = View.TEXT_ALIGNMENT_VIEW_END;
        int LEFT_ALIGN = View.TEXT_ALIGNMENT_INHERIT;
        int CLEAR = Color.TRANSPARENT;
        int BLACK = Color.BLACK;
        int WHITE = Color.WHITE;
        int LTGRAY = getResources().getColor(R.color.gray);
        int CYAN = getResources().getColor(R.color.cyan);
        int YELLOW = getResources().getColor(R.color.yellow);
        int ORANGE = getResources().getColor(R.color.orange);

//        variables used and changed in every cell
        TextView tv;
        String text;

//        allow horizontal scrolling
        HorizontalScrollView hsv = new HorizontalScrollView(this);

//        layout for contents
        GridLayout layout = new GridLayout(this);

        ViewGroup.LayoutParams view_params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

//        set table layout
        layout.setLayoutParams(view_params);
        layout.setColumnCount(COLUMNS);
        layout.setRowCount(ROWS);
        layout.setUseDefaultMargins(true);

//        row numbers
        for(int i = 0; i < ROWS; i++) {
            tv = setTextView(Integer.toString(i+1), CENTER_ALIGN,  LTGRAY, BLACK, false);
            tv = setGridSpecs(tv, i, 0, 1, 1);
            layout.addView(tv);
        }

//        row 1
        text = "Rules void hello1(int hour)";
        tv = setTextView(text, CENTER_ALIGN, BLACK, WHITE, false);
        tv = setGridSpecs(tv, 0, 1, 1, 4);
        layout.addView(tv);

//        row 2
        text = "properties";
        tv = setTextView(text, CENTER_ALIGN, CLEAR, BLACK, false);
        tv = setGridSpecs(tv, 1, 1, 2, 1);
        layout.addView(tv);

        text = "name";
        tv = setTextView(text, CENTER_ALIGN, CLEAR, BLACK, false);
        tv = setGridSpecs(tv, 1, 2, 1, 2);
        layout.addView(tv);

        text = "Day Hour Classification";
        tv = setTextView(text, LEFT_ALIGN, CLEAR, BLACK, false);
        tv = setGridSpecs(tv, 1, 4, 1, 1);
        layout.addView(tv);

//        row 3
        text = "category";
        tv = setTextView(text, CENTER_ALIGN, CLEAR, BLACK, false);
        tv = setGridSpecs(tv, 2, 2, 1, 2);
        layout.addView(tv);

        text = "Day and Time";
        tv = setTextView(text, LEFT_ALIGN, CLEAR, BLACK, false);
        tv = setGridSpecs(tv, 2, 4, 1, 1);
        layout.addView(tv);

//        row 4
        text = "Rule";
        tv = setTextView(text, CENTER_ALIGN, CYAN, BLACK, true);
        tv = setGridSpecs(tv, 3, 1, 1, 1);
        layout.addView(tv);

        text = "C1";
        tv = setTextView(text, CENTER_ALIGN, CYAN, BLACK, true);
        tv = setGridSpecs(tv, 3, 2, 1, 2);
        layout.addView(tv);

        text = "A1";
        tv = setTextView(text, CENTER_ALIGN, CYAN, BLACK, true);
        tv = setGridSpecs(tv, 3, 4, 1, 1);
        layout.addView(tv);

//        row 5
        text = "";
        tv = setTextView(text, LEFT_ALIGN, CYAN, BLACK, false);
        tv = setGridSpecs(tv, 4, 1, 1, 1);
        layout.addView(tv);

        text = "min <= hour && hour <= max";
        tv = setTextView(text, CENTER_ALIGN, CYAN, BLACK, false);
        tv = setGridSpecs(tv, 4, 2, 1, 2);
        layout.addView(tv);

        text = "System.out.println(greeting + \", World!\")";
        tv = setTextView(text, CENTER_ALIGN, CYAN, BLACK, false);
        tv = setGridSpecs(tv, 4, 4, 1, 1);
        layout.addView(tv);

//        row 6
        text = "";
        tv = setTextView(text, LEFT_ALIGN, CYAN, BLACK, false);
        tv = setGridSpecs(tv, 5, 1, 1, 1);
        layout.addView(tv);

        text = "int min";
        tv = setTextView(text, CENTER_ALIGN, CYAN, BLACK, false);
        tv = setGridSpecs(tv, 5, 2, 1, 1);
        tv.setWidth(225);       // hard coded value to align the columns
        layout.addView(tv);

        text = "int max";
        tv = setTextView(text, CENTER_ALIGN, CYAN, BLACK, false);
        tv = setGridSpecs(tv, 5, 3, 1, 1);
        layout.addView(tv);

        text = "String greeting";
        tv = setTextView(text, CENTER_ALIGN, CYAN, BLACK, false);
        tv = setGridSpecs(tv, 5, 4, 1, 1);
        layout.addView(tv);

//        row 7
        text = "Rule";
        tv = setTextView(text, LEFT_ALIGN, CLEAR, BLACK, true);
        tv = setGridSpecs(tv, 6, 1, 1, 1);
        layout.addView(tv);

        text = "From";
        tv = setTextView(text, LEFT_ALIGN, YELLOW, BLACK, true);
        tv = setGridSpecs(tv, 6, 2, 1, 1);
        layout.addView(tv);

        text = "To";
        tv = setTextView(text, LEFT_ALIGN, YELLOW, BLACK, true);
        tv = setGridSpecs(tv, 6, 3, 1, 1);
        layout.addView(tv);

        text = "Greeting";
        tv = setTextView(text, LEFT_ALIGN, ORANGE, BLACK, true);
        tv = setGridSpecs(tv, 6, 4, 1, 1);
        layout.addView(tv);

//        row 8
        text = "R10";
        tv = setTextView(text, LEFT_ALIGN, CLEAR, BLACK, false);
        tv = setGridSpecs(tv, 7, 1, 1, 1);
        layout.addView(tv);

        text = "0";
        tv = setTextView(text, RIGHT_ALIGN, YELLOW, BLACK, false);
        tv = setGridSpecs(tv, 7, 2, 1, 1);
        layout.addView(tv);

        text = "11";
        tv = setTextView(text, RIGHT_ALIGN, YELLOW, BLACK, false);
        tv = setGridSpecs(tv, 7, 3, 1, 1);
        layout.addView(tv);

        text = "Good Morning";
        tv = setTextView(text, LEFT_ALIGN, ORANGE, BLACK, false);
        tv = setGridSpecs(tv, 7, 4, 1, 1);
        layout.addView(tv);

//        row 9
        text = "R20";
        tv = setTextView(text, LEFT_ALIGN, CLEAR, BLACK, false);
        tv = setGridSpecs(tv, 8, 1, 1, 1);
        layout.addView(tv);

        text = "12";
        tv = setTextView(text, RIGHT_ALIGN, YELLOW, BLACK, false);
        tv = setGridSpecs(tv, 8, 2, 1, 1);
        layout.addView(tv);

        text = "17";
        tv = setTextView(text, RIGHT_ALIGN, YELLOW, BLACK, false);
        tv = setGridSpecs(tv, 8, 3, 1, 1);
        layout.addView(tv);

        text = "Good Afternoon";
        tv = setTextView(text, LEFT_ALIGN, ORANGE, BLACK, false);
        tv = setGridSpecs(tv, 8, 4, 1, 1);
        layout.addView(tv);

//        row 10
        text = "R30";
        tv = setTextView(text, LEFT_ALIGN, CLEAR, BLACK, false);
        tv = setGridSpecs(tv, 9, 1, 1, 1);
        layout.addView(tv);

        text = "18";
        tv = setTextView(text, RIGHT_ALIGN, YELLOW, BLACK, false);
        tv = setGridSpecs(tv, 9, 2, 1, 1);
        layout.addView(tv);

        text = "21";
        tv = setTextView(text, RIGHT_ALIGN, YELLOW, BLACK, false);
        tv = setGridSpecs(tv, 9, 3, 1, 1);
        layout.addView(tv);

        text = "Good Evening";
        tv = setTextView(text, LEFT_ALIGN, ORANGE, BLACK, false);
        tv = setGridSpecs(tv, 9, 4, 1, 1);
        layout.addView(tv);

//        row 11
        text = "R40";
        tv = setTextView(text, LEFT_ALIGN, CLEAR, BLACK, false);
        tv = setGridSpecs(tv, 10, 1, 1, 1);
        layout.addView(tv);

        text = "22";
        tv = setTextView(text, RIGHT_ALIGN, YELLOW, BLACK, false);
        tv = setGridSpecs(tv, 10, 2, 1, 1);
        layout.addView(tv);

        text = "23";
        tv = setTextView(text, RIGHT_ALIGN, YELLOW, BLACK, false);
        tv = setGridSpecs(tv, 10, 3, 1, 1);
        layout.addView(tv);

        text = "Good Night";
        tv = setTextView(text, LEFT_ALIGN, ORANGE, BLACK, false);
        tv = setGridSpecs(tv, 10, 4, 1, 1);
        layout.addView(tv);


        hsv.addView(layout);

//        java
        setContentView(hsv);

//        XML
//        setContentView(R.layout.activity_main);

    }

    TextView setTextView(String text, int alignment, int bkgdColor, int textColor, boolean isBold) {
        TextView tv = new TextView(this);
        tv.setText(text);
        tv.setBackgroundColor(bkgdColor);
        tv.setTextColor(textColor);
        tv.setTextAlignment(alignment);
        tv.setGravity(Gravity.FILL_HORIZONTAL);
        if(isBold){
            tv.setTypeface(null, Typeface.BOLD);
        }
        return tv;
    }

    TextView setGridSpecs(TextView tv, int row, int col, int row_size, int col_size) {
        GridLayout.Spec row_spec = GridLayout.spec(row, row_size, GridLayout.CENTER, 1f);
        GridLayout.Spec col_spec = GridLayout.spec(col, col_size, 1f);
        GridLayout.LayoutParams spec_params = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(spec_params);
        return tv;
    }
}
