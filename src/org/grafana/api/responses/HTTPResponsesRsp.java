
package org.grafana.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HTTPResponsesRsp {

    @SerializedName("200")
    @Expose
    private String _200;
    @SerializedName("400")
    @Expose
    private String _400;
    @SerializedName("401")
    @Expose
    private String _401;
    @SerializedName("403")
    @Expose
    private String _403;
    @SerializedName("412")
    @Expose
    private String _412;

    public String get200() {
        return _200;
    }

    public String get400() {
        return _400;
    }

    public String get401() {
        return _401;
    }

    public String get403() {
        return _403;
    }

    public String get412() {
        return _412;
    }

}
