
package org.grafana.api.templates.Organisation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddOrgUserTpl {

    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("loginOrEmail")
    @Expose
    private String loginOrEmail;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLoginOrEmail() {
        return loginOrEmail;
    }

    public void setLoginOrEmail(String loginOrEmail) {
        this.loginOrEmail = loginOrEmail;
    }

}
