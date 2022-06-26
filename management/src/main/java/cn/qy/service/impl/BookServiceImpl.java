package cn.qy.service.impl;

import cn.qy.dao.BookDao;
import cn.qy.domain.Book;
import cn.qy.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: QiuYang
 * @time: 2022/3/31
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book>  implements IBookService  {
}
