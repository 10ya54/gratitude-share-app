package com.example.gratitude_share_app.app.web.login;

import com.example.gratitude_share_app.domain.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LoginMapper {

    // フォームをモデルに変換
    User formToModel(LoginForm form);

    // モデルをフォームに変換
    LoginForm modelToForm(User user);
}
