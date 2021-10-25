package com.example.mywork;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Map;


public class ada extends RecyclerView.Adapter <ada.MyViewHolder>{

    private View itemView;
    private Context context;
    private  List<Map<String,Object>> items;
    public ada( List<Map<String,Object>> items,Context context){
       this.context=context;
       this.items=items;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        itemView= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(itemView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView1.setText(items.get(position).get("products").toString());
        holder.textView2.setText(items.get(position).get("prices").toString());
        holder.textView3.setText(items.get(position).get("configurations").toString());
        holder.imageView.setImageResource(Integer.parseInt(items.get(position).get("png").toString()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,MainActivity2.class);
                //startActivity(intent);
                intent.putExtra("xinwenye", items.get(holder.getAdapterPosition()).get("products").toString());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView1,textView2,textView3;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1=itemView.findViewById(R.id.textView1);
            textView2=itemView.findViewById(R.id.textView2);
            textView3=itemView.findViewById(R.id.textView3);
            imageView=itemView.findViewById(R.id.imageView5);
        }
    }
}
