package ss.com.infinitescrollprovidersample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * @author S.Shahini
 * @since 12/5/16
 */

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
    private List<Post> posts = new ArrayList<>();
    private Context context;

    public PostAdapter(Context context){
        this.context = context;
    }
    public void addPosts(List<Post> posts) {
        this.posts.addAll(posts);
        notifyDataSetChanged();
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PostViewHolder(LayoutInflater.from(context).inflate(R.layout.row_post,parent,false));
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        holder.bindPost(posts.get(position));
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public static class PostViewHolder extends RecyclerView.ViewHolder {
        private TextView postPage;
        private TextView postTitle;
        private TextView postContent;
        private TextView postDate;
        public PostViewHolder(View itemView) {
            super(itemView);
            postPage=(TextView)itemView.findViewById(R.id.text_page);
            postTitle=(TextView)itemView.findViewById(R.id.text_title);
            postContent=(TextView)itemView.findViewById(R.id.text_content);
            postDate=(TextView)itemView.findViewById(R.id.text_date);
        }

        public void bindPost(Post post) {
            postPage.setText(itemView.getResources().getString(R.string.post_page)+" "+String.valueOf(post.getPage()));
            postTitle.setText(post.getTitle());
            postContent.setText(post.getContent());
            postDate.setText(post.getDate());
        }
    }
}
