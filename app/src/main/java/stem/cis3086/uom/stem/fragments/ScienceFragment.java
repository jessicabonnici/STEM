package stem.cis3086.uom.stem.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import stem.cis3086.uom.stem.R;

public class ScienceFragment extends Fragment {

    private static final String ARG_ID = "argId";

    private String lessonId;

    public static ScienceFragment newInstance(String lessonId) {
        ScienceFragment fragment = new ScienceFragment();
        Bundle args = new Bundle();
        args.putString(ARG_ID, lessonId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            lessonId = getArguments().getString(ARG_ID);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_science, container, false);
    }
}
