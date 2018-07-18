package sg.edu.rp.c346.simplemovielist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {


    Context parent_context;
    int layout_id;
    ArrayList<MovieItem> movieList;

    public CustomAdapter( Context context, int resource, ArrayList<MovieItem> objects){
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;


    }

    public View getView( int position, View convertView, ViewGroup parent){
        LayoutInflater inflater
                = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvDate = rowView.findViewById(R.id.tvDate);
        TextView tvRating = rowView.findViewById(R.id.tvRating);

        MovieItem currentItem = movieList.get(position);
        tvName.setText(currentItem.getMovieName());
        tvDate.setText(currentItem.getReleaseDate());
        tvRating.setText(currentItem.getMovieRating());

        return rowView;

    }

}
