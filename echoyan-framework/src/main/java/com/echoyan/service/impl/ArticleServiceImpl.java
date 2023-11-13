package com.echoyan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.echoyan.domain.entity.Article;
import com.echoyan.mapper.ArticleMapper;
import com.echoyan.service.ArticleService;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService  {

}
