package com.rebty.team2019.Fragments;

import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rebty.team2019.R;

public class ForgetpasswordFragment extends Fragment {

    TextView fragmentForgetpasswordTextViewFillplace;
    EditText fragmentForgetpasswordEditTextEmail, fragmentForgetpasswordEditTextPhone;
    Button fragmentLoginForgetpasswordButtonRestorepassword;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_forgetpassword, container, false);

        fragmentForgetpasswordTextViewFillplace = (TextView) v.findViewById(R.id.fragment_forgetpassword_textView_fillplace);
        fragmentForgetpasswordEditTextEmail = (EditText) v.findViewById(R.id.fragment_forgetpassword_editText_email);
        fragmentForgetpasswordEditTextPhone = (EditText) v.findViewById(R.id.fragment_forgetpassword_editText_phone);
        fragmentLoginForgetpasswordButtonRestorepassword = (Button) v.findViewById(R.id.fragment_login_forgetpassword_button_restorepassword);

        Typeface fontBlack = Typeface.createFromAsset(getActivity().getAssets(), "fonts/PFDinDisplayPro-Black.ttf");
        Typeface fontRegular = Typeface.createFromAsset(getActivity().getAssets(), "fonts/PFDinDisplayPro-Regular.ttf");

        fragmentForgetpasswordTextViewFillplace.setTypeface(fontRegular);
        fragmentForgetpasswordEditTextEmail.setTypeface(fontRegular);
        fragmentForgetpasswordEditTextPhone.setTypeface(fontRegular);
        fragmentLoginForgetpasswordButtonRestorepassword.setTypeface(fontBlack);

        return v;
    }
}
