package com.example.liutaurasmazonas.cslogintrying;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class sharestab_fragment extends Fragment {
    private static final String TAG = "SharesTabFragment";

    private Button buttonTest1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.sharestab_fragment, container, false);

        String [] values =
                {"Client 1","Client 2","Client 3","Client 4","Client 5","Client 6"};
        Spinner spinner = (Spinner) v.findViewById(R.id.spinner_dropdown);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        return v;

    }
}
