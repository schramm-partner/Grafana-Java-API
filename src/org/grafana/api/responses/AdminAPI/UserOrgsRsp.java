
package org.grafana.api.responses.AdminAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
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

    /**
     *
     * @return
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String getRole() {
        return role;
    }

}
