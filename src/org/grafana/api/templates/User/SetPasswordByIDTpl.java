
package org.grafana.api.templates.User;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SetPasswordByIDTpl {

    @SerializedName("password")
    @Expose
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
