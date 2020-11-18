package com.p6.demo.review.open_close_priciple;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JavaCourse implements ICourse{

    private Integer id;

    private String name;

    private Double price;


    @Override
    public Integer getId() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Double getPrice() {
        return null;
    }
}
