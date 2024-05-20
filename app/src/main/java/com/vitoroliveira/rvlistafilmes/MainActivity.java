package com.vitoroliveira.rvlistafilmes;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.vitoroliveira.rvlistafilmes.Adapters.FilmeAdapter;
import com.vitoroliveira.rvlistafilmes.Utils.SpaceItemDecoration;
import com.vitoroliveira.rvlistafilmes.model.FilmItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvListFilms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ArrayList<FilmItem> listaDeFilms = new ArrayList<FilmItem>();
        listaDeFilms.add(new FilmItem("Vingadores ultimato", "2019", "Após Thanos eliminar metade das criaturas vivas, os Vingadores têm de lidar com a perda de amigos e entes queridos.", R.drawable.avengers_endgame));
        listaDeFilms.add(new FilmItem("DeadPool", "2024", "Wolverine está se recuperando quando cruza seu caminho com Deadpool. Juntos, eles formam uma equipe e enfrentam um inimigo em comum", R.drawable.deadpopol));
        listaDeFilms.add(new FilmItem("Jumanji", "2019", "Alan Parrish desapareceu quando era menino e ninguém acredita na história de seu amigo de que ele foi sugado por um jogo de tabuleiro.", R.drawable.jumanji));
        listaDeFilms.add(new FilmItem("Venon", "2024", "O relacionamento entre Eddie e Venom está evoluindo. Buscando a melhor forma de lidar com a inevitável simbiose, esse dois lados descobrem como viver juntos e, de alguma forma, se tornarem melhores juntos do que separados", R.drawable.venon));
        listaDeFilms.add(new FilmItem("Avatar o caminho da água", "2024", "Após formar uma família, Jake Sully e Ney'tiri fazem de tudo para ficarem juntos.", R.drawable.avatar));
        listaDeFilms.add(new FilmItem("O Batman", "2023", "Após dois anos espreitando as ruas como Batman, Bruce Wayne se encontra nas profundezas mais sombrias de Gotham City.", R.drawable.poster_the_batman));

        rvListFilms = findViewById(R.id.rvListaFilm);
        rvListFilms.setLayoutManager(new LinearLayoutManager(this));

        FilmeAdapter filmAdapter = new FilmeAdapter(listaDeFilms);

        rvListFilms.setAdapter(filmAdapter);

        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.item_spacing);
        rvListFilms.addItemDecoration(new SpaceItemDecoration(spacingInPixels));

    }
}