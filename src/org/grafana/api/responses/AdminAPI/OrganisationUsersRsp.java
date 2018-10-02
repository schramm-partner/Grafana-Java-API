
package org.grafana.api.responses.AdminAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public Integer getOrgId() {
        return orgId;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getRole() {
        return role;
    }

}
