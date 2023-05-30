package goSocio.backend.model.comment;

import goSocio.backend.model.user.ProfileHead;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentBanners {
    private String id;
    private String content;
    private String postId;
    private Long timestamp;
    private ProfileHead profileHead;

    public CommentBanners(Comment comment, ProfileHead profileHead) {
        this.id = comment.getId();
        this.content = comment.getContent();
        this.postId = comment.getPostId();
        this.timestamp = comment.getTimestamp();
        this.profileHead = profileHead;
    }
}
