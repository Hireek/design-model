package com.p6.demo.design_model.prototype.deep;

import lombok.Data;

import java.io.*;
import java.util.List;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/26
 */
@Data
public class ConcretePrototype implements Cloneable , Serializable {

    private int age;
    private String name;
    private List<String> hobbits;


    @Override
    public ConcretePrototype clone() {

        try {
            return (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 深克隆
     */
    public ConcretePrototype deepClone() throws Exception{

        // 将当前对象写入内存
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        return (ConcretePrototype)ois.readObject();

    }
}
