package com.example.gratitude_share_app.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    // ユーザーID
    private String userId;

    // パスワード
    private String password;

    // ユーザー名
    private String userName;
}
