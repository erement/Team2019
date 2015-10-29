package com.rebty.team2019.Activities;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.rebty.team2019.Fragments.ForgetpasswordFragment;
import com.rebty.team2019.Fragments.LoginFragment;
import com.rebty.team2019.Fragments.RegistrationFragment;
import com.rebty.team2019.Fragments.StartFragment;
import com.rebty.team2019.R;

public class MainActivity extends AppCompatActivity {

    Fragment startFragment, registrationFragment, loginFragment, forgetpasswordFragment;
    FragmentTransaction fragmentTransaction;
    FragmentManager fragmentManager;
    String nowShowFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startFragment = new StartFragment();
        registrationFragment = new RegistrationFragment();
        loginFragment = new LoginFragment();
        forgetpasswordFragment = new ForgetpasswordFragment();

        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.appContent, startFragment);
        fragmentTransaction.commit();
        nowShowFragment = "startFragment";
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fragment_start_button_registration:
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.appContent, registrationFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                nowShowFragment = "registrationFragment";
                break;
            case R.id.fragment_start_button_login:
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.appContent, loginFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                nowShowFragment = "loginFragment";
                break;
            case R.id.fragment_login_button_forgetPassword:
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.appContent, forgetpasswordFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                nowShowFragment = "forgetpasswordFragment";
                break;
            default:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        switch (nowShowFragment) {
            case "registrationFragment":
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.appContent, startFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                nowShowFragment = "startFragment";
                break;
            case "loginFragment":
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.appContent, startFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                nowShowFragment = "startFragment";
                break;
            case "forgetpasswordFragment":
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.appContent, loginFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                nowShowFragment = "loginFragment";
                break;
            case "startFragment":
                super.onBackPressed();
                nowShowFragment = "";
                break;
            default:
                break;
        }
    }
}


