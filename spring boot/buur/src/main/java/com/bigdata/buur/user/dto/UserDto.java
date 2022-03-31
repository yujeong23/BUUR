package com.bigdata.buur.user.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ApiModel
public class UserDto {

    @ApiModelProperty("유저 아이디")
    private String userId;
    @ApiModelProperty("유저 닉네임")
    private String userNickname;
    @ApiModelProperty("유저 이메일")
    private String userEmail;
    @ApiModelProperty("유저 비밀번호")
    private String userPassword;
    @ApiModelProperty("유저 주량")
    private Integer userDrink; // 주량

}
