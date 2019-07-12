//package com.andalus.hady;
//
//import android.support.annotation.NonNull;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//public class Adapter extends RecyclerView.Adapter<Adapter.MainHolder> {
//
//    private Data[] data;
//
//    public Adapter(Data[] data) {
//        this.data = data;
//    }
//    class MainHolder extends RecyclerView.ViewHolder {
//        TextView textname, size,textcountry;
//
//
//        public MainHolder(@NonNull View itemView) {
//            super(itemView);
//            textname = itemView.findViewById(R.id.name);
//            size = itemView.findViewById(R.id.size);
//
//        }
//    }
//    @NonNull
//    @Override
//
//    public Adapter.MainHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
//        View view = inflater.inflate(R.layout.item, viewGroup, false);
//        return new MainHolder(view);
//
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull Adapter.MainHolder mainHolder, int i) {
//        mainHolder.textView.setText(data[i].getCityName());
//        mainHolder.size.setText(data[i].getCountry()+);
//        mainHolder.imageView.setImageResource(data[i].getTemp());
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return data.length;
//    }
//}
