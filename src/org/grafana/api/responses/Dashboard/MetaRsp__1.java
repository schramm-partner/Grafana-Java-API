
package org.grafana.api.responses.Dashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class MetaRsp__1 {

    @SerializedName("isHome")
    @Expose
    private Boolean isHome;
    @SerializedName("canSave")
    @Expose
    private Boolean canSave;
    @SerializedName("canEdit")
    @Expose
    private Boolean canEdit;
    @SerializedName("canStar")
    @Expose
    private Boolean canStar;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("expires")
    @Expose
    private String expires;
    @SerializedName("created")
    @Expose
    private String created;

    /**
     *
     * @return
     */
    public Boolean getIsHome() {
        return isHome;
    }

    /**
     *
     * @return
     */
    public Boolean getCanSave() {
        return canSave;
    }

    /**
     *
     * @return
     */
    public Boolean getCanEdit() {
        return canEdit;
    }

    /**
     *
     * @return
     */
    public Boolean getCanStar() {
        return canStar;
    }

    /**
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @return
     */
    public String getExpires() {
        return expires;
    }

    /**
     *
     * @return
     */
    public String getCreated() {
        return created;
    }

}
