/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2015_08_01;

import java.util.Map;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters supplied to the Create Or Update Namespace operation.
 */
@JsonFlatten
public class NamespaceCreateOrUpdateParameters {
    /**
     * Namespace location.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * The sku property.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Namespace tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Provisioning state of the namespace.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * State of the namespace. Possible values include: 'Unknown', 'Creating',
     * 'Created', 'Activating', 'Enabling', 'Active', 'Disabling', 'Disabled',
     * 'SoftDeleting', 'SoftDeleted', 'Removing', 'Removed', 'Failed'.
     */
    @JsonProperty(value = "properties.status")
    private NamespaceState status;

    /**
     * The time the namespace was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAt;

    /**
     * The time the namespace was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime updatedAt;

    /**
     * Endpoint you can use to perform Service Bus operations.
     */
    @JsonProperty(value = "properties.serviceBusEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceBusEndpoint;

    /**
     * Indicates whether to create an ACS namespace.
     */
    @JsonProperty(value = "properties.createACSNamespace")
    private Boolean createACSNamespace;

    /**
     * Specifies whether this instance is enabled.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * Get namespace location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set namespace location.
     *
     * @param location the location value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get namespace tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set namespace tags.
     *
     * @param tags the tags value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get provisioning state of the namespace.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get state of the namespace. Possible values include: 'Unknown', 'Creating', 'Created', 'Activating', 'Enabling', 'Active', 'Disabling', 'Disabled', 'SoftDeleting', 'SoftDeleted', 'Removing', 'Removed', 'Failed'.
     *
     * @return the status value
     */
    public NamespaceState status() {
        return this.status;
    }

    /**
     * Set state of the namespace. Possible values include: 'Unknown', 'Creating', 'Created', 'Activating', 'Enabling', 'Active', 'Disabling', 'Disabled', 'SoftDeleting', 'SoftDeleted', 'Removing', 'Removed', 'Failed'.
     *
     * @param status the status value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withStatus(NamespaceState status) {
        this.status = status;
        return this;
    }

    /**
     * Get the time the namespace was created.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the time the namespace was updated.
     *
     * @return the updatedAt value
     */
    public DateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get endpoint you can use to perform Service Bus operations.
     *
     * @return the serviceBusEndpoint value
     */
    public String serviceBusEndpoint() {
        return this.serviceBusEndpoint;
    }

    /**
     * Get indicates whether to create an ACS namespace.
     *
     * @return the createACSNamespace value
     */
    public Boolean createACSNamespace() {
        return this.createACSNamespace;
    }

    /**
     * Set indicates whether to create an ACS namespace.
     *
     * @param createACSNamespace the createACSNamespace value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withCreateACSNamespace(Boolean createACSNamespace) {
        this.createACSNamespace = createACSNamespace;
        return this;
    }

    /**
     * Get specifies whether this instance is enabled.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set specifies whether this instance is enabled.
     *
     * @param enabled the enabled value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

}
