
package org.grafana.api.templates.User;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class SetPermissionByIDTpl {

    @SerializedName("isGrafanaAdmin")
    @Expose
    private Boolean isGrafanaAdmin;

    /**
     *
     * @return
     */
    public Boolean getIsGrafanaAdmin() {
        return isGrafanaAdmin;
    }

    /**
     *
     * @param isGrafanaAdmin
     */
    public void setIsGrafanaAdmin(Boolean isGrafanaAdmin) {
        this.isGrafanaAdmin = isGrafanaAdmin;
    }

}
