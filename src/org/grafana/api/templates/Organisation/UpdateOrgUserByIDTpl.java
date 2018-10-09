
package org.grafana.api.templates.Organisation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class UpdateOrgUserByIDTpl {

    @SerializedName("role")
    @Expose
    private String role;

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

}
