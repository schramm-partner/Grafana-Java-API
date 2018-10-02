
package org.grafana.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MessageRsp {

    @SerializedName("message")
    @Expose
    private String message;

    public String getMessage() {
        return message;
    }

}
