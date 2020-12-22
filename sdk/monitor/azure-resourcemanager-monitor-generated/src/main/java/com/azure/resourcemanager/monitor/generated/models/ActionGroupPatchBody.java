// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An action group object for the body of patch operations. */
@JsonFlatten
@Fluent
public class ActionGroupPatchBody {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ActionGroupPatchBody.class);

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Indicates whether this action group is enabled. If an action group is
     * not enabled, then none of its actions will be activated.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the ActionGroupPatchBody object itself.
     */
    public ActionGroupPatchBody withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the enabled property: Indicates whether this action group is enabled. If an action group is not enabled, then
     * none of its actions will be activated.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether this action group is enabled. If an action group is not enabled, then
     * none of its actions will be activated.
     *
     * @param enabled the enabled value to set.
     * @return the ActionGroupPatchBody object itself.
     */
    public ActionGroupPatchBody withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
