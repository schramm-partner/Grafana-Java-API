
package org.grafana.api.templates.Organisation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpdateOrgUserByIDTpl {

    @SerializedName("role")
    @Expose
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
