package cn.qy.dao;

import cn.qy.domain.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: QiuYang
 * @time: 2022/3/30
 */
@Mapper
@Repository
public interface BookDao extends BaseMapper<Book> {
}
