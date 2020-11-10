/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This class represents the details for a test failover job.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType", defaultImpl = TestFailoverJobDetails.class)
@JsonTypeName("TestFailoverJobDetails")
public class TestFailoverJobDetails extends JobDetails {
    /**
     * The test failover status.
     */
    @JsonProperty(value = "testFailoverStatus")
    private String testFailoverStatus;

    /**
     * The test failover comments.
     */
    @JsonProperty(value = "comments")
    private String comments;

    /**
     * The test network name.
     */
    @JsonProperty(value = "networkName")
    private String networkName;

    /**
     * The test network friendly name.
     */
    @JsonProperty(value = "networkFriendlyName")
    private String networkFriendlyName;

    /**
     * The test network type (see TestFailoverInput enum for possible values).
     */
    @JsonProperty(value = "networkType")
    private String networkType;

    /**
     * The test VM details.
     */
    @JsonProperty(value = "protectedItemDetails")
    private List<FailoverReplicationProtectedItemDetails> protectedItemDetails;

    /**
     * Get the test failover status.
     *
     * @return the testFailoverStatus value
     */
    public String testFailoverStatus() {
        return this.testFailoverStatus;
    }

    /**
     * Set the test failover status.
     *
     * @param testFailoverStatus the testFailoverStatus value to set
     * @return the TestFailoverJobDetails object itself.
     */
    public TestFailoverJobDetails withTestFailoverStatus(String testFailoverStatus) {
        this.testFailoverStatus = testFailoverStatus;
        return this;
    }

    /**
     * Get the test failover comments.
     *
     * @return the comments value
     */
    public String comments() {
        return this.comments;
    }

    /**
     * Set the test failover comments.
     *
     * @param comments the comments value to set
     * @return the TestFailoverJobDetails object itself.
     */
    public TestFailoverJobDetails withComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Get the test network name.
     *
     * @return the networkName value
     */
    public String networkName() {
        return this.networkName;
    }

    /**
     * Set the test network name.
     *
     * @param networkName the networkName value to set
     * @return the TestFailoverJobDetails object itself.
     */
    public TestFailoverJobDetails withNetworkName(String networkName) {
        this.networkName = networkName;
        return this;
    }

    /**
     * Get the test network friendly name.
     *
     * @return the networkFriendlyName value
     */
    public String networkFriendlyName() {
        return this.networkFriendlyName;
    }

    /**
     * Set the test network friendly name.
     *
     * @param networkFriendlyName the networkFriendlyName value to set
     * @return the TestFailoverJobDetails object itself.
     */
    public TestFailoverJobDetails withNetworkFriendlyName(String networkFriendlyName) {
        this.networkFriendlyName = networkFriendlyName;
        return this;
    }

    /**
     * Get the test network type (see TestFailoverInput enum for possible values).
     *
     * @return the networkType value
     */
    public String networkType() {
        return this.networkType;
    }

    /**
     * Set the test network type (see TestFailoverInput enum for possible values).
     *
     * @param networkType the networkType value to set
     * @return the TestFailoverJobDetails object itself.
     */
    public TestFailoverJobDetails withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * Get the test VM details.
     *
     * @return the protectedItemDetails value
     */
    public List<FailoverReplicationProtectedItemDetails> protectedItemDetails() {
        return this.protectedItemDetails;
    }

    /**
     * Set the test VM details.
     *
     * @param protectedItemDetails the protectedItemDetails value to set
     * @return the TestFailoverJobDetails object itself.
     */
    public TestFailoverJobDetails withProtectedItemDetails(List<FailoverReplicationProtectedItemDetails> protectedItemDetails) {
        this.protectedItemDetails = protectedItemDetails;
        return this;
    }

}
