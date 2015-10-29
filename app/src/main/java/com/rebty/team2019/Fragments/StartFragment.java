package com.rebty.team2019.Fragments;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.rebty.team2019.R;

public class StartFragment extends Fragment {

    Button fragmentStartButtonRegistration, fragmentStartButtonLogin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_start, container, false);

        fragmentStartButtonRegistration = (Button) v.findViewById(R.id.fragment_start_button_registration);
        fragmentStartButtonLogin = (Button) v.findViewById(R.id.fragment_start_button_login);

        Typeface fontBlack = Typeface.createFromAsset(getActivity().getAssets(), "fonts/PFDinDisplayPro-Black.ttf");

        fragmentStartButtonRegistration.setTypeface(fontBlack);
        fragmentStartButtonLogin.setTypeface(fontBlack);

        return v;
    }
}
