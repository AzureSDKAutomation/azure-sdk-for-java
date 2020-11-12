/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.privatedns.v2020_06_01.implementation;

import com.microsoft.azure.management.privatedns.v2020_06_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Describes a Private DNS zone.
 */
@JsonFlatten
@SkipParentValidation
public class PrivateZoneInner extends Resource {
    /**
     * The ETag of the zone.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * The maximum number of record sets that can be created in this Private
     * DNS zone. This is a read-only property and any attempt to set this value
     * will be ignored.
     */
    @JsonProperty(value = "properties.maxNumberOfRecordSets", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxNumberOfRecordSets;

    /**
     * The current number of record sets in this Private DNS zone. This is a
     * read-only property and any attempt to set this value will be ignored.
     */
    @JsonProperty(value = "properties.numberOfRecordSets", access = JsonProperty.Access.WRITE_ONLY)
    private Long numberOfRecordSets;

    /**
     * The maximum number of virtual networks that can be linked to this
     * Private DNS zone. This is a read-only property and any attempt to set
     * this value will be ignored.
     */
    @JsonProperty(value = "properties.maxNumberOfVirtualNetworkLinks", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxNumberOfVirtualNetworkLinks;

    /**
     * The current number of virtual networks that are linked to this Private
     * DNS zone. This is a read-only property and any attempt to set this value
     * will be ignored.
     */
    @JsonProperty(value = "properties.numberOfVirtualNetworkLinks", access = JsonProperty.Access.WRITE_ONLY)
    private Long numberOfVirtualNetworkLinks;

    /**
     * The maximum number of virtual networks that can be linked to this
     * Private DNS zone with registration enabled. This is a read-only property
     * and any attempt to set this value will be ignored.
     */
    @JsonProperty(value = "properties.maxNumberOfVirtualNetworkLinksWithRegistration", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxNumberOfVirtualNetworkLinksWithRegistration;

    /**
     * The current number of virtual networks that are linked to this Private
     * DNS zone with registration enabled. This is a read-only property and any
     * attempt to set this value will be ignored.
     */
    @JsonProperty(value = "properties.numberOfVirtualNetworkLinksWithRegistration", access = JsonProperty.Access.WRITE_ONLY)
    private Long numberOfVirtualNetworkLinksWithRegistration;

    /**
     * The provisioning state of the resource. This is a read-only property and
     * any attempt to set this value will be ignored. Possible values include:
     * 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Private zone internal Id.
     */
    @JsonProperty(value = "properties.internalId", access = JsonProperty.Access.WRITE_ONLY)
    private String internalId;

    /**
     * Get the ETag of the zone.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the ETag of the zone.
     *
     * @param etag the etag value to set
     * @return the PrivateZoneInner object itself.
     */
    public PrivateZoneInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the maximum number of record sets that can be created in this Private DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     *
     * @return the maxNumberOfRecordSets value
     */
    public Long maxNumberOfRecordSets() {
        return this.maxNumberOfRecordSets;
    }

    /**
     * Get the current number of record sets in this Private DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     *
     * @return the numberOfRecordSets value
     */
    public Long numberOfRecordSets() {
        return this.numberOfRecordSets;
    }

    /**
     * Get the maximum number of virtual networks that can be linked to this Private DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     *
     * @return the maxNumberOfVirtualNetworkLinks value
     */
    public Long maxNumberOfVirtualNetworkLinks() {
        return this.maxNumberOfVirtualNetworkLinks;
    }

    /**
     * Get the current number of virtual networks that are linked to this Private DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     *
     * @return the numberOfVirtualNetworkLinks value
     */
    public Long numberOfVirtualNetworkLinks() {
        return this.numberOfVirtualNetworkLinks;
    }

    /**
     * Get the maximum number of virtual networks that can be linked to this Private DNS zone with registration enabled. This is a read-only property and any attempt to set this value will be ignored.
     *
     * @return the maxNumberOfVirtualNetworkLinksWithRegistration value
     */
    public Long maxNumberOfVirtualNetworkLinksWithRegistration() {
        return this.maxNumberOfVirtualNetworkLinksWithRegistration;
    }

    /**
     * Get the current number of virtual networks that are linked to this Private DNS zone with registration enabled. This is a read-only property and any attempt to set this value will be ignored.
     *
     * @return the numberOfVirtualNetworkLinksWithRegistration value
     */
    public Long numberOfVirtualNetworkLinksWithRegistration() {
        return this.numberOfVirtualNetworkLinksWithRegistration;
    }

    /**
     * Get the provisioning state of the resource. This is a read-only property and any attempt to set this value will be ignored. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get private zone internal Id.
     *
     * @return the internalId value
     */
    public String internalId() {
        return this.internalId;
    }

}
