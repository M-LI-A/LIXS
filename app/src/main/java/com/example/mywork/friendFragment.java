package com.example.mywork;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.app.Fragment;
public class friendFragment extends Fragment {
    private RecyclerView recyclerView;
    private List<Map<String,Object>> items;
    private Context context;
    private ada ada;
    public friendFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.friend, container, false);
        recyclerView=view.findViewById(R.id.recycle1);
        context=this.getActivity();
        String[] products={"湖北","湖南","广西","广东"};
        String[] prices={"武汉","长沙","南宁","深圳"};
        String[] configurations={"湖北省辖地级市、省会","湖南省辖地级市、省会",
                "广西省辖地级市、省会","广东省辖地级市、省会"};
        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();
        for(int i=0;i<products.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put("products", products[i]);
            item.put("prices", prices[i]);
            item.put("configurations", configurations[i]);//
            item.put("png",R.drawable.faxian);
            items.add(item);
        }
        ada=new ada(items,context);
        LinearLayoutManager layoutManager=new LinearLayoutManager(context);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(ada);
        return view;
    }
}