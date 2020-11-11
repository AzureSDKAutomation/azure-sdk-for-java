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
 * The Edifact agreement envelope settings.
 */
public class EdifactEnvelopeSettings {
    /**
     * The group association assigned code.
     */
    @JsonProperty(value = "groupAssociationAssignedCode")
    private String groupAssociationAssignedCode;

    /**
     * The communication agreement id.
     */
    @JsonProperty(value = "communicationAgreementId")
    private String communicationAgreementId;

    /**
     * The value indicating whether to apply delimiter string advice.
     */
    @JsonProperty(value = "applyDelimiterStringAdvice", required = true)
    private boolean applyDelimiterStringAdvice;

    /**
     * The value indicating whether to create grouping segments.
     */
    @JsonProperty(value = "createGroupingSegments", required = true)
    private boolean createGroupingSegments;

    /**
     * The value indicating whether to enable default group headers.
     */
    @JsonProperty(value = "enableDefaultGroupHeaders", required = true)
    private boolean enableDefaultGroupHeaders;

    /**
     * The recipient reference password value.
     */
    @JsonProperty(value = "recipientReferencePasswordValue")
    private String recipientReferencePasswordValue;

    /**
     * The recipient reference password qualifier.
     */
    @JsonProperty(value = "recipientReferencePasswordQualifier")
    private String recipientReferencePasswordQualifier;

    /**
     * The application reference id.
     */
    @JsonProperty(value = "applicationReferenceId")
    private String applicationReferenceId;

    /**
     * The processing priority code.
     */
    @JsonProperty(value = "processingPriorityCode")
    private String processingPriorityCode;

    /**
     * The interchange control number lower bound.
     */
    @JsonProperty(value = "interchangeControlNumberLowerBound", required = true)
    private long interchangeControlNumberLowerBound;

    /**
     * The interchange control number upper bound.
     */
    @JsonProperty(value = "interchangeControlNumberUpperBound", required = true)
    private long interchangeControlNumberUpperBound;

    /**
     * The value indicating whether to rollover interchange control number.
     */
    @JsonProperty(value = "rolloverInterchangeControlNumber", required = true)
    private boolean rolloverInterchangeControlNumber;

    /**
     * The interchange control number prefix.
     */
    @JsonProperty(value = "interchangeControlNumberPrefix")
    private String interchangeControlNumberPrefix;

    /**
     * The interchange control number suffix.
     */
    @JsonProperty(value = "interchangeControlNumberSuffix")
    private String interchangeControlNumberSuffix;

    /**
     * The sender reverse routing address.
     */
    @JsonProperty(value = "senderReverseRoutingAddress")
    private String senderReverseRoutingAddress;

    /**
     * The receiver reverse routing address.
     */
    @JsonProperty(value = "receiverReverseRoutingAddress")
    private String receiverReverseRoutingAddress;

    /**
     * The functional group id.
     */
    @JsonProperty(value = "functionalGroupId")
    private String functionalGroupId;

    /**
     * The group controlling agency code.
     */
    @JsonProperty(value = "groupControllingAgencyCode")
    private String groupControllingAgencyCode;

    /**
     * The group message version.
     */
    @JsonProperty(value = "groupMessageVersion")
    private String groupMessageVersion;

    /**
     * The group message release.
     */
    @JsonProperty(value = "groupMessageRelease")
    private String groupMessageRelease;

    /**
     * The group control number lower bound.
     */
    @JsonProperty(value = "groupControlNumberLowerBound", required = true)
    private long groupControlNumberLowerBound;

    /**
     * The group control number upper bound.
     */
    @JsonProperty(value = "groupControlNumberUpperBound", required = true)
    private long groupControlNumberUpperBound;

    /**
     * The value indicating whether to rollover group control number.
     */
    @JsonProperty(value = "rolloverGroupControlNumber", required = true)
    private boolean rolloverGroupControlNumber;

    /**
     * The group control number prefix.
     */
    @JsonProperty(value = "groupControlNumberPrefix")
    private String groupControlNumberPrefix;

