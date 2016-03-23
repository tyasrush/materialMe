package com.liez.tyas.materialme.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.liez.tyas.materialme.R;

/**
 * Created by tyasrus on 23/03/16.
 */
public class RecyclerImageAdapter extends RecyclerView.Adapter<RecyclerImageAdapter.ImageHolder> {

    private Context context;

    @Override
    public ImageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new ImageHolder(LayoutInflater.from(context).inflate(R.layout.item_image_staggered, parent, false));
    }

    @Override
    public void onBindViewHolder(ImageHolder holder, int position) {
        Glide.with(context)
                .load(R.drawable.image_mountain)
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    public class ImageHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;

        public ImageHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image_item_stagger);
        }
    }
}
