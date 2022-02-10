package dev.ogabek.kotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.model.Story

class StoryAdapter(private val stories: List<Story>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val story = stories[position]
        if (holder is StoryViewHolder) {
            if (position == 0) {
                holder.profile.strokeWidth = 0f
            } else {
                holder.profile.strokeWidth = 3f
            }
            holder.profile.setImageResource(story.profile)
            holder.story.setImageResource(story.status)
            holder.fullName.text = story.fullName
        }
    }

    override fun getItemCount(): Int {
        return stories.size
    }

    private class StoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var profile: ShapeableImageView = view.findViewById(R.id.iv_profile)
        var story: ShapeableImageView = view.findViewById(R.id.iv_story)
        var fullName: TextView = view.findViewById(R.id.tv_full_name)

    }
}