package org.techtown.slowletter;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.SwitchPreferenceCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


/*public class Setting extends AppCompatActivity implements PreferenceFragmentCompat.OnPreferenceStartFragmentCallback{
    FragmentManager fragmentManager;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_view);
        fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.setting_container,new MyPreferenceFragment()).commit();



      *//*  //진동과 소리중 하나만 선택할 수 있도록 만들기

        SwitchPreferenceCompat Sound = findPreference("sound");
        SwitchPreferenceCompat Vibrate = findPreference("vibrate");

        Sound.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                if (Sound.isChecked()) {
                    Vibrate.setChecked(false);
                }
                return false;
            }
        });
        Vibrate.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                if (Vibrate.isChecked()) {
                    Sound.setChecked(false);
                }
                return false;
            }
        });*//*
    }


    @Override
    public boolean onSupportNavigateUp() {

        if(fragmentManager.getBackStackEntryCount() == 0) {
            finish();
        }else {
            fragmentManager.popBackStack();
        }

        return super.onSupportNavigateUp();
    }

    @Override
    public boolean onPreferenceStartFragment(PreferenceFragmentCompat caller, Preference pref) {
        // Instantiate the new Fragment
        final Bundle args = pref.getExtras();
        final Fragment fragment = getSupportFragmentManager().getFragmentFactory().instantiate(
                getClassLoader(),
                pref.getFragment());
        fragment.setArguments(args);
        fragment.setTargetFragment(caller, 0);
        // Replace the existing Fragment with the new Fragment

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.setting_container, fragment)
                .addToBackStack(null)
                .commit();
        return true;
    }

    public static class MyPreferenceFragment extends PreferenceFragmentCompat{
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.setting, rootKey);
        }
    }
}*/

public class Setting extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.setting, rootKey);

        SwitchPreferenceCompat Sound = findPreference("sound");
        SwitchPreferenceCompat Vibrate = findPreference("vibrate");

        Sound.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                if (Sound.isChecked()) {
                    Vibrate.setChecked(false);
                }
                return false;
            }
        });
        Vibrate.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                if (Vibrate.isChecked()) {
                    Sound.setChecked(false);
                }
                return false;
            }
        });
    }

    
    public static class MyPreferenceFragment extends PreferenceFragment {
        @Override
        public void onCreate(final Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.setting);
        }
    }
}
