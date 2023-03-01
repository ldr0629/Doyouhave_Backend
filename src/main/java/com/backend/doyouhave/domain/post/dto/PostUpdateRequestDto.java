package com.backend.doyouhave.domain.post.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
public class PostUpdateRequestDto {
    @ApiModelProperty(value = "제목")
    @NotNull
    private String title;
    @ApiModelProperty(value = "내용")
    @NotNull
    private String content;
    @ApiModelProperty(value = "KAKAO")
    @NotNull
    private String contactWay;
    @ApiModelProperty(value = "http://open.kakao.com/o/sDMnCBS")
    private String kakaoUrl;
    @ApiModelProperty(value = "abcd@naver.com")
    private String email;
    @ApiModelProperty(value = "의류")
    @NotNull
    private String categoryKeyword;
    @ApiModelProperty(value = "나이키,아디다스")
    private String tags;
}
