
package org.grafana.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class MessageRsp {

    @SerializedName("message")
    @Expose
    private String message;

    /**
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

}
