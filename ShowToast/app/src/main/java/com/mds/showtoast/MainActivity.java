package com.mds.showtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }


    public void showLeToast(View view) {

        String leToast = "";

        CheckBox Choco = (CheckBox)findViewById(R.id.chkChocoSyrup);
        CheckBox Sprinkles = (CheckBox)findViewById(R.id.chkSprinkles);
        CheckBox CrushNuts = (CheckBox)findViewById(R.id.chkCrushNuts);
        CheckBox Cherries = (CheckBox)findViewById(R.id.chkCherries);
        CheckBox OrioCookie = (CheckBox)findViewById(R.id.chkOrioCookieCrumbles);

        if(Choco.isChecked())
            leToast += " "+getResources().getString(R.string.chk_choco_syrup);
        if(Sprinkles.isChecked())
            leToast += " "+getResources().getString(R.string.chk_sprinkles);
        if(CrushNuts.isChecked())
            leToast += " "+getResources().getString(R.string.chk_crush_nuts);
        if(Cherries.isChecked())
            leToast += " "+getResources().getString(R.string.chk_cherries);
        if(OrioCookie.isChecked())
            leToast += " "+getResources().getString(R.string.chk_orio_cc);

        displayToast(leToast);
    }
}
