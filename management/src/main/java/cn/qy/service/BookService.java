package cn.qy.service;

import cn.qy.domain.Book;

import java.util.List;

/**
 * @description:
 * @author: QiuYang
 * @time: 2022/3/31
 */
public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();




}
