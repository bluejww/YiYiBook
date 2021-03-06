package com.yiyibook.yiyibook.Utils.netutil;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yanzhenjie.nohttp.Headers;
import com.yanzhenjie.nohttp.RequestMethod;
import com.yanzhenjie.nohttp.rest.RestRequest;
import com.yanzhenjie.nohttp.rest.StringRequest;

/**
 * Created by jianweiwei on 2018/4/1.
 */

public class FastJsonRequest extends RestRequest<JSONObject> {

    public FastJsonRequest(String url) {
        this(url, RequestMethod.GET);
    }

    public FastJsonRequest(String url, RequestMethod requestMethod) {
        super(url, requestMethod);

        // 设置Accept请求头，告诉服务器，我们需要application/json数据。
        setAccept(Headers.HEAD_VALUE_ACCEPT_ALL);
    }

    /**
     * 解析服务器响应数据为你的泛型T，这里也就是JSONObject。
     *
     * @param responseHeaders 服务器响应头。
     * @param responseBody    服务器响应包体。
     * @return 返回你的泛型对象。
     */
    @Override
    public JSONObject parseResponse(Headers responseHeaders, byte[] responseBody) {
        String result = StringRequest.parseResponseString(responseHeaders, responseBody);
        return JSON.parseObject(result); // StringRequest就是少了这句话而已。
    }
}
