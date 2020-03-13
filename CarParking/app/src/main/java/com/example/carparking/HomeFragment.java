package com.example.carparking;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import org.w3c.dom.Text;

public class HomeFragment extends Fragment implements View.OnClickListener {

    TextView profile, about, settings, feedback, btn1, logout, welcome;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_home, container, false);

        btn1 = (TextView) v.findViewById(R.id.findLotID);
        profile = (TextView) v.findViewById(R.id.profileID);
        about = (TextView) v.findViewById(R.id.aboutID);
        settings = (TextView) v.findViewById(R.id.settingsID);
        feedback = (TextView) v.findViewById(R.id.feedbackID);
        logout = (TextView) v.findViewById(R.id.logoutID);
        welcome = (TextView) v.findViewById(R.id.welcomeHomeID);

        btn1.setOnClickListener(this);
        profile.setOnClickListener(this);
        about.setOnClickListener(this);
        settings.setOnClickListener(this);
        feedback.setOnClickListener(this);
        logout.setOnClickListener(this);
        welcome.setOnClickListener(this);

        return v;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onClick(View v) {
        Fragment fragment;
        if(v.getId()==R.id.findLotID){
            fragment = new FindLotFragment();
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragmentID, fragment).commit();
        }
        else if(v.getId()==R.id.profileID){
            fragment = new ProfileFragment();
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragmentID, fragment).commit();
        }
        else if(v.getId()==R.id.settingsID){
            fragment = new SettingsFragment();
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragmentID, fragment).commit();
        }
        else if(v.getId()==R.id.feedbackID){
            fragment = new FeedbackFragment();
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragmentID, fragment).commit();
        }
        else if(v.getId()==R.id.aboutID){
            fragment = new AboutFragment();
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragmentID, fragment).commit();
        }
        else if(v.getId()==R.id.logoutID){
            getActivity().finish();
            System.exit(0);
        }
        else if(v.getId()==R.id.welcomeHomeID){
            YoYo.with(Techniques.Tada)
                    .duration(700)
                    .repeat(1)
                    .playOn(profile);
            YoYo.with(Techniques.Tada)
                    .duration(700)
                    .repeat(1)
                    .playOn(btn1);
            YoYo.with(Techniques.Tada)
                    .duration(700)
                    .repeat(1)
                    .playOn(settings);
            YoYo.with(Techniques.Tada)
                    .duration(700)
                    .repeat(1)
                    .playOn(about);
            YoYo.with(Techniques.Tada)
                    .duration(700)
                    .repeat(1)
                    .playOn(feedback);
            YoYo.with(Techniques.Tada)
                    .duration(700)
                    .repeat(1)
                    .playOn(logout);
        }
    }
}
