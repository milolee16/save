package com.mz.test;

import javax.servlet.http.HttpServletRequest;

public class Model {
    public static void makeInfo(HttpServletRequest request) {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        String[] habit = request.getParameterValues("habit");

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);

        String habit2 = "";
        for(String h : habit){
            System.out.println(h);
            habit2 += h + " / ";            // cook / excer
        }
        // 결과에서 필요한거
        // 한번에 뭉쳐서 보내자. (객체)
        Information info = new Information(name,age,gender,habit2);

        request.setAttribute("information", info);

    }


}
