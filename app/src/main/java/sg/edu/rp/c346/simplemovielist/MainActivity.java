package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<MovieItem> alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMovie = findViewById(R.id.listViewMovie);

        alMovieList = new ArrayList<>();
        MovieItem item1 = new MovieItem("Average Infinity War", "Release Date: 2018.04", "PG13");
        MovieItem item2 = new MovieItem("Justice League", "Release Date: 2017.11", "PG13");
        alMovieList.add(item1);
        alMovieList.add(item2);

        caMovie = new CustomAdapter(this, R.layout.movie_item, alMovieList);

        lvMovie.setAdapter(caMovie);
    }
}
