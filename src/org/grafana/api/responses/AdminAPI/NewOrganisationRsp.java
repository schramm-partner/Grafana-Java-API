
package org.grafana.api.responses.AdminAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewOrganisationRsp {

    @SerializedName("orgId")
    @Expose
    private String orgId;
    @SerializedName("message")
    @Expose
    private String message;

    public String getOrgId() {
        return orgId;
    }

    public String getMessage() {
        return message;
    }

}
