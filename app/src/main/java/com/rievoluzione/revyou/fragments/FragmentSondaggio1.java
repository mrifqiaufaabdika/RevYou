package com.rievoluzione.revyou.fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.rievoluzione.revyou.R;
import com.rievoluzione.revyou.activities.Main;

public class FragmentSondaggio1 extends Fragment {


    Button button;
    View bulet,bulet1,bulet2,bulet3,bulet4;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sondaggio1, container, false);


        button = view.findViewById(R.id.buttonVal);
        bulet = view.findViewById(R.id.butllet);
        bulet1 = view.findViewById(R.id.butllet1);
        bulet2 = view.findViewById(R.id.butllet2);
        bulet3 = view.findViewById(R.id.butllet3);
        bulet4 = view.findViewById(R.id.butllet4);

        CheckBox checkBox = (CheckBox) view.findViewById(R.id.cbok);
        CheckBox checkBox1 = (CheckBox) view.findViewById(R.id.cbok1);
        CheckBox checkBox2 = (CheckBox) view.findViewById(R.id.cbok2);
        CheckBox checkBox4 = (CheckBox) view.findViewById(R.id.cbok4);
       // CheckBox checkBox3 = (CheckBox) view.findViewById(R.id.cbok3);
        removeRippleEffectFromCheckBox(checkBox);
        removeRippleEffectFromCheckBox(checkBox1);
        removeRippleEffectFromCheckBox(checkBox2);
        removeRippleEffectFromCheckBox(checkBox4);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Main.class);
                startActivity(intent);
            }
        });

        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                buttonView.setTextColor(getResources().getColor(R.color.blue));
                this.getActivity();
                bulet.setVisibility(View.VISIBLE);

            }

            button.setBackground(getResources().getDrawable(R.drawable.buttone1));
            button.setTextColor(getResources().getColor(R.color.colorWhite));

            //button.setLayoutParams(new LinearLayout.LayoutParams(FlowLayout.LayoutParams.WRAP_CONTENT,FlowLayout.LayoutParams.WRAP_CONTENT));


            if (!isChecked) {
                buttonView.setTextColor(getResources().getColor(R.color.colorTextdark));
                checkBox.setText("Pubblicità sui social");
                bulet.setVisibility(View.GONE);
                button.setBackground(getResources().getDrawable(R.drawable.bg_disable_button));
                button.setTextColor(getResources().getColor(R.color.colorTextDark2));
            }

        });

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    buttonView.setTextColor(getResources().getColor(R.color.blue));
                    bulet1.setVisibility(View.VISIBLE);

                }

                button.setBackground(getResources().getDrawable(R.drawable.buttone1));
                button.setTextColor(getResources().getColor(R.color.colorWhite));

                //button.setLayoutParams(new LinearLayout.LayoutParams(FlowLayout.LayoutParams.WRAP_CONTENT,FlowLayout.LayoutParams.WRAP_CONTENT));


                if (!isChecked) {
                    buttonView.setTextColor(getResources().getColor(R.color.colorTextdark));
                    checkBox1.setText("Risultati ricerche Google");
                    bulet1.setVisibility(View.GONE);
                    button.setBackground(getResources().getDrawable(R.drawable.bg_disable_button));
                    button.setTextColor(getResources().getColor(R.color.colorTextDark2));
                }

            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    buttonView.setTextColor(getResources().getColor(R.color.blue));
                    bulet3.setVisibility(View.VISIBLE);

                }

                button.setBackground(getResources().getDrawable(R.drawable.buttone1));
                button.setTextColor(getResources().getColor(R.color.colorWhite));

                //button.setLayoutParams(new LinearLayout.LayoutParams(FlowLayout.LayoutParams.WRAP_CONTENT,FlowLayout.LayoutParams.WRAP_CONTENT));


                if (!isChecked) {
                    buttonView.setTextColor(getResources().getColor(R.color.colorTextdark));
                    checkBox2.setText("Altro");
                    bulet3.setVisibility(View.GONE);
                    button.setBackground(getResources().getDrawable(R.drawable.bg_disable_button));
                    button.setTextColor(getResources().getColor(R.color.colorTextDark2));
                }

            }
        });
        checkBox4.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                buttonView.setTextColor(getResources().getColor(R.color.blue));
                bulet4.setVisibility(View.VISIBLE);

            }

            button.setBackground(getResources().getDrawable(R.drawable.buttone1));
            button.setTextColor(getResources().getColor(R.color.colorWhite));

            //button.setLayoutParams(new LinearLayout.LayoutParams(FlowLayout.LayoutParams.WRAP_CONTENT,FlowLayout.LayoutParams.WRAP_CONTENT));


            if (!isChecked) {
                buttonView.setTextColor(getResources().getColor(R.color.colorTextdark));
                checkBox4.setText("Colleghi/Amici");
                bulet4.setVisibility(View.GONE);
                button.setBackground(getResources().getDrawable(R.drawable.bg_disable_button));
                button.setTextColor(getResources().getColor(R.color.colorTextDark2));
            }

        });

        return view;

    }
    private void removeRippleEffectFromCheckBox(CheckBox checkBox) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Drawable drawable = checkBox.getBackground();
            if (drawable instanceof RippleDrawable) {
                drawable = ((RippleDrawable) drawable).findDrawableByLayerId(0);
                checkBox.setBackground(drawable);
            }
        }
    }

}
