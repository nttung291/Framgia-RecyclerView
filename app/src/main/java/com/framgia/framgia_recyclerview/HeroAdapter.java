package com.framgia.framgia_recyclerview;


import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by nttungg on 1/24/18.
 */

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.ViewHolder>{
    private Context context;
    private List<HeroModel> heroModels;
    LayoutInflater layoutInflater;
    public HeroAdapter(Context context, List<HeroModel> heroModels) {
        this.context = context;
        this.heroModels = heroModels;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (layoutInflater == null){
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        View itemview = layoutInflater.inflate(R.layout.item_rv_hero,parent,false);
        return new ViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setData(heroModels.get(position));
    }

    @Override
    public int getItemCount() {
        return heroModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_hero);
            textView = itemView.findViewById(R.id.tv_hero);
        }

        public void setData(final HeroModel heroModel){
            int imageResource = context.getResources().getIdentifier(heroModel.getImage(), null, context.getPackageName());
            Picasso.with(context).load(imageResource).into(imageView);
            textView.setText(heroModel.getHeroName());
        }
    }
}
