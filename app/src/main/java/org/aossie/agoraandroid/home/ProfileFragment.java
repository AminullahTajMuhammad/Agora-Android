package org.aossie.agoraandroid.home;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.aossie.agoraandroid.R;
import org.aossie.agoraandroid.SharedPrefs;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {
    private SharedPrefs sharedPrefs;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        sharedPrefs = new SharedPrefs(getActivity());
        View view = inflater.inflate(R.layout.fragment_profile, null);
        TextView userName = view.findViewById(R.id.userName);
        TextView emailId = view.findViewById(R.id.user_email_id);
        TextView fullName = view.findViewById(R.id.fullName);

        String username = sharedPrefs.getUserName();
        String email = sharedPrefs.getEmail();
        String userFullName = sharedPrefs.getfullName();

        userName.setText(username);
        emailId.setText(email);
        fullName.setText(userFullName);
        return view;
    }

    @Override

    public void onViewCreated(@NonNull View view, @Nullable Bundle
            savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}