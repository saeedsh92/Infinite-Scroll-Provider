package ss.com.infinitescrollprovidersample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author S.Shahini
 * @since 12/5/16
 */

public class DataFakeGenerator {
    private static int POST_PER_PAGE=20;
    public static List<Post> getPosts(int page){
        int itemId=0;
        Post post;
        List<Post> posts=new ArrayList<>();
        for (int i = 0; i < POST_PER_PAGE; i++) {
            itemId=(POST_PER_PAGE*page)+i;
            post=new Post();
            post.setPage(page+1);
            post.setTitle("Item "+String.valueOf(itemId));
            post.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
            post.setDate("Monday, December 5, 2016");
            posts.add(post);
        }
        return posts;
    }
}
