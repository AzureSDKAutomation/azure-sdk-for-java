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
 * The X12 delimiter override settings.
 */
public class X12DelimiterOverrides {
    /**
     * The protocol version.
     */
    @JsonProperty(value = "protocolVersion")
    private String protocolVersion;

    /**
     * The message id.
     */
    @JsonProperty(value = "messageId")
    private String messageId;

    /**
     * The data element separator.
     */
    @JsonProperty(value = "dataElementSeparator", required = true)
    private int dataElementSeparator;

    /**
     * The component separator.
     */
    @JsonProperty(value = "componentSeparator", required = true)
    private int componentSeparator;

    /**
     * The segment terminator.
     */
    @JsonProperty(value = "segmentTerminator", required = true)
    private int segmentTerminator;

    /**
     * The segment terminator suffix. Possible values include: 'NotSpecified',
     * 'None', 'CR', 'LF', 'CRLF'.
     */
    @JsonProperty(value = "segmentTerminatorSuffix", required = true)
    private SegmentTerminatorSuffix segmentTerminatorSuffix;

    /**
     * The replacement character.
     */
    @JsonProperty(value = "replaceCharacter", required = true)
    private int replaceCharacter;

    /**
     * The value indicating whether to replace separators in payload.
     */
    @JsonProperty(value = "replaceSeparatorsInPayload", required = true)
    private boolean replaceSeparatorsInPayload;

    /**
     * The target namespace on which this delimiter settings has to be applied.
     */
    @JsonProperty(value = "targetNamespace")
    private String targetNamespace;

    /**
     * Get the protocol version.
     *
     * @return the protocolVersion value
     */
    public String protocolVersion() {
        return this.protocolVersion;
    }

    /**
     * Set the protocol version.
     *
     * @param protocolVersion the protocolVersion value to set
     * @return the X12DelimiterOverrides object itself.
     */
    public X12DelimiterOverrides withProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
        return this;
    }

    /**
     * Get the message id.
     *
     * @return the messageId value
     */
    public String messageId() {
        return this.messageId;
    }

    /**
     * Set the message id.
     *
     * @param messageId the messageId value to set
     * @return the X12DelimiterOverrides object itself.
     */
    public X12DelimiterOverrides withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the data element separator.
     *
     * @return the dataElementSeparator value
     */
    public int dataElementSeparator() {
        return this.dataElementSeparator;
    }

    /**
     * Set the data element separator.
     *
     * @param dataElementSeparator the dataElementSeparator value to set
     * @return the X12DelimiterOverrides object itself.
     */
    public X12DelimiterOverrides withDataElementSeparator(int dataElementSeparator) {
        this.dataElementSeparator = dataElementSeparator;
        return this;
    }

    /**
     * Get the component separator.
     *
     * @return the componentSeparator value
     */
    public int componentSeparator() {
        return this.componentSeparator;
    }

    /**
     * Set the component separator.
     *
     * @param componentSeparator the componentSeparator value to set
     * @return the X12DelimiterOverrides object itself.
     */
    public X12DelimiterOverrides withComponentSeparator(int componentSeparator) {
        this.componentSeparator = componentSeparator;
        return this;
    }

    /**
     * Get the segment terminator.
     *
     * @return the segmentTerminator value
     */
    public int segmentTerminator() {
        return this.segmentTerminator;
    }

    /**
     * Set the segment terminator.
     *
     * @param segmentTerminator the segmentTerminator value to set
     * @return the X12DelimiterOverrides object itself.
     */
    public X12DelimiterOverrides withSegmentTerminator(int segmentTerminator) {
        this.segmentTerminator = segmentTerminator;
        return this;
    }

    /**
     * Get the segment terminator suffix. Possible values include: 'NotSpecified', 'None', 'CR', 'LF', 'CRLF'.
     *
     * @return the segmentTerminatorSuffix value
     */
    public SegmentTerminatorSuffix segmentTerminatorSuffix() {
        return this.segmentTerminatorSuffix;
    }

    /**
     * Set the segment terminator suffix. Possible values include: 'NotSpecified', 'None', 'CR', 'LF', 'CRLF'.
     *
     * @param segmentTerminatorSuffix the segmentTerminatorSuffix value to set
     * @return the X12DelimiterOverrides object itself.
     */
    public X12DelimiterOverrides withSegmentTerminatorSuffix(SegmentTerminatorSuffix segmentTerminatorSuffix) {
        this.segmentTerminatorSuffix = segmentTerminatorSuffix;
        return this;
    }

    /**
     * Get the replacement character.
     *
     * @return the replaceCharacter value
     */
    public int replaceCharacter() {
        return this.replaceCharacter;
    }

    /**
     * Set the replacement character.
     *
     * @param replaceCharacter the replaceCharacter value to set
     * @return the X12DelimiterOverrides object itself.
     */
    public X12DelimiterOverrides withReplaceCharacter(int replaceCharacter) {
        this.replaceCharacter = replaceCharacter;
        return this;
    }

    /**
     * Get the value indicating whether to replace separators in payload.
     *
     * @return the replaceSeparatorsInPayload value
     */
    public boolean replaceSeparatorsInPayload() {
        return this.replaceSeparatorsInPayload;
    }

    /**
     * Set the value indicating whether to replace separators in payload.
     *
     * @param replaceSeparatorsInPayload the replaceSeparatorsInPayload value to set
     * @return the X12DelimiterOverrides object itself.
     */
    public X12DelimiterOverrides withReplaceSeparatorsInPayload(boolean replaceSeparatorsInPayload) {
        this.replaceSeparatorsInPayload = replaceSeparatorsInPayload;
        return this;
    }

    /**
     * Get the target namespace on which this delimiter settings has to be applied.
     *
     * @return the targetNamespace value
     */
    public String targetNamespace() {
        return this.targetNamespace;
    }

    /**
     * Set the target namespace on which this delimiter settings has to be applied.
     *
     * @param targetNamespace the targetNamespace value to set
     * @return the X12DelimiterOverrides object itself.
     */
    public X12DelimiterOverrides withTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
        return this;
    }

}
