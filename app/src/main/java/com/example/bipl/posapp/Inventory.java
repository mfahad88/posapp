package com.example.bipl.posapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;

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
        View v=inflater.inflate(R.layout.fragment_inventory, container, false);
        tableProduct=(TableLayout)v.findViewById(R.id.tableProduct);
        btn_scan=(Button)v.findViewById(R.id.btn_scan);
        btn_add=(Button)v.findViewById(R.id.btn_add);
        searchProduct=(EditText)v.findViewById(R.id.search_product);
        return v;
    }

}
