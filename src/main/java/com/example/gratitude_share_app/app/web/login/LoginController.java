package com.example.gratitude_share_app.app.web.login;

import com.example.gratitude_share_app.app.web.form.GroupOrder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    /**
     * ログイン画面表示
     *
     * @return ログイン画面
     */
    @GetMapping("/login")
    public String getLogin(@ModelAttribute LoginForm loginForm) {
        return "login";
    }

    /**
     * ログイン処理
     *
     * @param loginForm     ログインフォーム
     * @param bindingResult バリデーション結果
     * @return 認証処理へフォワードまたはログイン画面
     */
    @PostMapping("/login")
    public String postLogin(@Validated(GroupOrder.class) @ModelAttribute LoginForm loginForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "login";
        }
        return "forward:/authenticate";
    }

    /**
     * ログアウト処理
     *
     * @return ログイン画面へリダイレクト
     */
    @PostMapping("/logout")
    public String postLogout() {
        return "redirect:/login";
    }
}
