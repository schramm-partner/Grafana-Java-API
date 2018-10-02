
package org.grafana.api.responses.AdminAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserRsp {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("theme")
    @Expose
    private String theme;
    @SerializedName("orgId")
    @Expose
    private Integer orgId;
    @SerializedName("isGrafanaAdmin")
    @Expose
    private Boolean isGrafanaAdmin;

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getTheme() {
        return theme;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public Boolean getIsGrafanaAdmin() {
        return isGrafanaAdmin;
    }

}
