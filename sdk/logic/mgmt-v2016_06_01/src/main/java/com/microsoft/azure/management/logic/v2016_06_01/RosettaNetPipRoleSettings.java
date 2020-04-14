/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The integration account RosettaNet ProcessConfiguration role settings.
 */
public class RosettaNetPipRoleSettings {
    /**
     * The action name.
     */
    @JsonProperty(value = "action", required = true)
    private String action;

    /**
     * The role name.
     */
    @JsonProperty(value = "role", required = true)
    private String role;

    /**
     * The RosettaNet ProcessConfiguration role type. Possible values include:
     * 'NotSpecified', 'Functional', 'Organizational', 'Employee'.
     */
    @JsonProperty(value = "roleType", required = true)
    private RosettaNetPipRoleType roleType;

    /**
     * The service name.
     */
    @JsonProperty(value = "service", required = true)
    private String service;

    /**
     * The service classification name.
     */
    @JsonProperty(value = "serviceClassification", required = true)
    private String serviceClassification;

    /**
     * The RosettaNet ProcessConfiguration business document.
     */
    @JsonProperty(value = "businessDocument", required = true)
    private RosettaNetPipBusinessDocument businessDocument;

    /**
     * The description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the action name.
     *
     * @return the action value
     */
    public String action() {
        return this.action;
    }

    /**
     * Set the action name.
     *
     * @param action the action value to set
     * @return the RosettaNetPipRoleSettings object itself.
     */
    public RosettaNetPipRoleSettings withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get the role name.
     *
     * @return the role value
     */
    public String role() {
        return this.role;
    }

    /**
     * Set the role name.
     *
     * @param role the role value to set
     * @return the RosettaNetPipRoleSettings object itself.
     */
    public RosettaNetPipRoleSettings withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * Get the RosettaNet ProcessConfiguration role type. Possible values include: 'NotSpecified', 'Functional', 'Organizational', 'Employee'.
     *
     * @return the roleType value
     */
    public RosettaNetPipRoleType roleType() {
        return this.roleType;
    }

    /**
     * Set the RosettaNet ProcessConfiguration role type. Possible values include: 'NotSpecified', 'Functional', 'Organizational', 'Employee'.
     *
     * @param roleType the roleType value to set
     * @return the RosettaNetPipRoleSettings object itself.
     */
    public RosettaNetPipRoleSettings withRoleType(RosettaNetPipRoleType roleType) {
        this.roleType = roleType;
        return this;
    }

    /**
     * Get the service name.
     *
     * @return the service value
     */
    public String service() {
        return this.service;
    }

    /**
     * Set the service name.
     *
     * @param service the service value to set
     * @return the RosettaNetPipRoleSettings object itself.
     */
    public RosettaNetPipRoleSettings withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Get the service classification name.
     *
     * @return the serviceClassification value
     */
    public String serviceClassification() {
        return this.serviceClassification;
    }

    /**
     * Set the service classification name.
     *
     * @param serviceClassification the serviceClassification value to set
     * @return the RosettaNetPipRoleSettings object itself.
     */
    public RosettaNetPipRoleSettings withServiceClassification(String serviceClassification) {
        this.serviceClassification = serviceClassification;
        return this;
    }

    /**
     * Get the RosettaNet ProcessConfiguration business document.
     *
     * @return the businessDocument value
     */
    public RosettaNetPipBusinessDocument businessDocument() {
        return this.businessDocument;
    }

    /**
     * Set the RosettaNet ProcessConfiguration business document.
     *
     * @param businessDocument the businessDocument value to set
     * @return the RosettaNetPipRoleSettings object itself.
     */
    public RosettaNetPipRoleSettings withBusinessDocument(RosettaNetPipBusinessDocument businessDocument) {
        this.businessDocument = businessDocument;
        return this;
    }

    /**
     * Get the description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description.
     *
     * @param description the description value to set
     * @return the RosettaNetPipRoleSettings object itself.
     */
    public RosettaNetPipRoleSettings withDescription(String description) {
        this.description = description;
        return this;
    }

}
