/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datadog.v2020_02_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DatadogOrganizationProperties model.
 */
public class DatadogOrganizationProperties {
    /**
     * Name of the Datadog organization.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Id of the Datadog organization.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The auth code used to linking to an existing datadog organization.
     */
    @JsonProperty(value = "linkingAuthCode")
    private String linkingAuthCode;

    /**
     * The client_id from an existing in exchange for an auth token to link
     * organization.
     */
    @JsonProperty(value = "linkingClientId")
    private String linkingClientId;

    /**
     * The Id of the Enterprise App used for Single sign on.
     */
    @JsonProperty(value = "enterpriseAppId")
    private String enterpriseAppId;

    /**
     * Get name of the Datadog organization.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get id of the Datadog organization.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the auth code used to linking to an existing datadog organization.
     *
     * @return the linkingAuthCode value
     */
    public String linkingAuthCode() {
        return this.linkingAuthCode;
    }

    /**
     * Set the auth code used to linking to an existing datadog organization.
     *
     * @param linkingAuthCode the linkingAuthCode value to set
     * @return the DatadogOrganizationProperties object itself.
     */
    public DatadogOrganizationProperties withLinkingAuthCode(String linkingAuthCode) {
        this.linkingAuthCode = linkingAuthCode;
        return this;
    }

    /**
     * Get the client_id from an existing in exchange for an auth token to link organization.
     *
     * @return the linkingClientId value
     */
    public String linkingClientId() {
        return this.linkingClientId;
    }

    /**
     * Set the client_id from an existing in exchange for an auth token to link organization.
     *
     * @param linkingClientId the linkingClientId value to set
     * @return the DatadogOrganizationProperties object itself.
     */
    public DatadogOrganizationProperties withLinkingClientId(String linkingClientId) {
        this.linkingClientId = linkingClientId;
        return this;
    }

    /**
     * Get the Id of the Enterprise App used for Single sign on.
     *
     * @return the enterpriseAppId value
     */
    public String enterpriseAppId() {
        return this.enterpriseAppId;
    }

    /**
     * Set the Id of the Enterprise App used for Single sign on.
     *
     * @param enterpriseAppId the enterpriseAppId value to set
     * @return the DatadogOrganizationProperties object itself.
     */
    public DatadogOrganizationProperties withEnterpriseAppId(String enterpriseAppId) {
        this.enterpriseAppId = enterpriseAppId;
        return this;
    }

}
