package com.rebty.team2019.Fragments;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.rebty.team2019.R;

public class RegistrationFragment extends Fragment {

    EditText fragmentRegistrationEditTextSurName, fragmentRegistrationEditTextFirstName, fragmentRegistrationEditTextEmail, fragmentRegistrationEditTextPassword, fragmentRegistrationEditTextPhone;
    Button fragmentLoginButtonRegistration;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_registration, container, false);

        fragmentRegistrationEditTextSurName = (EditText) v.findViewById(R.id.fragment_registration_editText_surName);
        fragmentRegistrationEditTextFirstName = (EditText) v.findViewById(R.id.fragment_registration_editText_firstName);
        fragmentRegistrationEditTextEmail = (EditText) v.findViewById(R.id.fragment_registration_editText_email);
        fragmentRegistrationEditTextPassword = (EditText) v.findViewById(R.id.fragment_registration_editText_password);
        fragmentRegistrationEditTextPhone = (EditText) v.findViewById(R.id.fragment_registration_editText_phone);
        fragmentLoginButtonRegistration = (Button) v.findViewById(R.id.fragment_login_button_registration);

        Typeface fontBlack = Typeface.createFromAsset(getActivity().getAssets(), "fonts/PFDinDisplayPro-Black.ttf");
        Typeface fontRegular = Typeface.createFromAsset(getActivity().getAssets(), "fonts/PFDinDisplayPro-Regular.ttf");

        fragmentRegistrationEditTextSurName.setTypeface(fontRegular);
        fragmentRegistrationEditTextFirstName.setTypeface(fontRegular);
        fragmentRegistrationEditTextEmail.setTypeface(fontRegular);
        fragmentRegistrationEditTextPassword.setTypeface(fontRegular);
        fragmentRegistrationEditTextPhone.setTypeface(fontRegular);
        fragmentLoginButtonRegistration.setTypeface(fontBlack);

        return v;
    }
}
