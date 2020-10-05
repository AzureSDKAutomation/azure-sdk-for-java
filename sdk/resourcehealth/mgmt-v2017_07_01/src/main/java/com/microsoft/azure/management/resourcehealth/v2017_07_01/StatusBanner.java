/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcehealth.v2017_07_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Banner type of emerging issue.
 */
public class StatusBanner {
    /**
     * The banner title.
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * The details of banner.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * The cloud type of this banner.
     */
    @JsonProperty(value = "cloud")
    private String cloud;

    /**
     * The last time modified on this banner.
     */
    @JsonProperty(value = "lastModifiedTime")
    private DateTime lastModifiedTime;

    /**
     * Get the banner title.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the banner title.
     *
     * @param title the title value to set
     * @return the StatusBanner object itself.
     */
    public StatusBanner withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the details of banner.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the details of banner.
     *
     * @param message the message value to set
     * @return the StatusBanner object itself.
     */
    public StatusBanner withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the cloud type of this banner.
     *
     * @return the cloud value
     */
    public String cloud() {
        return this.cloud;
    }

    /**
     * Set the cloud type of this banner.
     *
     * @param cloud the cloud value to set
     * @return the StatusBanner object itself.
     */
    public StatusBanner withCloud(String cloud) {
        this.cloud = cloud;
        return this;
    }

    /**
     * Get the last time modified on this banner.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Set the last time modified on this banner.
     *
     * @param lastModifiedTime the lastModifiedTime value to set
     * @return the StatusBanner object itself.
     */
    public StatusBanner withLastModifiedTime(DateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

}