    /**
     * The group control number suffix.
     */
    @JsonProperty(value = "groupControlNumberSuffix")
    private String groupControlNumberSuffix;

    /**
     * The group application receiver qualifier.
     */
    @JsonProperty(value = "groupApplicationReceiverQualifier")
    private String groupApplicationReceiverQualifier;

    /**
     * The group application receiver id.
     */
    @JsonProperty(value = "groupApplicationReceiverId")
    private String groupApplicationReceiverId;

    /**
     * The group application sender qualifier.
     */
    @JsonProperty(value = "groupApplicationSenderQualifier")
    private String groupApplicationSenderQualifier;

    /**
     * The group application sender id.
     */
    @JsonProperty(value = "groupApplicationSenderId")
    private String groupApplicationSenderId;

    /**
     * The group application password.
     */
    @JsonProperty(value = "groupApplicationPassword")
    private String groupApplicationPassword;

    /**
     * The value indicating whether to overwrite existing transaction set
     * control number.
     */
    @JsonProperty(value = "overwriteExistingTransactionSetControlNumber", required = true)
    private boolean overwriteExistingTransactionSetControlNumber;

    /**
     * The transaction set control number prefix.
     */
    @JsonProperty(value = "transactionSetControlNumberPrefix")
    private String transactionSetControlNumberPrefix;

    /**
     * The transaction set control number suffix.
     */
    @JsonProperty(value = "transactionSetControlNumberSuffix")
    private String transactionSetControlNumberSuffix;

    /**
     * The transaction set control number lower bound.
     */
    @JsonProperty(value = "transactionSetControlNumberLowerBound", required = true)
    private long transactionSetControlNumberLowerBound;

    /**
     * The transaction set control number upper bound.
     */
    @JsonProperty(value = "transactionSetControlNumberUpperBound", required = true)
    private long transactionSetControlNumberUpperBound;

    /**
     * The value indicating whether to rollover transaction set control number.
     */
    @JsonProperty(value = "rolloverTransactionSetControlNumber", required = true)
    private boolean rolloverTransactionSetControlNumber;

    /**
     * The value indicating whether the message is a test interchange.
     */
    @JsonProperty(value = "isTestInterchange", required = true)
    private boolean isTestInterchange;

    /**
     * The sender internal identification.
     */
    @JsonProperty(value = "senderInternalIdentification")
    private String senderInternalIdentification;

    /**
     * The sender internal sub identification.
     */
    @JsonProperty(value = "senderInternalSubIdentification")
    private String senderInternalSubIdentification;

    /**
     * The receiver internal identification.
     */
    @JsonProperty(value = "receiverInternalIdentification")
    private String receiverInternalIdentification;

    /**
     * The receiver internal sub identification.
     */
    @JsonProperty(value = "receiverInternalSubIdentification")
    private String receiverInternalSubIdentification;

    /**
     * Get the group association assigned code.
     *
     * @return the groupAssociationAssignedCode value
     */
    public String groupAssociationAssignedCode() {
        return this.groupAssociationAssignedCode;
    }

    /**
     * Set the group association assigned code.
     *
     * @param groupAssociationAssignedCode the groupAssociationAssignedCode value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withGroupAssociationAssignedCode(String groupAssociationAssignedCode) {
        this.groupAssociationAssignedCode = groupAssociationAssignedCode;
        return this;
    }

    /**
     * Get the communication agreement id.
     *
     * @return the communicationAgreementId value
     */
    public String communicationAgreementId() {
        return this.communicationAgreementId;
    }

    /**
     * Set the communication agreement id.
     *
     * @param communicationAgreementId the communicationAgreementId value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withCommunicationAgreementId(String communicationAgreementId) {
        this.communicationAgreementId = communicationAgreementId;
        return this;
    }

    /**
     * Get the value indicating whether to apply delimiter string advice.
     *
     * @return the applyDelimiterStringAdvice value
     */
    public boolean applyDelimiterStringAdvice() {
        return this.applyDelimiterStringAdvice;
    }

