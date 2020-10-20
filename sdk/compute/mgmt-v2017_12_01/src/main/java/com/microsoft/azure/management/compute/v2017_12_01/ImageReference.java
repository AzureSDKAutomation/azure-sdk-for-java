/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.SubResource;

/**
 * Specifies information about the image to use. You can specify information
 * about platform images, marketplace images, or virtual machine images. This
 * element is required when you want to use a platform image, marketplace
 * image, or virtual machine image, but is not used in other creation
 * operations. NOTE: Image reference publisher and offer can only be set when
 * you create the scale set.
 */
public class ImageReference extends SubResource {
    /**
     * The image publisher.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /**
     * Specifies the offer of the platform image or marketplace image used to
     * create the virtual machine.
     */
    @JsonProperty(value = "offer")
    private String offer;

    /**
     * The image SKU.
     */
    @JsonProperty(value = "sku")
    private String sku;

    /**
     * Specifies the version of the platform image or marketplace image used to
     * create the virtual machine. The allowed formats are Major.Minor.Build or
     * 'latest'. Major, Minor, and Build are decimal numbers. Specify 'latest'
     * to use the latest version of an image available at deploy time. Even if
     * you use 'latest', the VM image will not automatically update after
     * deploy time even if a new version becomes available.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the image publisher.
     *
     * @return the publisher value
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the image publisher.
     *
     * @param publisher the publisher value to set
     * @return the ImageReference object itself.
     */
    public ImageReference withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get specifies the offer of the platform image or marketplace image used to create the virtual machine.
     *
     * @return the offer value
     */
    public String offer() {
        return this.offer;
    }

    /**
     * Set specifies the offer of the platform image or marketplace image used to create the virtual machine.
     *
     * @param offer the offer value to set
     * @return the ImageReference object itself.
     */
    public ImageReference withOffer(String offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Get the image SKU.
     *
     * @return the sku value
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the image SKU.
     *
     * @param sku the sku value to set
     * @return the ImageReference object itself.
     */
    public ImageReference withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get specifies the version of the platform image or marketplace image used to create the virtual machine. The allowed formats are Major.Minor.Build or 'latest'. Major, Minor, and Build are decimal numbers. Specify 'latest' to use the latest version of an image available at deploy time. Even if you use 'latest', the VM image will not automatically update after deploy time even if a new version becomes available.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set specifies the version of the platform image or marketplace image used to create the virtual machine. The allowed formats are Major.Minor.Build or 'latest'. Major, Minor, and Build are decimal numbers. Specify 'latest' to use the latest version of an image available at deploy time. Even if you use 'latest', the VM image will not automatically update after deploy time even if a new version becomes available.
     *
     * @param version the version value to set
     * @return the ImageReference object itself.
     */
    public ImageReference withVersion(String version) {
        this.version = version;
        return this;
    }

}
