package com.cp.dao;

import com.cp.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map<String,Object> map);
}