    /**
     * Set the value indicating whether to apply delimiter string advice.
     *
     * @param applyDelimiterStringAdvice the applyDelimiterStringAdvice value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withApplyDelimiterStringAdvice(boolean applyDelimiterStringAdvice) {
        this.applyDelimiterStringAdvice = applyDelimiterStringAdvice;
        return this;
    }

    /**
     * Get the value indicating whether to create grouping segments.
     *
     * @return the createGroupingSegments value
     */
    public boolean createGroupingSegments() {
        return this.createGroupingSegments;
    }

    /**
     * Set the value indicating whether to create grouping segments.
     *
     * @param createGroupingSegments the createGroupingSegments value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withCreateGroupingSegments(boolean createGroupingSegments) {
        this.createGroupingSegments = createGroupingSegments;
        return this;
    }

    /**
     * Get the value indicating whether to enable default group headers.
     *
     * @return the enableDefaultGroupHeaders value
     */
    public boolean enableDefaultGroupHeaders() {
        return this.enableDefaultGroupHeaders;
    }

    /**
     * Set the value indicating whether to enable default group headers.
     *
     * @param enableDefaultGroupHeaders the enableDefaultGroupHeaders value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withEnableDefaultGroupHeaders(boolean enableDefaultGroupHeaders) {
        this.enableDefaultGroupHeaders = enableDefaultGroupHeaders;
        return this;
    }

    /**
     * Get the recipient reference password value.
     *
     * @return the recipientReferencePasswordValue value
     */
    public String recipientReferencePasswordValue() {
        return this.recipientReferencePasswordValue;
    }

    /**
     * Set the recipient reference password value.
     *
     * @param recipientReferencePasswordValue the recipientReferencePasswordValue value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withRecipientReferencePasswordValue(String recipientReferencePasswordValue) {
        this.recipientReferencePasswordValue = recipientReferencePasswordValue;
        return this;
    }

    /**
     * Get the recipient reference password qualifier.
     *
     * @return the recipientReferencePasswordQualifier value
     */
    public String recipientReferencePasswordQualifier() {
        return this.recipientReferencePasswordQualifier;
    }

    /**
     * Set the recipient reference password qualifier.
     *
     * @param recipientReferencePasswordQualifier the recipientReferencePasswordQualifier value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withRecipientReferencePasswordQualifier(String recipientReferencePasswordQualifier) {
        this.recipientReferencePasswordQualifier = recipientReferencePasswordQualifier;
        return this;
    }

    /**
     * Get the application reference id.
     *
     * @return the applicationReferenceId value
     */
    public String applicationReferenceId() {
        return this.applicationReferenceId;
    }

    /**
     * Set the application reference id.
     *
     * @param applicationReferenceId the applicationReferenceId value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withApplicationReferenceId(String applicationReferenceId) {
        this.applicationReferenceId = applicationReferenceId;
        return this;
    }

    /**
     * Get the processing priority code.
     *
     * @return the processingPriorityCode value
     */
    public String processingPriorityCode() {
        return this.processingPriorityCode;
    }

    /**
     * Set the processing priority code.
     *
     * @param processingPriorityCode the processingPriorityCode value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withProcessingPriorityCode(String processingPriorityCode) {
        this.processingPriorityCode = processingPriorityCode;
        return this;
    }

    /**
     * Get the interchange control number lower bound.
     *
     * @return the interchangeControlNumberLowerBound value
     */
    public long interchangeControlNumberLowerBound() {
        return this.interchangeControlNumberLowerBound;
    }

    /**
     * Set the interchange control number lower bound.
     *
     * @param interchangeControlNumberLowerBound the interchangeControlNumberLowerBound value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withInterchangeControlNumberLowerBound(long interchangeControlNumberLowerBound) {
        this.interchangeControlNumberLowerBound = interchangeControlNumberLowerBound;
        return this;
    }

    /**
     * Get the interchange control number upper bound.
     *
     * @return the interchangeControlNumberUpperBound value
     */
    public long interchangeControlNumberUpperBound() {
        return this.interchangeControlNumberUpperBound;
    }

