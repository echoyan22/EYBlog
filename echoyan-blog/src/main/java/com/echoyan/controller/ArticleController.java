package com.echoyan.controller;

import com.echoyan.domain.entity.Article;
import com.echoyan.domain.entity.ResponseResult;
import com.echoyan.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/hotArticle")
    public ResponseResult hotArticle() {

        ResponseResult result = articleService.hotArticleList();
        return result;
    }
}
