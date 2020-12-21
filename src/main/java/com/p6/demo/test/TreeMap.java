package com.p6.demo.test;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/11
 */
public class TreeMap {

    public static void main(String[] args) {


        List<AuctionHallDAO> lists = new ArrayList<>();


        AuctionHallDAO a1 = new AuctionHallDAO();

        a1.setAreaCode("[]");
        a1.setCode("0003-113");
        a1.setDiff(194L);
        a1.setGroupAreaName("江西省南昌市");
        a1.setNewTime("2020-12-11");


        AuctionHallDAO a2 = new AuctionHallDAO();

        a2.setAreaCode("[]");
        a2.setCode("0010-7");
        a2.setDiff(194L);
        a2.setGroupAreaName("江西省南昌市");
        a2.setNewTime("2020-12-09");


        AuctionHallDAO a3 = new AuctionHallDAO();

        a3.setAreaCode("[]");
        a3.setCode("0003-104");
        a3.setDiff(194L);
        a3.setGroupAreaName("江西省南昌市");
        a3.setNewTime("2020-12-08");

        AuctionHallDAO a4 = new AuctionHallDAO();

        a4.setAreaCode("[]");
        a4.setCode("0010-6");
        a4.setDiff(194L);
        a4.setGroupAreaName("江西省南昌市");
        a4.setNewTime("2020-12-08");


        lists.add(a1);
        lists.add(a2);
        lists.add(a3);
        lists.add(a4);


        System.out.println("未分组前:");

        System.out.println(JSONObject.toJSONString(lists));

        System.out.println("group by 分组之后:");

        // 对数据进行分组根据newTime字段进行分组(年月日为一组后面的为具体的数据)
        Map<String, List<AuctionHallDAO>> groupMaps =
                lists.stream().collect(Collectors.groupingBy(AuctionHallDAO::getNewTime, LinkedHashMap::new,Collectors.toList()));

        System.out.println(JSONObject.toJSONString(groupMaps));


    }

    /**
     * 使用 Map按key进行排序
     * @param map
     * @return
     */
    public static <K extends Comparable<? super K>, V> Map<K, V> sortByKey(Map<K, V> map, boolean isDesc) {
        Map<K, V> result = Maps.newLinkedHashMap();
        if (isDesc) {
            map.entrySet().stream().sorted(Map.Entry.<K, V>comparingByKey().reversed())
                    .forEachOrdered(e -> result.put(e.getKey(), e.getValue()));
        } else {
            map.entrySet().stream().sorted(Map.Entry.<K, V>comparingByKey())
                    .forEachOrdered(e -> result.put(e.getKey(), e.getValue()));
        }
        return result;
    }
}