    /**
     * Set the interchange control number upper bound.
     *
     * @param interchangeControlNumberUpperBound the interchangeControlNumberUpperBound value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withInterchangeControlNumberUpperBound(long interchangeControlNumberUpperBound) {
        this.interchangeControlNumberUpperBound = interchangeControlNumberUpperBound;
        return this;
    }

    /**
     * Get the value indicating whether to rollover interchange control number.
     *
     * @return the rolloverInterchangeControlNumber value
     */
    public boolean rolloverInterchangeControlNumber() {
        return this.rolloverInterchangeControlNumber;
    }

    /**
     * Set the value indicating whether to rollover interchange control number.
     *
     * @param rolloverInterchangeControlNumber the rolloverInterchangeControlNumber value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withRolloverInterchangeControlNumber(boolean rolloverInterchangeControlNumber) {
        this.rolloverInterchangeControlNumber = rolloverInterchangeControlNumber;
        return this;
    }

    /**
     * Get the interchange control number prefix.
     *
     * @return the interchangeControlNumberPrefix value
     */
    public String interchangeControlNumberPrefix() {
        return this.interchangeControlNumberPrefix;
    }

    /**
     * Set the interchange control number prefix.
     *
     * @param interchangeControlNumberPrefix the interchangeControlNumberPrefix value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withInterchangeControlNumberPrefix(String interchangeControlNumberPrefix) {
        this.interchangeControlNumberPrefix = interchangeControlNumberPrefix;
        return this;
    }

    /**
     * Get the interchange control number suffix.
     *
     * @return the interchangeControlNumberSuffix value
     */
    public String interchangeControlNumberSuffix() {
        return this.interchangeControlNumberSuffix;
    }

    /**
     * Set the interchange control number suffix.
     *
     * @param interchangeControlNumberSuffix the interchangeControlNumberSuffix value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withInterchangeControlNumberSuffix(String interchangeControlNumberSuffix) {
        this.interchangeControlNumberSuffix = interchangeControlNumberSuffix;
        return this;
    }

    /**
     * Get the sender reverse routing address.
     *
     * @return the senderReverseRoutingAddress value
     */
    public String senderReverseRoutingAddress() {
        return this.senderReverseRoutingAddress;
    }

    /**
     * Set the sender reverse routing address.
     *
     * @param senderReverseRoutingAddress the senderReverseRoutingAddress value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withSenderReverseRoutingAddress(String senderReverseRoutingAddress) {
        this.senderReverseRoutingAddress = senderReverseRoutingAddress;
        return this;
    }

    /**
     * Get the receiver reverse routing address.
     *
     * @return the receiverReverseRoutingAddress value
     */
    public String receiverReverseRoutingAddress() {
        return this.receiverReverseRoutingAddress;
    }

    /**
     * Set the receiver reverse routing address.
     *
     * @param receiverReverseRoutingAddress the receiverReverseRoutingAddress value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withReceiverReverseRoutingAddress(String receiverReverseRoutingAddress) {
        this.receiverReverseRoutingAddress = receiverReverseRoutingAddress;
        return this;
    }

    /**
     * Get the functional group id.
     *
     * @return the functionalGroupId value
     */
    public String functionalGroupId() {
        return this.functionalGroupId;
    }

    /**
     * Set the functional group id.
     *
     * @param functionalGroupId the functionalGroupId value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withFunctionalGroupId(String functionalGroupId) {
        this.functionalGroupId = functionalGroupId;
        return this;
    }

    /**
     * Get the group controlling agency code.
     *
     * @return the groupControllingAgencyCode value
     */
    public String groupControllingAgencyCode() {
        return this.groupControllingAgencyCode;
    }

    /**
     * Set the group controlling agency code.
     *
     * @param groupControllingAgencyCode the groupControllingAgencyCode value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withGroupControllingAgencyCode(String groupControllingAgencyCode) {
        this.groupControllingAgencyCode = groupControllingAgencyCode;
        return this;
    }

    /**
     * Get the group message version.
     *
     * @return the groupMessageVersion value
     */
    public String groupMessageVersion() {
        return this.groupMessageVersion;
    }

