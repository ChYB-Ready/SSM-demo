package com.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.web.service.HttpService;

import net.sf.json.JSONArray;

public class TestApp {

    private static String URL = "http://szagency.centaline.com.cn/account/GetUserListByLogin";

    /*  获取账号信息地址
     * 
     *  http://szagency.centaline.com.cn/
     *         http://szagency.centaline.com.cn/account/GetUserListByLogin
        http://bjagency.centaline.com.cn/
               http://bjagency.centaline.com.cn/account/GetUserListBy
        http://gzagency.centaline.com.cn/
                http://gzagency.centaline.com.cn/account/GetUserListByLogin
        http://cqagency.centaline.com.cn/
                http://cqagency.centaline.com.cn/account/GetUserListBy
        http://dgagency.centaline.com.cn/
     *          http://dgagency.centaline.com.cn/account/GetUserListByLogin
     * */

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/bean-*.xml");
        System.out.println(context);

        HttpService httpService = context.getBean("httpService", HttpService.class);
        try {

            Map<String, Object> maps = new HashMap<String, Object>();
            maps.put("login", "1");
            maps.put("name", "ma");
            String string = httpService.doGet("http://szagency.centaline.com.cn/account/GetUserListByLogin", maps);
            List<Map<String, Object>> collection = (List<Map<String, Object>>) JSONArray.toCollection(
                    JSONArray.fromObject(string), Map.class);
            for (Map<String, Object> map : collection) {
                System.out.println(map);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
