package com.vitoroliveira.rvlistafilmes.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vitoroliveira.rvlistafilmes.R;
import com.vitoroliveira.rvlistafilmes.model.FilmItem;

import java.util.List;

public class FilmeAdapter extends RecyclerView.Adapter<FilmeAdapter.FilmeViewHolder> {

    private List<FilmItem> listaFilmes;

    public FilmeAdapter(List<FilmItem> pListaFilme) {
        this.listaFilmes = pListaFilme;
    }

    @NonNull
    @Override
    public FilmeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(
                        R.layout.rv_film_item,
                        parent,
                        false
                );
        return new FilmeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmeViewHolder holder, int position) {
        FilmItem filmData = listaFilmes.get(position);
        String ano = filmData.getAno() + " Ano";
        holder.imgFilm.setImageResource(filmData.getImg());
        holder.txtName.setText(filmData.getNome());
        holder.txtDescription.setText(filmData.getDescricao());
        holder.txtYear.setText(ano);

        holder.itemView.setOnClickListener(v -> {
            Toast.makeText(v.getContext(), filmData.getNome(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }

    static class FilmeViewHolder extends RecyclerView.ViewHolder {

        ImageView imgFilm;
        TextView txtName;
        TextView txtDescription;
        TextView txtYear;


        public FilmeViewHolder(@NonNull View itemView) {
            super(itemView);

            imgFilm = itemView.findViewById(R.id.imgFilm);
            txtName = itemView.findViewById(R.id.txtFilmeName);
            txtDescription = itemView.findViewById(R.id.txtFilmDescription);
            txtYear = itemView.findViewById(R.id.txtFilmeYear);
        }
    }
}
