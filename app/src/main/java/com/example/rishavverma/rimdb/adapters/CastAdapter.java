package com.example.rishavverma.rimdb.adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import com.example.rishavverma.rimdb.R;
import com.example.rishavverma.rimdb.network.movies.Cast;


import java.util.List;

/**
 * Created by RishavVerma on 8/3/2017.
 */

public class CastAdapter extends RecyclerView.Adapter<CastAdapter.CastViewHolder> {

    Context mContext;
    List<Cast> mCasts;

    public CastAdapter(Context mContext, List<Cast> mCasts) {
        this.mContext = mContext;
        this.mCasts = mCasts;
    }

    @Override
    public CastViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CastViewHolder(LayoutInflater.from(mContext).inflate(R.layout.cast_item,parent,false));
    }

    @Override
    public void onBindViewHolder(CastViewHolder holder, int position) {

        Glide.with(mContext.getApplicationContext()).load("https://image.tmdb.org/t/p/w185/" + mCasts.get(position).getProfilePath())
                .asBitmap()
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.castImageView);

        holder.nameTextView.setText(mCasts.get(position).getName());
        holder.characterTextView.setText(mCasts.get(position).getCharacter());

    }

    @Override
    public int getItemCount() {
        return mCasts.size();
    }



    public class CastViewHolder extends RecyclerView.ViewHolder {

        public ImageView castImageView;
        public TextView nameTextView;
        public TextView characterTextView;

        public CastViewHolder(View itemView) {
            super(itemView);
            castImageView = (ImageView) itemView.findViewById(R.id.image_view_cast);
            nameTextView = (TextView) itemView.findViewById(R.id.text_view_cast_name);
            characterTextView = (TextView) itemView.findViewById(R.id.text_view_cast_as);
        }
    }

}
