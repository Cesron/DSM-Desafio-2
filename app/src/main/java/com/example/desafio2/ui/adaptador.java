package com.example.desafio2.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.desafio2.R;

import java.util.ArrayList;

public class adaptador extends RecyclerView.Adapter<adaptador.MyViewHolder> {


    Context context;

    ArrayList<user> list;

    public adaptador(Context context, ArrayList<user> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        user user = list.get(position);
        holder.contraindicaciones.setText(user.getContraindicaciones());
        holder.indicaciones.setText(user.getIndicaciones());
        holder.precio.setText(user.getPrecio());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView contraindicaciones, indicaciones, precio;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            contraindicaciones = itemView.findViewById(R.id.tvcontraindicaciones);
            indicaciones = itemView.findViewById(R.id.tvindicaciones);
            precio = itemView.findViewById(R.id.tvprecio);

        }
    }
}
