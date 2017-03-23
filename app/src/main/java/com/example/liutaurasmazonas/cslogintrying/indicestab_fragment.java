package com.example.liutaurasmazonas.cslogintrying;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Liutauras Mazonas on 3/22/2017.
 */

public class indicestab_fragment extends Fragment {
    private static final String TAG = "IndicesTabFragment";

    private Button buttonTest4;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.indicestab_fragment,container,false);
        buttonTest4 = (Button) view.findViewById(R.id.buttonTest4);

        buttonTest4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "TESTING BUTTON CLICK 4",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