    /**
     * Set the group message version.
     *
     * @param groupMessageVersion the groupMessageVersion value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withGroupMessageVersion(String groupMessageVersion) {
        this.groupMessageVersion = groupMessageVersion;
        return this;
    }

    /**
     * Get the group message release.
     *
     * @return the groupMessageRelease value
     */
    public String groupMessageRelease() {
        return this.groupMessageRelease;
    }

    /**
     * Set the group message release.
     *
     * @param groupMessageRelease the groupMessageRelease value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withGroupMessageRelease(String groupMessageRelease) {
        this.groupMessageRelease = groupMessageRelease;
        return this;
    }

    /**
     * Get the group control number lower bound.
     *
     * @return the groupControlNumberLowerBound value
     */
    public long groupControlNumberLowerBound() {
        return this.groupControlNumberLowerBound;
    }

    /**
     * Set the group control number lower bound.
     *
     * @param groupControlNumberLowerBound the groupControlNumberLowerBound value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withGroupControlNumberLowerBound(long groupControlNumberLowerBound) {
        this.groupControlNumberLowerBound = groupControlNumberLowerBound;
        return this;
    }

    /**
     * Get the group control number upper bound.
     *
     * @return the groupControlNumberUpperBound value
     */
    public long groupControlNumberUpperBound() {
        return this.groupControlNumberUpperBound;
    }

    /**
     * Set the group control number upper bound.
     *
     * @param groupControlNumberUpperBound the groupControlNumberUpperBound value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withGroupControlNumberUpperBound(long groupControlNumberUpperBound) {
        this.groupControlNumberUpperBound = groupControlNumberUpperBound;
        return this;
    }

    /**
     * Get the value indicating whether to rollover group control number.
     *
     * @return the rolloverGroupControlNumber value
     */
    public boolean rolloverGroupControlNumber() {
        return this.rolloverGroupControlNumber;
    }

    /**
     * Set the value indicating whether to rollover group control number.
     *
     * @param rolloverGroupControlNumber the rolloverGroupControlNumber value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withRolloverGroupControlNumber(boolean rolloverGroupControlNumber) {
        this.rolloverGroupControlNumber = rolloverGroupControlNumber;
        return this;
    }

    /**
     * Get the group control number prefix.
     *
     * @return the groupControlNumberPrefix value
     */
    public String groupControlNumberPrefix() {
        return this.groupControlNumberPrefix;
    }

    /**
     * Set the group control number prefix.
     *
     * @param groupControlNumberPrefix the groupControlNumberPrefix value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withGroupControlNumberPrefix(String groupControlNumberPrefix) {
        this.groupControlNumberPrefix = groupControlNumberPrefix;
        return this;
    }

    /**
     * Get the group control number suffix.
     *
     * @return the groupControlNumberSuffix value
     */
    public String groupControlNumberSuffix() {
        return this.groupControlNumberSuffix;
    }

    /**
     * Set the group control number suffix.
     *
     * @param groupControlNumberSuffix the groupControlNumberSuffix value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withGroupControlNumberSuffix(String groupControlNumberSuffix) {
        this.groupControlNumberSuffix = groupControlNumberSuffix;
        return this;
    }

    /**
     * Get the group application receiver qualifier.
     *
     * @return the groupApplicationReceiverQualifier value
     */
    public String groupApplicationReceiverQualifier() {
        return this.groupApplicationReceiverQualifier;
    }

    /**
     * Set the group application receiver qualifier.
     *
     * @param groupApplicationReceiverQualifier the groupApplicationReceiverQualifier value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withGroupApplicationReceiverQualifier(String groupApplicationReceiverQualifier) {
        this.groupApplicationReceiverQualifier = groupApplicationReceiverQualifier;
        return this;
    }

    /**
     * Get the group application receiver id.
     *
     * @return the groupApplicationReceiverId value
     */
    public String groupApplicationReceiverId() {
        return this.groupApplicationReceiverId;
    }

