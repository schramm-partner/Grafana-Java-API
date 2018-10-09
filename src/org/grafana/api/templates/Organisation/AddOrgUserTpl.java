
package org.grafana.api.templates.Organisation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class AddOrgUserTpl {

    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("loginOrEmail")
    @Expose
    private String loginOrEmail;

    /**
     *
     * @return
     */
    public String getRole() {
        return role;
    }

    /**
     *
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     *
     * @return
     */
    public String getLoginOrEmail() {
        return loginOrEmail;
    }

    /**
     *
     * @param loginOrEmail
     */
    public void setLoginOrEmail(String loginOrEmail) {
        this.loginOrEmail = loginOrEmail;
    }

}
