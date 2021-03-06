package com.activitylifecycle;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class AddFragment extends Fragment {
    private static final String TAG = AddFragment.class.getSimpleName();
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    private TextView addFragmentTextView;

    public AddFragment() {
        // Required empty public constructor
    }

    public static AddFragment newInstance(String param1, String param2) {
        AddFragment fragment = new AddFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.wtf(TAG, "onCreate called");

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.wtf(TAG, "onCreateView called");
        View view = inflater.inflate(R.layout.fragment_add, container, false);
        addFragmentTextView = view.findViewById(R.id.addFragmentTextView);
        if (mParam2 != null) {
            addFragmentTextView.setText(mParam2);
        }
        return view;
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.wtf(TAG, "onAttach called");
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.wtf(TAG, "onDetach called");
        mListener = null;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.wtf(TAG, "onResume called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.wtf(TAG, "onPause called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.wtf(TAG, "onStop called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.wtf(TAG, "onDestroy called");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.wtf(TAG, "onDestroyView called");
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
