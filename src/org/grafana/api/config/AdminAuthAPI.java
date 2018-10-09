
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class AdminAuthAPI {

    @SerializedName("Version")
    @Expose
    private String version;
    @SerializedName("Authentication")
    @Expose
    private String authentication;
    @SerializedName("Link")
    @Expose
    private String link;
    @SerializedName("ApiKeyList")
    @Expose
    private RequestParam apiKeyList;
    @SerializedName("CreateApiKey")
    @Expose
    private RequestParam createApiKey;
    @SerializedName("DeleteApiKeyByID")
    @Expose
    private RequestParam deleteApiKeyByID;

    /**
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     *
     * @return
     */
    public String getAuthentication() {
        return authentication;
    }

    /**
     *
     * @return
     */
    public String getLink() {
        return link;
    }

    /**
     *
     * @return
     */
    public RequestParam getApiKeyList() {
        return apiKeyList;
    }

    /**
     *
     * @return
     */
    public RequestParam getCreateApiKey() {
        return createApiKey;
    }

    /**
     *
     * @return
     */
    public RequestParam getDeleteApiKeyByID() {
        return deleteApiKeyByID;
    }

}
