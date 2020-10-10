/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2018_01_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties to configure capture description for eventhub.
 */
public class CaptureDescription {
    /**
     * A value that indicates whether capture description is enabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Enumerates the possible values for the encoding format of capture
     * description. Possible values include: 'Avro', 'AvroDeflate'.
     */
    @JsonProperty(value = "encoding")
    private EncodingCaptureDescription encoding;

    /**
     * The time window allows you to set the frequency with which the capture
     * to Azure Blobs will happen, value should between 60 to 900 seconds.
     */
    @JsonProperty(value = "intervalInSeconds")
    private Integer intervalInSeconds;

    /**
     * The size window defines the amount of data built up in your Event Hub
     * before an capture operation, value should be between 10485760 and
     * 524288000 bytes.
     */
    @JsonProperty(value = "sizeLimitInBytes")
    private Integer sizeLimitInBytes;

    /**
     * Properties of Destination where capture will be stored. (Storage
     * Account, Blob Names).
     */
    @JsonProperty(value = "destination")
    private Destination destination;

    /**
     * Get a value that indicates whether capture description is enabled.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set a value that indicates whether capture description is enabled.
     *
     * @param enabled the enabled value to set
     * @return the CaptureDescription object itself.
     */
    public CaptureDescription withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get enumerates the possible values for the encoding format of capture description. Possible values include: 'Avro', 'AvroDeflate'.
     *
     * @return the encoding value
     */
    public EncodingCaptureDescription encoding() {
        return this.encoding;
    }

    /**
     * Set enumerates the possible values for the encoding format of capture description. Possible values include: 'Avro', 'AvroDeflate'.
     *
     * @param encoding the encoding value to set
     * @return the CaptureDescription object itself.
     */
    public CaptureDescription withEncoding(EncodingCaptureDescription encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * Get the time window allows you to set the frequency with which the capture to Azure Blobs will happen, value should between 60 to 900 seconds.
     *
     * @return the intervalInSeconds value
     */
    public Integer intervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * Set the time window allows you to set the frequency with which the capture to Azure Blobs will happen, value should between 60 to 900 seconds.
     *
     * @param intervalInSeconds the intervalInSeconds value to set
     * @return the CaptureDescription object itself.
     */
    public CaptureDescription withIntervalInSeconds(Integer intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
        return this;
    }

    /**
     * Get the size window defines the amount of data built up in your Event Hub before an capture operation, value should be between 10485760 and 524288000 bytes.
     *
     * @return the sizeLimitInBytes value
     */
    public Integer sizeLimitInBytes() {
        return this.sizeLimitInBytes;
    }

    /**
     * Set the size window defines the amount of data built up in your Event Hub before an capture operation, value should be between 10485760 and 524288000 bytes.
     *
     * @param sizeLimitInBytes the sizeLimitInBytes value to set
     * @return the CaptureDescription object itself.
     */
    public CaptureDescription withSizeLimitInBytes(Integer sizeLimitInBytes) {
        this.sizeLimitInBytes = sizeLimitInBytes;
        return this;
    }

    /**
     * Get properties of Destination where capture will be stored. (Storage Account, Blob Names).
     *
     * @return the destination value
     */
    public Destination destination() {
        return this.destination;
    }

    /**
     * Set properties of Destination where capture will be stored. (Storage Account, Blob Names).
     *
     * @param destination the destination value to set
     * @return the CaptureDescription object itself.
     */
    public CaptureDescription withDestination(Destination destination) {
        this.destination = destination;
        return this;
    }

}
