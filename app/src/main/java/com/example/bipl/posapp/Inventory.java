package com.example.bipl.posapp;


import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.bipl.posapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Inventory extends Fragment {
TableLayout tableProduct;
Button btn_scan,btn_add;
EditText searchProduct;

    public Inventory() {
        // Required empty public constructor
    }

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view=inflater.inflate(R.layout.fragment_inventory, container, false);
        btn_add=(Button)view.findViewById(R.id.btn_add);
        tableProduct=(TableLayout)view.findViewById(R.id.tableProduct);
        btn_scan=(Button)view.findViewById(R.id.btn_scan);
        btn_add=(Button)view.findViewById(R.id.btn_add);
        searchProduct=(EditText)view.findViewById(R.id.search_product);




        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return view;


    }

}
