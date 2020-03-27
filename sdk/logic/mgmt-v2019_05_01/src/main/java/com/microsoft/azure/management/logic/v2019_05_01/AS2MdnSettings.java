/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AS2 agreement mdn settings.
 */
public class AS2MdnSettings {
    /**
     * The value indicating whether to send or request a MDN.
     */
    @JsonProperty(value = "needMDN", required = true)
    private boolean needMDN;

    /**
     * The value indicating whether the MDN needs to be signed or not.
     */
    @JsonProperty(value = "signMDN", required = true)
    private boolean signMDN;

    /**
     * The value indicating whether to send the asynchronous MDN.
     */
    @JsonProperty(value = "sendMDNAsynchronously", required = true)
    private boolean sendMDNAsynchronously;

    /**
     * The receipt delivery URL.
     */
    @JsonProperty(value = "receiptDeliveryUrl")
    private String receiptDeliveryUrl;

    /**
     * The disposition notification to header value.
     */
    @JsonProperty(value = "dispositionNotificationTo")
    private String dispositionNotificationTo;

    /**
     * The value indicating whether to sign the outbound MDN if optional.
     */
    @JsonProperty(value = "signOutboundMDNIfOptional", required = true)
    private boolean signOutboundMDNIfOptional;

    /**
     * The MDN text.
     */
    @JsonProperty(value = "mdnText")
    private String mdnText;

    /**
     * The value indicating whether to send inbound MDN to message box.
     */
    @JsonProperty(value = "sendInboundMDNToMessageBox", required = true)
    private boolean sendInboundMDNToMessageBox;

    /**
     * The signing or hashing algorithm. Possible values include:
     * 'NotSpecified', 'None', 'MD5', 'SHA1', 'SHA2256', 'SHA2384', 'SHA2512'.
     */
    @JsonProperty(value = "micHashingAlgorithm", required = true)
    private HashingAlgorithm micHashingAlgorithm;

    /**
     * Get the value indicating whether to send or request a MDN.
     *
     * @return the needMDN value
     */
    public boolean needMDN() {
        return this.needMDN;
    }

    /**
     * Set the value indicating whether to send or request a MDN.
     *
     * @param needMDN the needMDN value to set
     * @return the AS2MdnSettings object itself.
     */
    public AS2MdnSettings withNeedMDN(boolean needMDN) {
        this.needMDN = needMDN;
        return this;
    }

    /**
     * Get the value indicating whether the MDN needs to be signed or not.
     *
     * @return the signMDN value
     */
    public boolean signMDN() {
        return this.signMDN;
    }

    /**
     * Set the value indicating whether the MDN needs to be signed or not.
     *
     * @param signMDN the signMDN value to set
     * @return the AS2MdnSettings object itself.
     */
    public AS2MdnSettings withSignMDN(boolean signMDN) {
        this.signMDN = signMDN;
        return this;
    }

    /**
     * Get the value indicating whether to send the asynchronous MDN.
     *
     * @return the sendMDNAsynchronously value
     */
    public boolean sendMDNAsynchronously() {
        return this.sendMDNAsynchronously;
    }

    /**
     * Set the value indicating whether to send the asynchronous MDN.
     *
     * @param sendMDNAsynchronously the sendMDNAsynchronously value to set
     * @return the AS2MdnSettings object itself.
     */
    public AS2MdnSettings withSendMDNAsynchronously(boolean sendMDNAsynchronously) {
        this.sendMDNAsynchronously = sendMDNAsynchronously;
        return this;
    }

    /**
     * Get the receipt delivery URL.
     *
     * @return the receiptDeliveryUrl value
     */
    public String receiptDeliveryUrl() {
        return this.receiptDeliveryUrl;
    }

    /**
     * Set the receipt delivery URL.
     *
     * @param receiptDeliveryUrl the receiptDeliveryUrl value to set
     * @return the AS2MdnSettings object itself.
     */
    public AS2MdnSettings withReceiptDeliveryUrl(String receiptDeliveryUrl) {
        this.receiptDeliveryUrl = receiptDeliveryUrl;
        return this;
    }

    /**
     * Get the disposition notification to header value.
     *
     * @return the dispositionNotificationTo value
     */
    public String dispositionNotificationTo() {
        return this.dispositionNotificationTo;
    }

    /**
     * Set the disposition notification to header value.
     *
     * @param dispositionNotificationTo the dispositionNotificationTo value to set
     * @return the AS2MdnSettings object itself.
     */
    public AS2MdnSettings withDispositionNotificationTo(String dispositionNotificationTo) {
        this.dispositionNotificationTo = dispositionNotificationTo;
        return this;
    }

    /**
     * Get the value indicating whether to sign the outbound MDN if optional.
     *
     * @return the signOutboundMDNIfOptional value
     */
    public boolean signOutboundMDNIfOptional() {
        return this.signOutboundMDNIfOptional;
    }

    /**
     * Set the value indicating whether to sign the outbound MDN if optional.
     *
     * @param signOutboundMDNIfOptional the signOutboundMDNIfOptional value to set
     * @return the AS2MdnSettings object itself.
     */
    public AS2MdnSettings withSignOutboundMDNIfOptional(boolean signOutboundMDNIfOptional) {
        this.signOutboundMDNIfOptional = signOutboundMDNIfOptional;
        return this;
    }

    /**
     * Get the MDN text.
     *
     * @return the mdnText value
     */
    public String mdnText() {
        return this.mdnText;
    }

    /**
     * Set the MDN text.
     *
     * @param mdnText the mdnText value to set
     * @return the AS2MdnSettings object itself.
     */
    public AS2MdnSettings withMdnText(String mdnText) {
        this.mdnText = mdnText;
        return this;
    }

    /**
     * Get the value indicating whether to send inbound MDN to message box.
     *
     * @return the sendInboundMDNToMessageBox value
     */
    public boolean sendInboundMDNToMessageBox() {
        return this.sendInboundMDNToMessageBox;
    }

    /**
     * Set the value indicating whether to send inbound MDN to message box.
     *
     * @param sendInboundMDNToMessageBox the sendInboundMDNToMessageBox value to set
     * @return the AS2MdnSettings object itself.
     */
    public AS2MdnSettings withSendInboundMDNToMessageBox(boolean sendInboundMDNToMessageBox) {
        this.sendInboundMDNToMessageBox = sendInboundMDNToMessageBox;
        return this;
    }

    /**
     * Get the signing or hashing algorithm. Possible values include: 'NotSpecified', 'None', 'MD5', 'SHA1', 'SHA2256', 'SHA2384', 'SHA2512'.
     *
     * @return the micHashingAlgorithm value
     */
    public HashingAlgorithm micHashingAlgorithm() {
        return this.micHashingAlgorithm;
    }

    /**
     * Set the signing or hashing algorithm. Possible values include: 'NotSpecified', 'None', 'MD5', 'SHA1', 'SHA2256', 'SHA2384', 'SHA2512'.
     *
     * @param micHashingAlgorithm the micHashingAlgorithm value to set
     * @return the AS2MdnSettings object itself.
     */
    public AS2MdnSettings withMicHashingAlgorithm(HashingAlgorithm micHashingAlgorithm) {
        this.micHashingAlgorithm = micHashingAlgorithm;
        return this;
    }

}
