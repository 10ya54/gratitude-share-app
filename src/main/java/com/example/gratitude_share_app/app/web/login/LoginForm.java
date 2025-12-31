package com.example.gratitude_share_app.app.web.login;

import com.example.gratitude_share_app.app.web.form.OtherGroup;
import com.example.gratitude_share_app.app.web.form.RequiredGroup;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginForm {

    // ユーザーID
    @NotBlank(groups = RequiredGroup.class)
    @Pattern(regexp = "^[a-zA-Z0-9]+$", groups = OtherGroup.class)
    @Size(min = 4, max = 8, groups = OtherGroup.class)
    private String userId;

    // パスワード
    @NotBlank(groups = RequiredGroup.class)
    @Pattern(regexp = "^[a-zA-Z0-9]+$", groups = OtherGroup.class)
    @Size(min = 8, max = 16, groups = OtherGroup.class)
    private String password;
}
