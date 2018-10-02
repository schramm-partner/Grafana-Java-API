
package org.grafana.api.templates.Dashboard;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DashboardTpl {

    @SerializedName("annotations")
    @Expose
    private AnnotationsTpl annotations;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("editable")
    @Expose
    private Boolean editable;
    @SerializedName("graphTooltip")
    @Expose
    private Integer graphTooltip;
    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("links")
    @Expose
    private List<Object> links = new ArrayList<Object>();
    @SerializedName("panels")
    @Expose
    private List<Object> panels = new ArrayList<Object>();
    @SerializedName("refresh")
    @Expose
    private Boolean refresh;
    @SerializedName("schemaVersion")
    @Expose
    private Integer schemaVersion;
    @SerializedName("style")
    @Expose
    private String style;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = new ArrayList<Object>();
    @SerializedName("templating")
    @Expose
    private TemplatingTpl templating;
    @SerializedName("time")
    @Expose
    private TimeTpl time;
    @SerializedName("timepicker")
    @Expose
    private TimepickerTpl timepicker;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("version")
    @Expose
    private Integer version;

    public AnnotationsTpl getAnnotations() {
        return annotations;
    }

    public void setAnnotations(AnnotationsTpl annotations) {
        this.annotations = annotations;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public Integer getGraphTooltip() {
        return graphTooltip;
    }

    public void setGraphTooltip(Integer graphTooltip) {
        this.graphTooltip = graphTooltip;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public List<Object> getLinks() {
        return links;
    }

    public void setLinks(List<Object> links) {
        this.links = links;
    }

    public List<Object> getPanels() {
        return panels;
    }

    public void setPanels(List<Object> panels) {
        this.panels = panels;
    }

    public Boolean getRefresh() {
        return refresh;
    }

    public void setRefresh(Boolean refresh) {
        this.refresh = refresh;
    }

    public Integer getSchemaVersion() {
        return schemaVersion;
    }

    public void setSchemaVersion(Integer schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public TemplatingTpl getTemplating() {
        return templating;
    }

    public void setTemplating(TemplatingTpl templating) {
        this.templating = templating;
    }

    public TimeTpl getTime() {
        return time;
    }

    public void setTime(TimeTpl time) {
        this.time = time;
    }

    public TimepickerTpl getTimepicker() {
        return timepicker;
    }

    public void setTimepicker(TimepickerTpl timepicker) {
        this.timepicker = timepicker;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}
