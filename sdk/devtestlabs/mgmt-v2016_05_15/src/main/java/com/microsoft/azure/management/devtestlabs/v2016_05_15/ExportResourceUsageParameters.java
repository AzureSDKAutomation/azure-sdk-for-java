/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters of the export operation.
 */
public class ExportResourceUsageParameters {
    /**
     * The blob storage absolute sas uri with write permission to the container
     * which the usage data needs to be uploaded to.
     */
    @JsonProperty(value = "blobStorageAbsoluteSasUri")
    private String blobStorageAbsoluteSasUri;

    /**
     * The start time of the usage. If not provided, usage will be reported
     * since the beginning of data collection.
     */
    @JsonProperty(value = "usageStartDate")
    private DateTime usageStartDate;

    /**
     * Get the blob storage absolute sas uri with write permission to the container which the usage data needs to be uploaded to.
     *
     * @return the blobStorageAbsoluteSasUri value
     */
    public String blobStorageAbsoluteSasUri() {
        return this.blobStorageAbsoluteSasUri;
    }

    /**
     * Set the blob storage absolute sas uri with write permission to the container which the usage data needs to be uploaded to.
     *
     * @param blobStorageAbsoluteSasUri the blobStorageAbsoluteSasUri value to set
     * @return the ExportResourceUsageParameters object itself.
     */
    public ExportResourceUsageParameters withBlobStorageAbsoluteSasUri(String blobStorageAbsoluteSasUri) {
        this.blobStorageAbsoluteSasUri = blobStorageAbsoluteSasUri;
        return this;
    }

    /**
     * Get the start time of the usage. If not provided, usage will be reported since the beginning of data collection.
     *
     * @return the usageStartDate value
     */
    public DateTime usageStartDate() {
        return this.usageStartDate;
    }

    /**
     * Set the start time of the usage. If not provided, usage will be reported since the beginning of data collection.
     *
     * @param usageStartDate the usageStartDate value to set
     * @return the ExportResourceUsageParameters object itself.
     */
    public ExportResourceUsageParameters withUsageStartDate(DateTime usageStartDate) {
        this.usageStartDate = usageStartDate;
        return this;
    }

}
