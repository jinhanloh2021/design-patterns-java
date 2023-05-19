package com.coffeepoweredcrew.simplefactory;

/**
 * This class acts as a simple factory for creation of
 * different posts on web site.
 *
 */
public class PostFactory {
    // User enum to prevent string checking. Less error prone.
    public enum PostType {
        BLOG,
        NEWS,
        PRODUCT,
    }

    public static Post createPost(PostType type) {
        switch (type) {
            case BLOG:
                return new BlogPost();
            case NEWS:
                return new NewsPost();
            case PRODUCT:
                return new ProductPost();
            default:
                throw new IllegalArgumentException("Post type unknown");
        }
    }
}
