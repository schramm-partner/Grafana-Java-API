
package org.grafana.api.responses.AdminAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class OrganisationUsersRsp {

    @SerializedName("orgId")
    @Expose
    private Integer orgId;
    @SerializedName("userId")
    @Expose
    private Integer userId;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("login")
    @Expose
    private String login;
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
    public Integer getUserId() {
        return userId;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return
     */
    public String getLogin() {
        return login;
    }

    /**
     *
     * @return
     */
    public String getRole() {
        return role;
    }

}
