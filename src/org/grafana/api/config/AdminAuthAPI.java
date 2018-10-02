
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
    private ApiKeyList apiKeyList;
    @SerializedName("CreateApiKey")
    @Expose
    private CreateApiKey createApiKey;
    @SerializedName("DeleteApiKeyByID")
    @Expose
    private DeleteApiKeyByID deleteApiKeyByID;

    public String getVersion() {
        return version;
    }

    public String getAuthentication() {
        return authentication;
    }

    public String getLink() {
        return link;
    }

    public ApiKeyList getApiKeyList() {
        return apiKeyList;
    }

    public CreateApiKey getCreateApiKey() {
        return createApiKey;
    }

    public DeleteApiKeyByID getDeleteApiKeyByID() {
        return deleteApiKeyByID;
    }

}
