
package org.grafana.api.responses.AdminAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class NewOrganisationRsp {

    @SerializedName("orgId")
    @Expose
    private String orgId;
    @SerializedName("message")
    @Expose
    private String message;

    /**
     *
     * @return
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

}
