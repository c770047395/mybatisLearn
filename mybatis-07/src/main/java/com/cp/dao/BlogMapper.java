package com.cp.dao;

import com.cp.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map<String,Object> map);

    List<Blog> queryBlogChoose(Map<String,Object> map);

    //更新博客
    int updateBlog(Map<String,Object> map);

    //查询第1，2，3号博客
    List<Blog> queryBlogForeach(Map<String,Object> map);
}
