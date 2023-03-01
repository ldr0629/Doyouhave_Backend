package com.backend.doyouhave.domain.post.dto;

import com.backend.doyouhave.domain.post.Post;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

@Getter
@NoArgsConstructor
public class PostUpdateResponseDto {

    @ApiModelProperty(value = "고민이 있어요")
    private String title;
    @ApiModelProperty(value = "테스트")
    private String content;
    @ApiModelProperty(value = "COMMENT,KAKAO")
    private String contactWay;
    @ApiModelProperty(value = "http://open.kakao.com/o/sDMnCBS")
    private String kakaoUrl;
    @ApiModelProperty(value = "abcd@naver.com")
    private String email;
    @ApiModelProperty(value = "MEDICAL")
    private String categoryKeyword;
    @ApiModelProperty(value = "['test1', 'test2', 'test3']")
    private List<String> tags;

    private String img;

    private String imgSecond;

    @Builder
    public PostUpdateResponseDto(Post entity) {
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.contactWay = entity.getContactWay();
        this.kakaoUrl = entity.getKakaoUrl();
        this.email = entity.getEmail();
        this.categoryKeyword = entity.getCategory();
        this.tags = Arrays.stream(entity.getTags().split(",")).toList();
        this.img = entity.getImg();
        this.imgSecond = entity.getImgSecond();
    }
}
