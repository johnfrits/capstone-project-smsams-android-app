package com.example.admin123.smsams.request;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class GetAreaListRequest extends StringRequest {

    private static final String GET_AREA_LIST_URL = "http://192.168.1.11/smsams/get_area_list.php";
    private Map<String, String> params;

    public GetAreaListRequest(String get_area_status, Response.Listener<String> listener) {
        super(Method.POST, GET_AREA_LIST_URL, listener, null);

        params = new HashMap<>();
        params.put("get_area_status", get_area_status);

    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}