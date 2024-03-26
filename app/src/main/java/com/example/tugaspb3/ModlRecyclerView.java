package com.example.tugaspb3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ModlRecyclerView extends RecyclerView.Adapter<ModlRecyclerView.ViewHolder> {

    Context context;
    ArrayList<Model> arrayList = new ArrayList<>();

    public ModlRecyclerView(Context context, ArrayList<Model> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_view,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.foto.setImageResource(arrayList.get(position).getFoto());
        holder.nama.setText(arrayList.get(position).getNama());
        holder.nim.setText(arrayList.get(position).getNim());


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Mahasiswa" + position, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, Detail.class);
                intent.putExtra("image", arrayList.get(position).getFoto());
                intent.putExtra("name", arrayList.get(position).getNama());
                intent.putExtra("number", arrayList.get(position).getNim());
                context.startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder  extends RecyclerView.ViewHolder{

        ImageView foto;
        TextView nama, nim;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {


            super(itemView);

            foto = itemView.findViewById(R.id.foto);
            nama = itemView.findViewById(R.id.nama);
            nim = itemView.findViewById(R.id.nim);
            cardView = itemView.findViewById(R.id.cardView);



        }
    }
}
