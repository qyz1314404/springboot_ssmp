package cn.qy.domain;

import lombok.Data;

/**
 * @description:
 * @author: QiuYang
 * @time: 2022/3/30
 */
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;

}
