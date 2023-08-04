package com.im.email.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailDto {

    @NotBlank
    private String ownerRef;
    @NotBlank @Email
    private String emailFrom;
    @NotBlank @Email
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;
}
