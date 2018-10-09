
package org.grafana.api.responses.AdminAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
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

    /**
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String getLogin() {
        return login;
    }

    /**
     *
     * @return
     */
    public String getTheme() {
        return theme;
    }

    /**
     *
     * @return
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     *
     * @return
     */
    public Boolean getIsGrafanaAdmin() {
        return isGrafanaAdmin;
    }

}
