package dev.ogabek.kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.adapter.StoryAdapter
import dev.ogabek.kotlin.model.Story

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.rv_main)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        val adapter = StoryAdapter(prepareStoryList())
        recyclerView.adapter = adapter
    }

    private fun prepareStoryList(): List<Story> {
        val stories: MutableList<Story> = ArrayList()
        stories.add(Story(R.drawable.ic_add, R.drawable.ogabekdev, "Add to Story"))
        stories.add(Story(R.drawable.aziz, R.drawable.aziz, "Aziz"))
        stories.add(Story(R.drawable.bogibek, R.drawable.bogibek, "Bogibek Matyakubov"))
        stories.add(Story(R.drawable.elmurod, R.drawable.elmurod, "Elmurod Nazirov"))
        stories.add(Story(R.drawable.jabbor, R.drawable.jabbor, "Jabbor"))
        stories.add(Story(R.drawable.jonibek, R.drawable.jonibek, "Jonibek Holmonov"))
        stories.add(Story(R.drawable.ogabekdev, R.drawable.ogabekdev, "Ogabek Matyakubov"))
        stories.add(Story(R.drawable.shakhriyor, R.drawable.shakhriyor, "Shakhriyor"))
        stories.add(Story(R.drawable.yahyo, R.drawable.yahyo, "Yahyo Mahmudiy"))
        return stories
    }

}