// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.models.LinkedInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The DatastoreProperties model. */
@Fluent
public final class DatastorePropertiesInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatastorePropertiesInner.class);

    /*
     * The contents property.
     */
    @JsonProperty(value = "contents", required = true)
    private DatastoreContentsInner contents;

    /*
     * Whether the service has validated access to the datastore with the
     * provided credentials.
     */
    @JsonProperty(value = "hasBeenValidated", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hasBeenValidated;

    /*
     * Whether this datastore is the default for the workspace.
     */
    @JsonProperty(value = "isDefault")
    private Boolean isDefault;

    /*
     * The linkedInfo property.
     */
    @JsonProperty(value = "linkedInfo")
    private LinkedInfo linkedInfo;

    /*
     * Dictionary of <string>
     */
    @JsonProperty(value = "properties")
    private Map<String, String> properties;

    /*
     * The asset description text.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Tag dictionary. Tags can be added, removed, and updated.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the contents property: The contents property.
     *
     * @return the contents value.
     */
    public DatastoreContentsInner contents() {
        return this.contents;
    }

    /**
     * Set the contents property: The contents property.
     *
     * @param contents the contents value to set.
     * @return the DatastorePropertiesInner object itself.
     */
    public DatastorePropertiesInner withContents(DatastoreContentsInner contents) {
        this.contents = contents;
        return this;
    }

    /**
     * Get the hasBeenValidated property: Whether the service has validated access to the datastore with the provided
     * credentials.
     *
     * @return the hasBeenValidated value.
     */
    public Boolean hasBeenValidated() {
        return this.hasBeenValidated;
    }

    /**
     * Get the isDefault property: Whether this datastore is the default for the workspace.
     *
     * @return the isDefault value.
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set the isDefault property: Whether this datastore is the default for the workspace.
     *
     * @param isDefault the isDefault value to set.
     * @return the DatastorePropertiesInner object itself.
     */
    public DatastorePropertiesInner withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get the linkedInfo property: The linkedInfo property.
     *
     * @return the linkedInfo value.
     */
    public LinkedInfo linkedInfo() {
        return this.linkedInfo;
    }

    /**
     * Set the linkedInfo property: The linkedInfo property.
     *
     * @param linkedInfo the linkedInfo value to set.
     * @return the DatastorePropertiesInner object itself.
     */
    public DatastorePropertiesInner withLinkedInfo(LinkedInfo linkedInfo) {
        this.linkedInfo = linkedInfo;
        return this;
    }

    /**
     * Get the properties property: Dictionary of &lt;string&gt;.
     *
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Dictionary of &lt;string&gt;.
     *
     * @param properties the properties value to set.
     * @return the DatastorePropertiesInner object itself.
     */
    public DatastorePropertiesInner withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the description property: The asset description text.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The asset description text.
     *
     * @param description the description value to set.
     * @return the DatastorePropertiesInner object itself.
     */
    public DatastorePropertiesInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the tags property: Tag dictionary. Tags can be added, removed, and updated.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Tag dictionary. Tags can be added, removed, and updated.
     *
     * @param tags the tags value to set.
     * @return the DatastorePropertiesInner object itself.
     */
    public DatastorePropertiesInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (contents() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property contents in model DatastorePropertiesInner"));
        } else {
            contents().validate();
        }
        if (linkedInfo() != null) {
            linkedInfo().validate();
        }
    }
}
