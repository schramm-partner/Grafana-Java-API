
package org.grafana.api.responses.AdminAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserOrgsRsp {

    @SerializedName("orgId")
    @Expose
    private Integer orgId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("role")
    @Expose
    private String role;

    public Integer getOrgId() {
        return orgId;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

}
