package cn.itcast.eshop.common.util;

import cn.itcast.eshop.common.entity.Entity;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * JSON工具类
 * 处理和JSON相关的所有内容
 */
public class JSONUtil {
    public static void main(String[] args) {
        Entity entity = new Entity();
        entity.setId("100");
        entity.setCreateTime("10:16");
        String json = entity2JSON(entity);
        System.out.println(json); // {"createTime":"10:16","id":"100","isDel":"1"}

        System.out.println("-------------------");
        List<Entity> entitylist = new ArrayList<>();
        entitylist.add(entity);
        String jsonList = entityList2JSON(entitylist);
        System.out.println(jsonList); // [{"createTime":"10:16","id":"100","isDel":"1"}]
        System.out.println("-------------------");
        String jsonStr = "{\"createTime\":\"10:25\",\"id\":\"100\",\"isDel\":\"1\"}";
        Object obj = JSON2Entity(jsonStr, Entity.class);
        Entity e = (Entity) obj;
        System.out.println(e.getCreateTime());

        System.out.println("-------------------");

    }

    /**
     * 把对象转换成json字符串
     *
     * @param entity 指定对象
     * @return JSON格式的字符串
     */
    public static String entity2JSON(Object entity) {
        return JSON.toJSONString(entity);
    }

    public static String entityList2JSON(List<?> entityList) {
        return entity2JSON(entityList);
    }

    /**
     * 把JSON字符串转换成指定类型的对象
     * ? 泛型通配符 代表的是未知的任意类型 或者说是object
     *
     * @param json
     * @param clazz
     * @return 返回object对象
     */
//    public static Object JSON2Entity(String json, Class<?> clazz) {
//        Object obj = JSON.parseObject(json, clazz);
//        return obj;
//    }

    public static <T> T JSON2Entity(String json, Class<T> clazz) {
        return JSON.parseObject(json, clazz);

    }

    /**
     * 将JSON数组转换成指定类型的对象列表
     * ? 泛型通配符 代表的是未知的任意类型 或者说是object
     *
     * @param json
     * @param clazz
     * @return 返回object对象
     */
    public static <T> List<T> JSONArray2List  (String json, Class<T> clazz) {
        return JSON.parseArray(json, clazz);
    }
}
