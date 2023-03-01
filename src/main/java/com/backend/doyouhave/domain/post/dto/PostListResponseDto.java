package com.backend.doyouhave.domain.post.dto;

import com.backend.doyouhave.domain.post.Post;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Setter
@Getter
@NoArgsConstructor
public class PostListResponseDto {
    @ApiParam(value = "글 아이디", required = true, example = "1")
    private Long postId;
    @ApiParam(value = "글 제목", required = true, example = "Spring")
    private String title;
    @ApiParam(value = "글 카테고리", required = true, example = "STUDY")
    private String categoryKeyword;
    @ApiParam(value = "글 태그", example = "['MVC', 'SECURITY', 'MYSQL']")
    private List<String> tags;
    @ApiParam(value = "이미지 URL (메인 이미지)")
    private String imgUrl;

    public PostListResponseDto(Post entity) {
        this.postId = entity.getId();
        this.title = entity.getTitle();
        this.categoryKeyword = entity.getCategory();
        this.tags = Arrays.stream(entity.getTags().split(",")).toList();;
        this.imgUrl = entity.getImg();
    }
}
