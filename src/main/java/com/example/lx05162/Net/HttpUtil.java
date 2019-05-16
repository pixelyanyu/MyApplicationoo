package com.example.lx05162.Net;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.lx05162.MyAppliction;

import java.util.HashMap;
import java.util.Map;

/*
 *@Auther:田恒宇
 *@weichat: 15020451581
 *@Description:function
 */
public class HttpUtil {
    private static final HttpUtil util=new HttpUtil();
    public static HttpUtil util(){
        return util;
    }
    public HttpUtil(){

    }
    public interface getAs{
        void ontrue(String s);
        void onfalse(String s);
    }
    public void getASS(String url, final String t1, final String t2, final getAs as){
        StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                as.ontrue(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                as.onfalse(error.getMessage());
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String, String> map = new HashMap<>();
                map.put("phone",t1);
                map.put("pwd",t2);
                return super.getParams();
            }
        };
        request.setTag("get");
        MyAppliction.getQueue().add(request);
    }
}
