package com.example.luulac.cinemaapplication.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.luulac.cinemaapplication.R;
import com.example.luulac.cinemaapplication.data.models.Film;
import com.example.luulac.cinemaapplication.data.models.Movie;
import com.example.luulac.cinemaapplication.services.BaseService;

import java.util.ArrayList;
import java.util.List;

public class MovieShowingAdapter extends RecyclerView.Adapter<MovieShowingAdapter.MovieShowingHolder> {

    private List<Film> moviesShowing;
    private Context context;

    public MovieShowingAdapter(List<Film> moviesShowing) {
        this.moviesShowing = moviesShowing;
    }

    @NonNull
    @Override
    public MovieShowingHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.movie_showing_item, parent, false);
        return new MovieShowingHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MovieShowingHolder holder, final int position) {

        Glide.with(context)
                .load(BaseService.BASE_URL + moviesShowing.get(position).getPosterPicture())
                .into(holder.imageView);
        holder.index.setText((position + 1) + "");
        holder.imdb.setText(moviesShowing.get(position).getImdb() + "");

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClickedListener != null) {
                    onItemClickedListener.onItemClick(moviesShowing.get(position).getName());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return moviesShowing.size();
    }

    public class MovieShowingHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView index;
        TextView imdb;

        CardView cardView;

        public MovieShowingHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.img_movie_showing_item);
            index = (TextView) itemView.findViewById(R.id.tv_movie_showing_item_index);
            imdb = (TextView) itemView.findViewById(R.id.tv_movie_showing_item_imdb);

            cardView = (CardView) itemView.findViewById(R.id.cv_movie_showing_item);
        }
    }

    public interface OnItemClickedListener {
        void onItemClick(String movieName);
    }

    private OnItemClickedListener onItemClickedListener;

    public void setOnItemClickedListener(OnItemClickedListener onItemClickedListener) {
        this.onItemClickedListener = onItemClickedListener;
    }
}
