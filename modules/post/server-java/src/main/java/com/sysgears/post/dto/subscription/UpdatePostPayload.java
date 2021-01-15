package com.sysgears.post.dto.subscription;

import com.sysgears.post.dto.Post;
import lombok.Data;
import org.springframework.lang.NonNull;

@Data
public class UpdatePostPayload {
    @NonNull
    private final Integer id;
    @NonNull
    private final String mutation;
    private final Post node;

}
