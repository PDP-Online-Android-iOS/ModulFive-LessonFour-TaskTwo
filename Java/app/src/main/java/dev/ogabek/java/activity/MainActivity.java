package dev.ogabek.java.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.adapter.StoryAdapter;
import dev.ogabek.java.model.Story;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        recyclerView = findViewById(R.id.rv_main);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        StoryAdapter adapter = new StoryAdapter(prepareStoryList());
        recyclerView.setAdapter(adapter);
    }

    private List<Story> prepareStoryList() {
        List<Story> stories = new ArrayList<>();
        stories.add(new Story(R.drawable.ic_add, R.drawable.ogabekdev, "Add to Story"));
        stories.add(new Story(R.drawable.aziz, R.drawable.aziz, "Aziz"));
        stories.add(new Story(R.drawable.bogibek, R.drawable.bogibek, "Bogibek Matyakubov"));
        stories.add(new Story(R.drawable.elmurod, R.drawable.elmurod, "Elmurod Nazirov"));
        stories.add(new Story(R.drawable.jabbor, R.drawable.jabbor, "Jabbor"));
        stories.add(new Story(R.drawable.jonibek, R.drawable.jonibek, "Jonibek Holmonov"));
        stories.add(new Story(R.drawable.ogabekdev, R.drawable.ogabekdev, "Ogabek Matyakubov"));
        stories.add(new Story(R.drawable.shakhriyor, R.drawable.shakhriyor, "Shakhriyor"));
        stories.add(new Story(R.drawable.yahyo, R.drawable.yahyo, "Yahyo Mahmudiy"));
        stories.add(new Story(R.drawable.aziz, R.drawable.aziz, "Aziz"));
        stories.add(new Story(R.drawable.bogibek, R.drawable.bogibek, "Bogibek Matyakubov"));
        stories.add(new Story(R.drawable.elmurod, R.drawable.elmurod, "Elmurod Nazirov"));
        stories.add(new Story(R.drawable.jabbor, R.drawable.jabbor, "Jabbor"));
        stories.add(new Story(R.drawable.jonibek, R.drawable.jonibek, "Jonibek Holmonov"));
        stories.add(new Story(R.drawable.ogabekdev, R.drawable.ogabekdev, "Ogabek Matyakubov"));
        stories.add(new Story(R.drawable.shakhriyor, R.drawable.shakhriyor, "Shakhriyor"));
        stories.add(new Story(R.drawable.yahyo, R.drawable.yahyo, "Yahyo Mahmudiy"));
        stories.add(new Story(R.drawable.aziz, R.drawable.aziz, "Aziz"));
        stories.add(new Story(R.drawable.bogibek, R.drawable.bogibek, "Bogibek Matyakubov"));
        stories.add(new Story(R.drawable.elmurod, R.drawable.elmurod, "Elmurod Nazirov"));
        stories.add(new Story(R.drawable.jabbor, R.drawable.jabbor, "Jabbor"));
        stories.add(new Story(R.drawable.jonibek, R.drawable.jonibek, "Jonibek Holmonov"));
        stories.add(new Story(R.drawable.ogabekdev, R.drawable.ogabekdev, "Ogabek Matyakubov"));
        stories.add(new Story(R.drawable.shakhriyor, R.drawable.shakhriyor, "Shakhriyor"));
        stories.add(new Story(R.drawable.yahyo, R.drawable.yahyo, "Yahyo Mahmudiy"));
        return stories;
    }
}