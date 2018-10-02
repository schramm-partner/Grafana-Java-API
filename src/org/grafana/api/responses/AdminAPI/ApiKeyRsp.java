
package org.grafana.api.responses.AdminAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiKeyRsp {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("role")
    @Expose
    private String role;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

}
