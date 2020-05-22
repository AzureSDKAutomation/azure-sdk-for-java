/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The key value pair for properties.
 */
public class IPAddressAggregateInner {
    /**
     * Unique ID for the entree.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The tenant ID.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * The service ID.
     */
    @JsonProperty(value = "serviceId")
    private String serviceId;

    /**
     * The IP address from where the attempted login originated from.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /**
     * When the event occurred.
     */
    @JsonProperty(value = "timestamp")
    private String timestamp;

    /**
     * The first audit timestamp.
     */
    @JsonProperty(value = "firstAuditTimestamp")
    private String firstAuditTimestamp;

    /**
     * The last audit timestamp.
     */
    @JsonProperty(value = "lastAuditTimestamp")
    private String lastAuditTimestamp;

    /**
     * The extranet lockout error count.
     */
    @JsonProperty(value = "extranetLockoutErrorCount")
    private Integer extranetLockoutErrorCount;

    /**
     * The bad password error count.
     */
    @JsonProperty(value = "badPasswordErrorCount")
    private Integer badPasswordErrorCount;

    /**
     * The unique usernames attempted.
     */
    @JsonProperty(value = "uniqueUsernamesAttemptedCount")
    private Integer uniqueUsernamesAttemptedCount;

    /**
     * A value indicating whether the attempt count threshold been exceeded.
     */
    @JsonProperty(value = "attemptCountThresholdIsExceeded")
    private Boolean attemptCountThresholdIsExceeded;

    /**
     * The duration of the event.
     */
    @JsonProperty(value = "timeSpan")
    private String timeSpan;

    /**
     * A value indicating whether the IP address has been whitelisted.
     */
    @JsonProperty(value = "isWhitelistedIpAddress")
    private Boolean isWhitelistedIpAddress;

    /**
     * The network location.
     */
    @JsonProperty(value = "networkLocation")
    private String networkLocation;

    /**
     * The attempted count threshold on trigger.
     */
    @JsonProperty(value = "attemptCountThresholdOnTrigger")
    private Integer attemptCountThresholdOnTrigger;

    /**
     * The attempted threshold type on trigger.
     */
    @JsonProperty(value = "attemptThresholdTypeOnTrigger")
    private String attemptThresholdTypeOnTrigger;

    /**
     * The geographic location.
     */
    @JsonProperty(value = "geographicLocation")
    private String geographicLocation;

    /**
     * Get unique ID for the entree.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set unique ID for the entree.
     *
     * @param id the id value to set
     * @return the IPAddressAggregateInner object itself.
     */
    public IPAddressAggregateInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the tenant ID.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenant ID.
     *
     * @param tenantId the tenantId value to set
     * @return the IPAddressAggregateInner object itself.
     */
    public IPAddressAggregateInner withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the service ID.
     *
     * @return the serviceId value
     */
    public String serviceId() {
        return this.serviceId;
    }

    /**
     * Set the service ID.
     *
     * @param serviceId the serviceId value to set
     * @return the IPAddressAggregateInner object itself.
     */
    public IPAddressAggregateInner withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Get the IP address from where the attempted login originated from.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the IP address from where the attempted login originated from.
     *
     * @param ipAddress the ipAddress value to set
     * @return the IPAddressAggregateInner object itself.
     */
    public IPAddressAggregateInner withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get when the event occurred.
     *
     * @return the timestamp value
     */
    public String timestamp() {
        return this.timestamp;
    }

    /**
     * Set when the event occurred.
     *
     * @param timestamp the timestamp value to set
     * @return the IPAddressAggregateInner object itself.
     */
    public IPAddressAggregateInner withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the first audit timestamp.
     *
     * @return the firstAuditTimestamp value
     */
    public String firstAuditTimestamp() {
        return this.firstAuditTimestamp;
    }

    /**
     * Set the first audit timestamp.
     *
     * @param firstAuditTimestamp the firstAuditTimestamp value to set
     * @return the IPAddressAggregateInner object itself.
     */
    public IPAddressAggregateInner withFirstAuditTimestamp(String firstAuditTimestamp) {
        this.firstAuditTimestamp = firstAuditTimestamp;
        return this;
    }

    /**
     * Get the last audit timestamp.
     *
     * @return the lastAuditTimestamp value
     */
    public String lastAuditTimestamp() {
        return this.lastAuditTimestamp;
    }

    /**
     * Set the last audit timestamp.
     *
     * @param lastAuditTimestamp the lastAuditTimestamp value to set
     * @return the IPAddressAggregateInner object itself.
     */
    public IPAddressAggregateInner withLastAuditTimestamp(String lastAuditTimestamp) {
        this.lastAuditTimestamp = lastAuditTimestamp;
        return this;
    }

    /**
     * Get the extranet lockout error count.
     *
     * @return the extranetLockoutErrorCount value
     */
    public Integer extranetLockoutErrorCount() {
        return this.extranetLockoutErrorCount;
    }

    /**
     * Set the extranet lockout error count.
     *
     * @param extranetLockoutErrorCount the extranetLockoutErrorCount value to set
     * @return the IPAddressAggregateInner object itself.
     */
    public IPAddressAggregateInner withExtranetLockoutErrorCount(Integer extranetLockoutErrorCount) {
        this.extranetLockoutErrorCount = extranetLockoutErrorCount;
        return this;
    }

