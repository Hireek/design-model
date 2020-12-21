package com.p6.demo.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/5/6
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuctionHallDAO {

    /**
     * id
     */
    private Integer id;
    /**
     * 专场名称
     */
    private String name;
    /**
     * 专场编码
     */
    private String code;
    /**
     * 专场类型 1. 明拍, 2. 暗拍, 3. 一口价, 4. 超级拍 5. 打包拍
     */
    private String type;
    /**
     * 专场开始时间
     */
    private Date startTime;
    /**
     * 专场结束时间
     */
    private Date endTime;
    /**
     * 明拍开始时间-适用于超级拍
     */
    private Date mStartTime;
    /**
     * 明拍结束时间-适用于超级拍
     */
    private Date mEndTime;
    /**
     * 暗拍开始时间-适用于超级拍
     */
    private Date aStartTime;
    /**
     * 暗拍结束时间-适用于超级拍
     */
    private Date aEndTime;
    /**
     * 预计结束时间
     */
    private Date preEndTime;
    /**
     * 参拍人员
     */
    private String limitPeople;
    /**
     * 可参拍地区编码
     */
    private String areaCode;
    /**
     * 服务类型 1. 阶梯服务 2. 百分比 3. 固定
     */
    private Integer serviceType;
    /**
     * 金额数值
     */
    private Double value;
    /**
     * 集团Id
     */
    private Integer groupId;
    /**
     * 0. 代表未开始 1. 代表正在进行 2. 已经结束
     */
    private Integer status;
    /**
     * 集团/门店图片地址
     */
    private String image;
    /**
     * 附属字段，用于时间分组
     */
    private String newTime;

    /**
     * 差值运算 , 用于计算排序规则
     */
    private Long diff;
    /**
     * 上拍集团地区编码
     */
    private String groupAreaCode;

    private String groupAreaName;

    /**
     * 供应商或集团名称
     */
    private String groupName;

    private String carCount;

    private String totalCount;

    private String disExtName;

}
