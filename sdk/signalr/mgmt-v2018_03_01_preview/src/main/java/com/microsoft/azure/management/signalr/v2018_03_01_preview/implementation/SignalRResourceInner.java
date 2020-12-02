/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2018_03_01_preview.implementation;

import com.microsoft.azure.management.signalr.v2018_03_01_preview.ResourceSku;
import com.microsoft.azure.management.signalr.v2018_03_01_preview.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * A class represent a SignalR service resource.
 */
@JsonFlatten
@SkipParentValidation
public class SignalRResourceInner extends Resource {
    /**
     * SKU of the service.
     */
    @JsonProperty(value = "sku")
    private ResourceSku sku;

    /**
     * Prefix for the hostName of the SignalR service. Retained for future use.
     * The hostname will be of format:
     * &amp;lt;hostNamePrefix&amp;gt;.service.signalr.net.
     */
    @JsonProperty(value = "properties.hostNamePrefix")
    private String hostNamePrefix;

    /**
     * Provisioning state of the resource. Possible values include: 'Unknown',
     * 'Succeeded', 'Failed', 'Canceled', 'Running', 'Creating', 'Updating',
     * 'Deleting', 'Moving'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The publicly accessible IP of the SignalR service.
     */
    @JsonProperty(value = "properties.externalIP", access = JsonProperty.Access.WRITE_ONLY)
    private String externalIP;

    /**
     * FQDN of the SignalR service instance. Format: xxx.service.signalr.net.
     */
    @JsonProperty(value = "properties.hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostName;

    /**
     * The publicly accessibly port of the SignalR service which is designed
     * for browser/client side usage.
     */
    @JsonProperty(value = "properties.publicPort", access = JsonProperty.Access.WRITE_ONLY)
    private Integer publicPort;

    /**
     * The publicly accessibly port of the SignalR service which is designed
     * for customer server side usage.
     */
    @JsonProperty(value = "properties.serverPort", access = JsonProperty.Access.WRITE_ONLY)
    private Integer serverPort;

    /**
     * Version of the SignalR resource. Probably you need the same or higher
     * version of client SDKs.
     */
    @JsonProperty(value = "properties.version")
    private String version;

    /**
     * Get sKU of the service.
     *
     * @return the sku value
     */
    public ResourceSku sku() {
        return this.sku;
    }

    /**
     * Set sKU of the service.
     *
     * @param sku the sku value to set
     * @return the SignalRResourceInner object itself.
     */
    public SignalRResourceInner withSku(ResourceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get prefix for the hostName of the SignalR service. Retained for future use.
     The hostname will be of format: &amp;lt;hostNamePrefix&amp;gt;.service.signalr.net.
     *
     * @return the hostNamePrefix value
     */
    public String hostNamePrefix() {
        return this.hostNamePrefix;
    }

    /**
     * Set prefix for the hostName of the SignalR service. Retained for future use.
     The hostname will be of format: &amp;lt;hostNamePrefix&amp;gt;.service.signalr.net.
     *
     * @param hostNamePrefix the hostNamePrefix value to set
     * @return the SignalRResourceInner object itself.
     */
    public SignalRResourceInner withHostNamePrefix(String hostNamePrefix) {
        this.hostNamePrefix = hostNamePrefix;
        return this;
    }

    /**
     * Get provisioning state of the resource. Possible values include: 'Unknown', 'Succeeded', 'Failed', 'Canceled', 'Running', 'Creating', 'Updating', 'Deleting', 'Moving'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the publicly accessible IP of the SignalR service.
     *
     * @return the externalIP value
     */
    public String externalIP() {
        return this.externalIP;
    }

    /**
     * Get fQDN of the SignalR service instance. Format: xxx.service.signalr.net.
     *
     * @return the hostName value
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * Get the publicly accessibly port of the SignalR service which is designed for browser/client side usage.
     *
     * @return the publicPort value
     */
    public Integer publicPort() {
        return this.publicPort;
    }

    /**
     * Get the publicly accessibly port of the SignalR service which is designed for customer server side usage.
     *
     * @return the serverPort value
     */
    public Integer serverPort() {
        return this.serverPort;
    }

    /**
     * Get version of the SignalR resource. Probably you need the same or higher version of client SDKs.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set version of the SignalR resource. Probably you need the same or higher version of client SDKs.
     *
     * @param version the version value to set
     * @return the SignalRResourceInner object itself.
     */
    public SignalRResourceInner withVersion(String version) {
        this.version = version;
        return this;
    }

}