    /**
     * Get the bad password error count.
     *
     * @return the badPasswordErrorCount value
     */
    public Integer badPasswordErrorCount() {
        return this.badPasswordErrorCount;
    }

    /**
     * Set the bad password error count.
     *
     * @param badPasswordErrorCount the badPasswordErrorCount value to set
     * @return the IPAddressAggregateInner object itself.
     */
    public IPAddressAggregateInner withBadPasswordErrorCount(Integer badPasswordErrorCount) {
        this.badPasswordErrorCount = badPasswordErrorCount;
        return this;
    }

    /**
     * Get the unique usernames attempted.
     *
     * @return the uniqueUsernamesAttemptedCount value
     */
    public Integer uniqueUsernamesAttemptedCount() {
        return this.uniqueUsernamesAttemptedCount;
    }

    /**
     * Set the unique usernames attempted.
     *
     * @param uniqueUsernamesAttemptedCount the uniqueUsernamesAttemptedCount value to set
     * @return the IPAddressAggregateInner object itself.
     */
    public IPAddressAggregateInner withUniqueUsernamesAttemptedCount(Integer uniqueUsernamesAttemptedCount) {
        this.uniqueUsernamesAttemptedCount = uniqueUsernamesAttemptedCount;
        return this;
    }

    /**
     * Get a value indicating whether the attempt count threshold been exceeded.
     *
     * @return the attemptCountThresholdIsExceeded value
     */
    public Boolean attemptCountThresholdIsExceeded() {
        return this.attemptCountThresholdIsExceeded;
    }

    /**
     * Set a value indicating whether the attempt count threshold been exceeded.
     *
     * @param attemptCountThresholdIsExceeded the attemptCountThresholdIsExceeded value to set
     * @return the IPAddressAggregateInner object itself.
     */
    public IPAddressAggregateInner withAttemptCountThresholdIsExceeded(Boolean attemptCountThresholdIsExceeded) {
        this.attemptCountThresholdIsExceeded = attemptCountThresholdIsExceeded;
        return this;
    }

    /**
     * Get the duration of the event.
     *
     * @return the timeSpan value
     */
    public String timeSpan() {
        return this.timeSpan;
    }

    /**
     * Set the duration of the event.
     *
     * @param timeSpan the timeSpan value to set
     * @return the IPAddressAggregateInner object itself.
     */
    public IPAddressAggregateInner withTimeSpan(String timeSpan) {
        this.timeSpan = timeSpan;
        return this;
    }

    /**
     * Get a value indicating whether the IP address has been whitelisted.
     *
     * @return the isWhitelistedIpAddress value
     */
    public Boolean isWhitelistedIpAddress() {
        return this.isWhitelistedIpAddress;
    }

    /**
     * Set a value indicating whether the IP address has been whitelisted.
     *
     * @param isWhitelistedIpAddress the isWhitelistedIpAddress value to set
     * @return the IPAddressAggregateInner object itself.
     */
    public IPAddressAggregateInner withIsWhitelistedIpAddress(Boolean isWhitelistedIpAddress) {
        this.isWhitelistedIpAddress = isWhitelistedIpAddress;
        return this;
    }

    /**
     * Get the network location.
     *
     * @return the networkLocation value
     */
    public String networkLocation() {
        return this.networkLocation;
    }

    /**
     * Set the network location.
     *
     * @param networkLocation the networkLocation value to set
     * @return the IPAddressAggregateInner object itself.
     */
    public IPAddressAggregateInner withNetworkLocation(String networkLocation) {
        this.networkLocation = networkLocation;
        return this;
    }

    /**
     * Get the attempted count threshold on trigger.
     *
     * @return the attemptCountThresholdOnTrigger value
     */
    public Integer attemptCountThresholdOnTrigger() {
        return this.attemptCountThresholdOnTrigger;
    }

    /**
     * Set the attempted count threshold on trigger.
     *
     * @param attemptCountThresholdOnTrigger the attemptCountThresholdOnTrigger value to set
     * @return the IPAddressAggregateInner object itself.
     */
    public IPAddressAggregateInner withAttemptCountThresholdOnTrigger(Integer attemptCountThresholdOnTrigger) {
        this.attemptCountThresholdOnTrigger = attemptCountThresholdOnTrigger;
        return this;
    }

    /**
     * Get the attempted threshold type on trigger.
     *
     * @return the attemptThresholdTypeOnTrigger value
     */
    public String attemptThresholdTypeOnTrigger() {
        return this.attemptThresholdTypeOnTrigger;
    }

    /**
     * Set the attempted threshold type on trigger.
     *
     * @param attemptThresholdTypeOnTrigger the attemptThresholdTypeOnTrigger value to set
     * @return the IPAddressAggregateInner object itself.
     */
    public IPAddressAggregateInner withAttemptThresholdTypeOnTrigger(String attemptThresholdTypeOnTrigger) {
        this.attemptThresholdTypeOnTrigger = attemptThresholdTypeOnTrigger;
        return this;
    }

    /**
     * Get the geographic location.
     *
     * @return the geographicLocation value
     */
    public String geographicLocation() {
        return this.geographicLocation;
    }

    /**
     * Set the geographic location.
     *
     * @param geographicLocation the geographicLocation value to set
     * @return the IPAddressAggregateInner object itself.
     */
    public IPAddressAggregateInner withGeographicLocation(String geographicLocation) {
        this.geographicLocation = geographicLocation;
        return this;
    }

}
