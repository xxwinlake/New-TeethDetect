package com.sh.teethdetect;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class MyPageFragment extends Fragment {


    Button MyInfoChageBt , LogOutBt;
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
                         Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View v = inflater.inflate(R.layout.fragment_mypage, container, false);

    MyInfoChageBt = v.findViewById(R.id.MyinfoChangeBt);
    LogOutBt = v.findViewById(R.id.LogOutBt);

    Bundle bundle = getArguments();
    //로그인한 아이디 값 저장 변수
    //홈액티비티에서 번들로 받아온 값
    String userEmail = bundle.getString("userEmail");


    MyInfoChageBt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getActivity(), MyInfoChangeActivity.class);
            intent.putExtra("passEmailIntent",userEmail);
            startActivity(intent);
        }
    });

    LogOutBt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getActivity(),HomeActivity.class);
            startActivity(intent);
        }
    });

    return v;
}
}