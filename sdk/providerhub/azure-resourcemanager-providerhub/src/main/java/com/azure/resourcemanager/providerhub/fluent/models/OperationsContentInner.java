// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.providerhub.models.OperationsDefinitionActionType;
import com.azure.resourcemanager.providerhub.models.OperationsDefinitionDisplay;
import com.azure.resourcemanager.providerhub.models.OperationsDefinitionOrigin;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The OperationsContent model. */
@JsonFlatten
@Fluent
public class OperationsContentInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsContentInner.class);

    /*
     * Name of the operation.
     */
    @JsonProperty(value = "properties.name")
    private String namePropertiesName;

    /*
     * Indicates whether the operation applies to data-plane.
     */
    @JsonProperty(value = "properties.isDataAction")
    private Boolean isDataAction;

    /*
     * The origin property.
     */
    @JsonProperty(value = "properties.origin")
    private OperationsDefinitionOrigin origin;

    /*
     * Display information of the operation.
     */
    @JsonProperty(value = "properties.display")
    private OperationsDefinitionDisplay display;

    /*
     * The actionType property.
     */
    @JsonProperty(value = "properties.actionType")
    private OperationsDefinitionActionType actionType;

    /*
     * Any object
     */
    @JsonProperty(value = "properties.properties")
    private Object properties;

    /**
     * Get the namePropertiesName property: Name of the operation.
     *
     * @return the namePropertiesName value.
     */
    public String namePropertiesName() {
        return this.namePropertiesName;
    }

    /**
     * Set the namePropertiesName property: Name of the operation.
     *
     * @param namePropertiesName the namePropertiesName value to set.
     * @return the OperationsContentInner object itself.
     */
    public OperationsContentInner withNamePropertiesName(String namePropertiesName) {
        this.namePropertiesName = namePropertiesName;
        return this;
    }

    /**
     * Get the isDataAction property: Indicates whether the operation applies to data-plane.
     *
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set the isDataAction property: Indicates whether the operation applies to data-plane.
     *
     * @param isDataAction the isDataAction value to set.
     * @return the OperationsContentInner object itself.
     */
    public OperationsContentInner withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get the origin property: The origin property.
     *
     * @return the origin value.
     */
    public OperationsDefinitionOrigin origin() {
        return this.origin;
    }

    /**
     * Set the origin property: The origin property.
     *
     * @param origin the origin value to set.
     * @return the OperationsContentInner object itself.
     */
    public OperationsContentInner withOrigin(OperationsDefinitionOrigin origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the display property: Display information of the operation.
     *
     * @return the display value.
     */
    public OperationsDefinitionDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Display information of the operation.
     *
     * @param display the display value to set.
     * @return the OperationsContentInner object itself.
     */
    public OperationsContentInner withDisplay(OperationsDefinitionDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the actionType property: The actionType property.
     *
     * @return the actionType value.
     */
    public OperationsDefinitionActionType actionType() {
        return this.actionType;
    }

    /**
     * Set the actionType property: The actionType property.
     *
     * @param actionType the actionType value to set.
     * @return the OperationsContentInner object itself.
     */
    public OperationsContentInner withActionType(OperationsDefinitionActionType actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * Get the properties property: Any object.
     *
     * @return the properties value.
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Any object.
     *
     * @param properties the properties value to set.
     * @return the OperationsContentInner object itself.
     */
    public OperationsContentInner withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }
}
