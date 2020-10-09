package hanan.birzeit.comp438.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import hanan.birzeit.comp438.example.assignment1.model.Imovie;
import hanan.birzeit.comp438.example.assignment1.model.Movie;
import hanan.birzeit.comp438.example.assignment1.model.movieFactory;

import static android.widget.TextView.BufferType.EDITABLE;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private EditText result;
    private EditText search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        result = findViewById(R.id.result);
        search = findViewById(R.id.search);
        populateSpinner();
    }

    private void populateSpinner() {
        movieFactory factory  = new movieFactory();

        Imovie objmovie = factory.getModel();
        String[] tits = objmovie.getTitles() ;
        ArrayAdapter<String > adapter = new ArrayAdapter<>(this , android.R.layout.simple_spinner_item , tits);
        spinner.setAdapter(adapter);
    }

    public void onClickSearch(View view) {
        movieFactory factory  = new movieFactory();
        Imovie objmovie = factory.getModel();
        String item = "";
        item = spinner.getSelectedItem().toString();
       // Toast.makeText(this, item,Toast.LENGTH_LONG).show();
        List<Movie> movies = objmovie.getmovies(item);
        String str = " ";
        for (Movie mov:movies){
            if (mov.getTitle().equals(item))
          str += mov.getGenre() +"\n" ;
        }
        result.setText(item ,EDITABLE);
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }

    public void onClickSearch2(View view) {
       String res1= search.getText().toString();
      result.setText(res1,EDITABLE);
    }
}
