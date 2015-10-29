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

public class LoginFragment extends Fragment {

    EditText fragmentLoginEditTextEmail, fragmentLoginEditTextPassword;
    Button fragmentLoginButtonLogin, fragmentLoginButtonForgetPassword;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_login, container, false);

        fragmentLoginEditTextEmail = (EditText) v.findViewById(R.id.fragment_login_editText_email);
        fragmentLoginEditTextPassword = (EditText) v.findViewById(R.id.fragment_login_editText_password);
        fragmentLoginButtonLogin = (Button) v.findViewById(R.id.fragment_login_button_login);
        fragmentLoginButtonForgetPassword = (Button) v.findViewById(R.id.fragment_login_button_forgetPassword);

        Typeface fontBlack = Typeface.createFromAsset(getActivity().getAssets(), "fonts/PFDinDisplayPro-Black.ttf");
        Typeface fontRegular = Typeface.createFromAsset(getActivity().getAssets(), "fonts/PFDinDisplayPro-Regular.ttf");

        fragmentLoginEditTextEmail.setTypeface(fontRegular);
        fragmentLoginEditTextPassword.setTypeface(fontRegular);
        fragmentLoginButtonLogin.setTypeface(fontBlack);
        fragmentLoginButtonForgetPassword.setTypeface(fontBlack);

        return v;
    }
}
