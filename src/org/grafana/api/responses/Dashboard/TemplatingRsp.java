
package org.grafana.api.responses.Dashboard;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class TemplatingRsp {

    @SerializedName("list")
    @Expose
    private List<Object> list = new ArrayList<Object>();

    /**
     *
     * @return
     */
    public List<Object> getList() {
        return list;
    }

}
