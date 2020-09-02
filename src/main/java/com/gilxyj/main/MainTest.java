package com.gilxyj.main;

import com.gilxyj.beans.Book;
import com.gilxyj.core.ContextUtil;
import com.gilxyj.service.BookService;
import org.springframework.context.ApplicationContext;

/**
 * @program: springbatch
 * @description:
 * @作者 飞码录
 * @微信公众号 飞码录
 * @网站 http://www.codesboy.cn
 * @国际站 http://www.codesboy.com
 * @微信 gilbertxy
 * @GitHub https://github.com/GilbertXiao
 * @Gitee https://gitee.com/gilbertxiao
 * @create: 2020-09-02 00:39
 **/
public class MainTest {




    public static void main(String[] args) throws Exception {

        ApplicationContext applicationContext = ContextUtil.getApplicationContext();
        BookService bookService = (BookService) applicationContext.getBean("bookService");
        //PointcutAdvisor defaultPointcutAdvisor = (PointcutAdvisor) context.getBean("defaultPointcutAdvisor");



        Book book1 = new Book();
        book1.setName("test");
        book1.setAuthor("test");
        bookService.insertTest(book1);

    }
}
