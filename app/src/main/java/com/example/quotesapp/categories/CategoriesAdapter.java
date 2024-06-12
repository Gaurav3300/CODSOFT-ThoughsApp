package com.example.quotesapp.categories;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quotesapp.Quotes;
import com.example.quotesapp.R;

import java.util.List;

import javax.xml.namespace.QName;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.MyViewHolder> {

    private final List<CategoriesList> list;
    private final Context context;

    public CategoriesAdapter(List<CategoriesList> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoriesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_adapter_layout,null));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesAdapter.MyViewHolder holder, int position) {

        CategoriesList list2 = list.get(position);

        holder.categoryName.setText(list2.getCategoryName());
        holder.categoryImage.setImageResource(list2.getCategoryImg());

        holder.rootlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( context, Quotes.class);
                intent.putExtra("name",list2.getCategoryName());

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    static class MyViewHolder extends RecyclerView.ViewHolder {
        private  final TextView categoryName;
        private final ImageView categoryImage;
        private final CardView rootlayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            categoryName =itemView. findViewById (R.id.categorynamw) ;

            categoryImage=itemView. findViewById(R.id.categoryImage) ;

            rootlayout = itemView. findViewById(R.id.rootlayout);

        }
    }
}
