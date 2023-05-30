package goSocio.backend.model.post;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditPostRequest {
    private String postData;
    private String currentUserId;
}
