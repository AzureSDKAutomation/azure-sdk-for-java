/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.dns.v2016_04_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Describes a DNS zone.
 */
@JsonFlatten
public class ZoneInner extends Resource {
    /**
     * The etag of the zone.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * The maximum number of record sets that can be created in this DNS zone.
     * This is a read-only property and any attempt to set this value will be
     * ignored.
     */
    @JsonProperty(value = "properties.maxNumberOfRecordSets")
    private Long maxNumberOfRecordSets;

    /**
     * The maximum number of records per record set that can be created in this
     * DNS zone.  This is a read-only property and any attempt to set this
     * value will be ignored.
     */
    @JsonProperty(value = "properties.maxNumberOfRecordsPerRecordSet", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxNumberOfRecordsPerRecordSet;

    /**
     * The current number of record sets in this DNS zone.  This is a read-only
     * property and any attempt to set this value will be ignored.
     */
    @JsonProperty(value = "properties.numberOfRecordSets")
    private Long numberOfRecordSets;

    /**
     * The name servers for this DNS zone. This is a read-only property and any
     * attempt to set this value will be ignored.
     */
    @JsonProperty(value = "properties.nameServers", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> nameServers;

    /**
     * Get the etag of the zone.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag of the zone.
     *
     * @param etag the etag value to set
     * @return the ZoneInner object itself.
     */
    public ZoneInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the maximum number of record sets that can be created in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     *
     * @return the maxNumberOfRecordSets value
     */
    public Long maxNumberOfRecordSets() {
        return this.maxNumberOfRecordSets;
    }

    /**
     * Set the maximum number of record sets that can be created in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     *
     * @param maxNumberOfRecordSets the maxNumberOfRecordSets value to set
     * @return the ZoneInner object itself.
     */
    public ZoneInner withMaxNumberOfRecordSets(Long maxNumberOfRecordSets) {
        this.maxNumberOfRecordSets = maxNumberOfRecordSets;
        return this;
    }

    /**
     * Get the maximum number of records per record set that can be created in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     *
     * @return the maxNumberOfRecordsPerRecordSet value
     */
    public Long maxNumberOfRecordsPerRecordSet() {
        return this.maxNumberOfRecordsPerRecordSet;
    }

    /**
     * Get the current number of record sets in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     *
     * @return the numberOfRecordSets value
     */
    public Long numberOfRecordSets() {
        return this.numberOfRecordSets;
    }

    /**
     * Set the current number of record sets in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     *
     * @param numberOfRecordSets the numberOfRecordSets value to set
     * @return the ZoneInner object itself.
     */
    public ZoneInner withNumberOfRecordSets(Long numberOfRecordSets) {
        this.numberOfRecordSets = numberOfRecordSets;
        return this;
    }

    /**
     * Get the name servers for this DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     *
     * @return the nameServers value
     */
    public List<String> nameServers() {
        return this.nameServers;
    }

}
