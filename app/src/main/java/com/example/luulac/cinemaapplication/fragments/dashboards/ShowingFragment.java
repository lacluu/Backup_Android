package com.example.luulac.cinemaapplication.fragments.dashboards;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.luulac.cinemaapplication.R;
import com.example.luulac.cinemaapplication.adapters.MovieShowingAdapter;
import com.example.luulac.cinemaapplication.data.models.Film;
import com.example.luulac.cinemaapplication.data.models.Movie;
import com.example.luulac.cinemaapplication.services.FilmService;
import com.example.luulac.cinemaapplication.services.ServiceBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ShowingFragment extends Fragment {

    private RecyclerView recyclerView;
    private MovieShowingAdapter adapter;
    private List<Movie> movies;

    private List<Film> films;

    private Context context;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_showing, null);
        context = view.getContext();

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_movie_showing);

        FilmService ideaService = ServiceBuilder.buildService(FilmService.class);
        Call<List<Film>> request = ideaService.getFilms();


        request.enqueue(new Callback<List<Film>>() {
            @Override
            public void onResponse(Call<List<Film>> request, Response<List<Film>> response) {
                films = response.body();
                adapter = new MovieShowingAdapter(films);

                LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
                layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(adapter);

                adapter.setOnItemClickedListener(new MovieShowingAdapter.OnItemClickedListener() {
                    @Override
                    public void onItemClick(String movieName) {
                        Toast.makeText(getContext(), "Now Showing Card view " + movieName + " clicked.", Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void onFailure(Call<List<Film>> request, Throwable t) {
                Toast.makeText(context, "Failed to retrieve item.", Toast.LENGTH_SHORT).show();;
            }
        });




        return view;
    }
}
