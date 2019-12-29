package com.mirko.alsc.ui.devote.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alsc.utils.base.BaseFragment;
import com.mirko.alsc.R;
import com.mirko.alsc.databinding.FragmentDevoteHomeBinding;
import com.mirko.alsc.databinding.FragmentHomeBinding;
import com.mirko.alsc.ui.devote.DevoteHomeActivity;
import com.mirko.androidutil.utils.android.LogUtils;

/**
 * Created by Mirko on 2019/12/21.
 */

public class DevoteHomeFragment extends BaseFragment {

    private final static String TAG = "HomeFragment";

    FragmentDevoteHomeBinding binding;
    private View mView;


    public static DevoteHomeFragment getInstance() {
        DevoteHomeFragment sf = new DevoteHomeFragment();
        return sf;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_devote_home, null);
        binding = FragmentDevoteHomeBinding.bind(mView);

        return mView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtils.d(TAG, "onCreate：");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        int height = StatusBarUtil.getStatusBarHeight(getActivity()) + UiUtils.dip2px(56);
//        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,height);
//        binding.flTitle.setPadding(0,StatusBarUtil.getStatusBarHeight(getActivity()),0,0);
//        binding.flTitle.setLayoutParams(layoutParams);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void initViews(Bundle savedInstanceState) {

    }

    @Override
    public void initAttrs() {
    }

    @Override
    public void loadData() {

    }


}