    /**
     * Set the group application receiver id.
     *
     * @param groupApplicationReceiverId the groupApplicationReceiverId value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withGroupApplicationReceiverId(String groupApplicationReceiverId) {
        this.groupApplicationReceiverId = groupApplicationReceiverId;
        return this;
    }

    /**
     * Get the group application sender qualifier.
     *
     * @return the groupApplicationSenderQualifier value
     */
    public String groupApplicationSenderQualifier() {
        return this.groupApplicationSenderQualifier;
    }

    /**
     * Set the group application sender qualifier.
     *
     * @param groupApplicationSenderQualifier the groupApplicationSenderQualifier value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withGroupApplicationSenderQualifier(String groupApplicationSenderQualifier) {
        this.groupApplicationSenderQualifier = groupApplicationSenderQualifier;
        return this;
    }

    /**
     * Get the group application sender id.
     *
     * @return the groupApplicationSenderId value
     */
    public String groupApplicationSenderId() {
        return this.groupApplicationSenderId;
    }

    /**
     * Set the group application sender id.
     *
     * @param groupApplicationSenderId the groupApplicationSenderId value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withGroupApplicationSenderId(String groupApplicationSenderId) {
        this.groupApplicationSenderId = groupApplicationSenderId;
        return this;
    }

    /**
     * Get the group application password.
     *
     * @return the groupApplicationPassword value
     */
    public String groupApplicationPassword() {
        return this.groupApplicationPassword;
    }

    /**
     * Set the group application password.
     *
     * @param groupApplicationPassword the groupApplicationPassword value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withGroupApplicationPassword(String groupApplicationPassword) {
        this.groupApplicationPassword = groupApplicationPassword;
        return this;
    }

    /**
     * Get the value indicating whether to overwrite existing transaction set control number.
     *
     * @return the overwriteExistingTransactionSetControlNumber value
     */
    public boolean overwriteExistingTransactionSetControlNumber() {
        return this.overwriteExistingTransactionSetControlNumber;
    }

    /**
     * Set the value indicating whether to overwrite existing transaction set control number.
     *
     * @param overwriteExistingTransactionSetControlNumber the overwriteExistingTransactionSetControlNumber value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withOverwriteExistingTransactionSetControlNumber(boolean overwriteExistingTransactionSetControlNumber) {
        this.overwriteExistingTransactionSetControlNumber = overwriteExistingTransactionSetControlNumber;
        return this;
    }

    /**
     * Get the transaction set control number prefix.
     *
     * @return the transactionSetControlNumberPrefix value
     */
    public String transactionSetControlNumberPrefix() {
        return this.transactionSetControlNumberPrefix;
    }

    /**
     * Set the transaction set control number prefix.
     *
     * @param transactionSetControlNumberPrefix the transactionSetControlNumberPrefix value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withTransactionSetControlNumberPrefix(String transactionSetControlNumberPrefix) {
        this.transactionSetControlNumberPrefix = transactionSetControlNumberPrefix;
        return this;
    }

    /**
     * Get the transaction set control number suffix.
     *
     * @return the transactionSetControlNumberSuffix value
     */
    public String transactionSetControlNumberSuffix() {
        return this.transactionSetControlNumberSuffix;
    }

    /**
     * Set the transaction set control number suffix.
     *
     * @param transactionSetControlNumberSuffix the transactionSetControlNumberSuffix value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withTransactionSetControlNumberSuffix(String transactionSetControlNumberSuffix) {
        this.transactionSetControlNumberSuffix = transactionSetControlNumberSuffix;
        return this;
    }

    /**
     * Get the transaction set control number lower bound.
     *
     * @return the transactionSetControlNumberLowerBound value
     */
    public long transactionSetControlNumberLowerBound() {
        return this.transactionSetControlNumberLowerBound;
    }

