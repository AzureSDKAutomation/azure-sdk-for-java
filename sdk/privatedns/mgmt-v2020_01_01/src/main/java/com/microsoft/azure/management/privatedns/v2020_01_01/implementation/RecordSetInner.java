/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.privatedns.v2020_01_01.implementation;

import java.util.Map;
import java.util.List;
import com.microsoft.azure.management.privatedns.v2020_01_01.ARecord;
import com.microsoft.azure.management.privatedns.v2020_01_01.AaaaRecord;
import com.microsoft.azure.management.privatedns.v2020_01_01.CnameRecord;
import com.microsoft.azure.management.privatedns.v2020_01_01.MxRecord;
import com.microsoft.azure.management.privatedns.v2020_01_01.PtrRecord;
import com.microsoft.azure.management.privatedns.v2020_01_01.SoaRecord;
import com.microsoft.azure.management.privatedns.v2020_01_01.SrvRecord;
import com.microsoft.azure.management.privatedns.v2020_01_01.TxtRecord;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Describes a DNS record set (a collection of DNS records with the same name
 * and type) in a Private DNS zone.
 */
@JsonFlatten
public class RecordSetInner extends ProxyResource {
    /**
     * The ETag of the record set.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * The metadata attached to the record set.
     */
    @JsonProperty(value = "properties.metadata")
    private Map<String, String> metadata;

    /**
     * The TTL (time-to-live) of the records in the record set.
     */
    @JsonProperty(value = "properties.ttl")
    private Long ttl;

    /**
     * Fully qualified domain name of the record set.
     */
    @JsonProperty(value = "properties.fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /**
     * Is the record set auto-registered in the Private DNS zone through a
     * virtual network link?.
     */
    @JsonProperty(value = "properties.isAutoRegistered", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isAutoRegistered;

    /**
     * The list of A records in the record set.
     */
    @JsonProperty(value = "properties.aRecords")
    private List<ARecord> aRecords;

    /**
     * The list of AAAA records in the record set.
     */
    @JsonProperty(value = "properties.aaaaRecords")
    private List<AaaaRecord> aaaaRecords;

    /**
     * The CNAME record in the record set.
     */
    @JsonProperty(value = "properties.cnameRecord")
    private CnameRecord cnameRecord;

    /**
     * The list of MX records in the record set.
     */
    @JsonProperty(value = "properties.mxRecords")
    private List<MxRecord> mxRecords;

    /**
     * The list of PTR records in the record set.
     */
    @JsonProperty(value = "properties.ptrRecords")
    private List<PtrRecord> ptrRecords;

    /**
     * The SOA record in the record set.
     */
    @JsonProperty(value = "properties.soaRecord")
    private SoaRecord soaRecord;

    /**
     * The list of SRV records in the record set.
     */
    @JsonProperty(value = "properties.srvRecords")
    private List<SrvRecord> srvRecords;

    /**
     * The list of TXT records in the record set.
     */
    @JsonProperty(value = "properties.txtRecords")
    private List<TxtRecord> txtRecords;

    /**
     * Get the ETag of the record set.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the ETag of the record set.
     *
     * @param etag the etag value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the metadata attached to the record set.
     *
     * @return the metadata value
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata attached to the record set.
     *
     * @param metadata the metadata value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the TTL (time-to-live) of the records in the record set.
     *
     * @return the ttl value
     */
    public Long ttl() {
        return this.ttl;
    }

    /**
     * Set the TTL (time-to-live) of the records in the record set.
     *
     * @param ttl the ttl value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * Get fully qualified domain name of the record set.
     *
     * @return the fqdn value
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Get is the record set auto-registered in the Private DNS zone through a virtual network link?.
     *
     * @return the isAutoRegistered value
     */
    public Boolean isAutoRegistered() {
        return this.isAutoRegistered;
    }

    /**
     * Get the list of A records in the record set.
     *
     * @return the aRecords value
     */
    public List<ARecord> aRecords() {
        return this.aRecords;
    }

    /**
     * Set the list of A records in the record set.
     *
     * @param aRecords the aRecords value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withARecords(List<ARecord> aRecords) {
        this.aRecords = aRecords;
        return this;
    }

    /**
     * Get the list of AAAA records in the record set.
     *
     * @return the aaaaRecords value
     */
    public List<AaaaRecord> aaaaRecords() {
        return this.aaaaRecords;
    }

    /**
     * Set the list of AAAA records in the record set.
     *
     * @param aaaaRecords the aaaaRecords value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withAaaaRecords(List<AaaaRecord> aaaaRecords) {
        this.aaaaRecords = aaaaRecords;
        return this;
    }

    /**
     * Get the CNAME record in the record set.
     *
     * @return the cnameRecord value
     */
    public CnameRecord cnameRecord() {
        return this.cnameRecord;
    }

    /**
     * Set the CNAME record in the record set.
     *
     * @param cnameRecord the cnameRecord value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withCnameRecord(CnameRecord cnameRecord) {
        this.cnameRecord = cnameRecord;
        return this;
    }

    /**
     * Get the list of MX records in the record set.
     *
     * @return the mxRecords value
     */
    public List<MxRecord> mxRecords() {
        return this.mxRecords;
    }

    /**
     * Set the list of MX records in the record set.
     *
     * @param mxRecords the mxRecords value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withMxRecords(List<MxRecord> mxRecords) {
        this.mxRecords = mxRecords;
        return this;
    }

    /**
     * Get the list of PTR records in the record set.
     *
     * @return the ptrRecords value
     */
    public List<PtrRecord> ptrRecords() {
        return this.ptrRecords;
    }

    /**
     * Set the list of PTR records in the record set.
     *
     * @param ptrRecords the ptrRecords value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withPtrRecords(List<PtrRecord> ptrRecords) {
        this.ptrRecords = ptrRecords;
        return this;
    }

    /**
     * Get the SOA record in the record set.
     *
     * @return the soaRecord value
     */
    public SoaRecord soaRecord() {
        return this.soaRecord;
    }

    /**
     * Set the SOA record in the record set.
     *
     * @param soaRecord the soaRecord value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withSoaRecord(SoaRecord soaRecord) {
        this.soaRecord = soaRecord;
        return this;
    }

    /**
     * Get the list of SRV records in the record set.
     *
     * @return the srvRecords value
     */
    public List<SrvRecord> srvRecords() {
        return this.srvRecords;
    }

    /**
     * Set the list of SRV records in the record set.
     *
     * @param srvRecords the srvRecords value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withSrvRecords(List<SrvRecord> srvRecords) {
        this.srvRecords = srvRecords;
        return this;
    }

    /**
     * Get the list of TXT records in the record set.
     *
     * @return the txtRecords value
     */
    public List<TxtRecord> txtRecords() {
        return this.txtRecords;
    }

    /**
     * Set the list of TXT records in the record set.
     *
     * @param txtRecords the txtRecords value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withTxtRecords(List<TxtRecord> txtRecords) {
        this.txtRecords = txtRecords;
        return this;
    }

}
