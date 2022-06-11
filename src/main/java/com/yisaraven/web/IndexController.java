package com.yisaraven.web;

import com.yisaraven.service.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {
    private final PostService postService;
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("post", postService.findAllDesc());
        return "index";
    }

    @GetMapping("/post/save")
    public String postSave() {
        return "post-save";
    }
}