    /**
     * Set the transaction set control number lower bound.
     *
     * @param transactionSetControlNumberLowerBound the transactionSetControlNumberLowerBound value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withTransactionSetControlNumberLowerBound(long transactionSetControlNumberLowerBound) {
        this.transactionSetControlNumberLowerBound = transactionSetControlNumberLowerBound;
        return this;
    }

    /**
     * Get the transaction set control number upper bound.
     *
     * @return the transactionSetControlNumberUpperBound value
     */
    public long transactionSetControlNumberUpperBound() {
        return this.transactionSetControlNumberUpperBound;
    }

    /**
     * Set the transaction set control number upper bound.
     *
     * @param transactionSetControlNumberUpperBound the transactionSetControlNumberUpperBound value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withTransactionSetControlNumberUpperBound(long transactionSetControlNumberUpperBound) {
        this.transactionSetControlNumberUpperBound = transactionSetControlNumberUpperBound;
        return this;
    }

    /**
     * Get the value indicating whether to rollover transaction set control number.
     *
     * @return the rolloverTransactionSetControlNumber value
     */
    public boolean rolloverTransactionSetControlNumber() {
        return this.rolloverTransactionSetControlNumber;
    }

    /**
     * Set the value indicating whether to rollover transaction set control number.
     *
     * @param rolloverTransactionSetControlNumber the rolloverTransactionSetControlNumber value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withRolloverTransactionSetControlNumber(boolean rolloverTransactionSetControlNumber) {
        this.rolloverTransactionSetControlNumber = rolloverTransactionSetControlNumber;
        return this;
    }

    /**
     * Get the value indicating whether the message is a test interchange.
     *
     * @return the isTestInterchange value
     */
    public boolean isTestInterchange() {
        return this.isTestInterchange;
    }

    /**
     * Set the value indicating whether the message is a test interchange.
     *
     * @param isTestInterchange the isTestInterchange value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withIsTestInterchange(boolean isTestInterchange) {
        this.isTestInterchange = isTestInterchange;
        return this;
    }

    /**
     * Get the sender internal identification.
     *
     * @return the senderInternalIdentification value
     */
    public String senderInternalIdentification() {
        return this.senderInternalIdentification;
    }

    /**
     * Set the sender internal identification.
     *
     * @param senderInternalIdentification the senderInternalIdentification value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withSenderInternalIdentification(String senderInternalIdentification) {
        this.senderInternalIdentification = senderInternalIdentification;
        return this;
    }

    /**
     * Get the sender internal sub identification.
     *
     * @return the senderInternalSubIdentification value
     */
    public String senderInternalSubIdentification() {
        return this.senderInternalSubIdentification;
    }

    /**
     * Set the sender internal sub identification.
     *
     * @param senderInternalSubIdentification the senderInternalSubIdentification value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withSenderInternalSubIdentification(String senderInternalSubIdentification) {
        this.senderInternalSubIdentification = senderInternalSubIdentification;
        return this;
    }

    /**
     * Get the receiver internal identification.
     *
     * @return the receiverInternalIdentification value
     */
    public String receiverInternalIdentification() {
        return this.receiverInternalIdentification;
    }

    /**
     * Set the receiver internal identification.
     *
     * @param receiverInternalIdentification the receiverInternalIdentification value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withReceiverInternalIdentification(String receiverInternalIdentification) {
        this.receiverInternalIdentification = receiverInternalIdentification;
        return this;
    }

    /**
     * Get the receiver internal sub identification.
     *
     * @return the receiverInternalSubIdentification value
     */
    public String receiverInternalSubIdentification() {
        return this.receiverInternalSubIdentification;
    }

    /**
     * Set the receiver internal sub identification.
     *
     * @param receiverInternalSubIdentification the receiverInternalSubIdentification value to set
     * @return the EdifactEnvelopeSettings object itself.
     */
    public EdifactEnvelopeSettings withReceiverInternalSubIdentification(String receiverInternalSubIdentification) {
        this.receiverInternalSubIdentification = receiverInternalSubIdentification;
        return this;
    }

}
