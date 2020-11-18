/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2015_05_21_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The reference information for an Azure Marketplace image.
 */
public class GalleryImageReference {
    /**
     * The offer of the gallery image.
     */
    @JsonProperty(value = "offer")
    private String offer;

    /**
     * The publisher of the gallery image.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /**
     * The SKU of the gallery image.
     */
    @JsonProperty(value = "sku")
    private String sku;

    /**
     * The OS type of the gallery image.
     */
    @JsonProperty(value = "osType")
    private String osType;

    /**
     * The version of the gallery image.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the offer of the gallery image.
     *
     * @return the offer value
     */
    public String offer() {
        return this.offer;
    }

    /**
     * Set the offer of the gallery image.
     *
     * @param offer the offer value to set
     * @return the GalleryImageReference object itself.
     */
    public GalleryImageReference withOffer(String offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Get the publisher of the gallery image.
     *
     * @return the publisher value
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher of the gallery image.
     *
     * @param publisher the publisher value to set
     * @return the GalleryImageReference object itself.
     */
    public GalleryImageReference withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the SKU of the gallery image.
     *
     * @return the sku value
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the SKU of the gallery image.
     *
     * @param sku the sku value to set
     * @return the GalleryImageReference object itself.
     */
    public GalleryImageReference withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the OS type of the gallery image.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the OS type of the gallery image.
     *
     * @param osType the osType value to set
     * @return the GalleryImageReference object itself.
     */
    public GalleryImageReference withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the version of the gallery image.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version of the gallery image.
     *
     * @param version the version value to set
     * @return the GalleryImageReference object itself.
     */
    public GalleryImageReference withVersion(String version) {
        this.version = version;
        return this;
    }

}
