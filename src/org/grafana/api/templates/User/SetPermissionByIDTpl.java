
package org.grafana.api.templates.User;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SetPermissionByIDTpl {

    @SerializedName("isGrafanaAdmin")
    @Expose
    private Boolean isGrafanaAdmin;

    public Boolean getIsGrafanaAdmin() {
        return isGrafanaAdmin;
    }

    public void setIsGrafanaAdmin(Boolean isGrafanaAdmin) {
        this.isGrafanaAdmin = isGrafanaAdmin;
    }

}
