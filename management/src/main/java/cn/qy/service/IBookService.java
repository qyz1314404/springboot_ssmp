package cn.qy.service;

import cn.qy.domain.Book;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.logging.log4j.util.Strings;

/**
 * @description:
 * @author: QiuYang
 * @time: 2022/3/31
 */
public interface IBookService extends IService<Book> {
    /*@Override
    default <E extends IPage<Book>> E page(E page, Wrapper<Book> queryWrapper) {
      LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
       lqw.like(Strings.isNotEmpty(book.getType()), Book::getType, book.getType());
       lqw.like(Strings.isNotEmpty(book.getName()), Book::getName, book.getName());
       lqw.like(Strings.isNotEmpty(book.getDescription()), Book::getDescription, book.getDescription());
    }*/
}
