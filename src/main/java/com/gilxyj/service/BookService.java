package com.gilxyj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gilxyj.mapper.BookMapper;
import com.gilxyj.beans.Book;
@Service
public class BookService{

    @Autowired
    private BookMapper bookMapper;


    public int deleteByPrimaryKey(Integer id) {
        return bookMapper.deleteByPrimaryKey(id);
    }


    public int insert(Book record) {
        return bookMapper.insert(record);
    }

    public int insertTest(Book record) throws Exception{

         bookMapper.insert(record);
         bookMapper.insert(record);
        throw new Exception();
    }

    public int insertSelective(Book record) {
        return bookMapper.insertSelective(record);
    }


    public Book selectByPrimaryKey(Integer id) {
        return bookMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(Book record) {
        return bookMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Book record) {
        return bookMapper.updateByPrimaryKey(record);
    }

}
