package com.example.eddgiassignment.tabui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eddgiassignment.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ImageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class ImageFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";
    public static ImageFragment newInstance(int i) {
        Bundle args = new Bundle();
        ImageFragment fragment = new ImageFragment();
        args.putInt(ARG_SECTION_NUMBER, i);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.fragment_image,container,false);


        return root;
    }
}