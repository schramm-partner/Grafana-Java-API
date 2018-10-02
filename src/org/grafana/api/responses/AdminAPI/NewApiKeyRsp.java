
package org.grafana.api.responses.AdminAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewApiKeyRsp {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("key")
    @Expose
    private String key;

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

}
