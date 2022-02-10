package dev.ogabek.java.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;
import dev.ogabek.java.R;
import dev.ogabek.java.model.Story;

public class StoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final List<Story> stories;

    public StoryAdapter(List<Story> stories) {
        this.stories = stories;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new StoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Story story = stories.get(position);

        if (holder instanceof StoryViewHolder) {
            if (position == 0) {
                ((StoryViewHolder) holder).profile.setStrokeWidth(0);
            } else {
                ((StoryViewHolder) holder).profile.setStrokeWidth(3);
            }
            ((StoryViewHolder) holder).profile.setImageResource(story.getProfile());
            ((StoryViewHolder) holder).story.setImageResource(story.getStatus());
            ((StoryViewHolder) holder).fullName.setText(story.getFullName());
        }
    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    private static class StoryViewHolder extends RecyclerView.ViewHolder {

        ShapeableImageView profile, story;
        TextView fullName;

        public StoryViewHolder(View view) {
            super(view);

            profile = view.findViewById(R.id.iv_profile);
            story = view.findViewById(R.id.iv_story);
            fullName = view.findViewById(R.id.tv_full_name);

        }
    }

}
