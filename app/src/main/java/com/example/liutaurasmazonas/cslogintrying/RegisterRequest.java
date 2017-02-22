package com.example.liutaurasmazonas.cslogintrying;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Liutauras Mazonas on 2/16/2017.
 */

public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "http://liutavaras.000webhostapp.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String name, String surname, String companysID, String password, String repeatpassword, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("surname", surname);
        params.put("companysID", companysID);
        params.put("password", password);

    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
