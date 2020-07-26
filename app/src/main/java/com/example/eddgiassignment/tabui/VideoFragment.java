package com.example.eddgiassignment.tabui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eddgiassignment.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VideoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VideoFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";
    public static VideoFragment newInstance(int i) {
        Bundle args = new Bundle();
        VideoFragment fragment = new VideoFragment();
        args.putInt(ARG_SECTION_NUMBER, i);
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root=inflater.inflate(R.layout.fragment_video, container, false);
        return root;
    }
}