/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.billing.v2019_10_01_preview.EligibleProductType;
import com.microsoft.azure.management.billing.v2019_10_01_preview.TransferStatus;
import com.microsoft.azure.management.billing.v2019_10_01_preview.DetailedTransferStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Details of the transfer.
 */
@JsonFlatten
public class RecipientTransferDetailsInner extends ProxyResource {
    /**
     * The time at which the transfer request was created.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * The time at which the transfer request expires.
     */
    @JsonProperty(value = "properties.expirationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime expirationTime;

    /**
     * Type of subscriptions that can be transferred.
     */
    @JsonProperty(value = "properties.allowedProductType", access = JsonProperty.Access.WRITE_ONLY)
    private List<EligibleProductType> allowedProductType;

    /**
     * Overall transfer status. Possible values include: 'Pending',
     * 'InProgress', 'Completed', 'CompletedWithErrors', 'Failed', 'Canceled',
     * 'Declined'.
     */
    @JsonProperty(value = "properties.transferStatus", access = JsonProperty.Access.WRITE_ONLY)
    private TransferStatus transferStatus;

    /**
     * The email ID of the user to whom the transfer request was sent.
     */
    @JsonProperty(value = "properties.recipientEmailId", access = JsonProperty.Access.WRITE_ONLY)
    private String recipientEmailId;

    /**
     * The email ID of the user who sent the transfer request.
     */
    @JsonProperty(value = "properties.initiatorEmailId", access = JsonProperty.Access.WRITE_ONLY)
    private String initiatorEmailId;

    /**
     * Optional MPN ID of the reseller for transfer requests that are sent from
     * a Microsoft Partner Agreement billing account.
     */
    @JsonProperty(value = "properties.resellerId", access = JsonProperty.Access.WRITE_ONLY)
    private String resellerId;

    /**
     * Optional name of the reseller for transfer requests that are sent from
     * Microsoft Partner Agreement billing account.
     */
    @JsonProperty(value = "properties.resellerName", access = JsonProperty.Access.WRITE_ONLY)
    private String resellerName;

    /**
     * The type of customer who sent the transfer request.
     */
    @JsonProperty(value = "properties.initiatorCustomerType", access = JsonProperty.Access.WRITE_ONLY)
    private String initiatorCustomerType;

    /**
     * The email ID of the user who canceled the transfer request.
     */
    @JsonProperty(value = "properties.canceledBy", access = JsonProperty.Access.WRITE_ONLY)
    private String canceledBy;

    /**
     * The time at which the transfer request was last modified.
     */
    @JsonProperty(value = "properties.lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModifiedTime;

    /**
     * Detailed transfer status.
     */
    @JsonProperty(value = "properties.detailedTransferStatus", access = JsonProperty.Access.WRITE_ONLY)
    private List<DetailedTransferStatus> detailedTransferStatus;

    /**
     * Get the time at which the transfer request was created.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the time at which the transfer request expires.
     *
     * @return the expirationTime value
     */
    public DateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Get type of subscriptions that can be transferred.
     *
     * @return the allowedProductType value
     */
    public List<EligibleProductType> allowedProductType() {
        return this.allowedProductType;
    }

    /**
     * Get overall transfer status. Possible values include: 'Pending', 'InProgress', 'Completed', 'CompletedWithErrors', 'Failed', 'Canceled', 'Declined'.
     *
     * @return the transferStatus value
     */
    public TransferStatus transferStatus() {
        return this.transferStatus;
    }

    /**
     * Get the email ID of the user to whom the transfer request was sent.
     *
     * @return the recipientEmailId value
     */
    public String recipientEmailId() {
        return this.recipientEmailId;
    }

    /**
     * Get the email ID of the user who sent the transfer request.
     *
     * @return the initiatorEmailId value
     */
    public String initiatorEmailId() {
        return this.initiatorEmailId;
    }

    /**
     * Get optional MPN ID of the reseller for transfer requests that are sent from a Microsoft Partner Agreement billing account.
     *
     * @return the resellerId value
     */
    public String resellerId() {
        return this.resellerId;
    }

    /**
     * Get optional name of the reseller for transfer requests that are sent from Microsoft Partner Agreement billing account.
     *
     * @return the resellerName value
     */
    public String resellerName() {
        return this.resellerName;
    }

    /**
     * Get the type of customer who sent the transfer request.
     *
     * @return the initiatorCustomerType value
     */
    public String initiatorCustomerType() {
        return this.initiatorCustomerType;
    }

    /**
     * Get the email ID of the user who canceled the transfer request.
     *
     * @return the canceledBy value
     */
    public String canceledBy() {
        return this.canceledBy;
    }

    /**
     * Get the time at which the transfer request was last modified.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get detailed transfer status.
     *
     * @return the detailedTransferStatus value
     */
    public List<DetailedTransferStatus> detailedTransferStatus() {
        return this.detailedTransferStatus;
    }

}
