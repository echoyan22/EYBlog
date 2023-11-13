package com.echoyan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.echoyan.domain.entity.Article;
import com.echoyan.domain.entity.ResponseResult;

public interface ArticleService extends IService<Article> {

    ResponseResult hotArticleList();

}
