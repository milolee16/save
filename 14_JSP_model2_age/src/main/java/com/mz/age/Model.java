package com.mz.age;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Model {

    public static void calAge(HttpServletRequest request) {
         // 1. 값받기
         int birth = Integer.parseInt(request.getParameter("birth"));

         Date date = new Date();
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
         String year =  sdf.format(date);

         int year2 = LocalDate.now().getYear();
         // 한국나이
         int age = year2 - birth + 1;

         // 결과에서 뭘 쓸지?
                // 년생, 나이
            Bean b = new Bean();
            b.setBirth(birth);
            b.setAge(age);

        System.out.println(b);
        Bean b1 = new Bean(birth, age);

        request.setAttribute("bean", b1);



    }
}
