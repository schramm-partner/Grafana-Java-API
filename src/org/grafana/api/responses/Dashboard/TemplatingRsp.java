
package org.grafana.api.responses.Dashboard;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TemplatingRsp {

    @SerializedName("list")
    @Expose
    private List<Object> list = new ArrayList<Object>();

    public List<Object> getList() {
        return list;
    }

}
