/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents URI referring to MSIX Image.
 */
public class MSIXImageURI {
    /**
     * URI to Image.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /**
     * Get uRI to Image.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set uRI to Image.
     *
     * @param uri the uri value to set
     * @return the MSIXImageURI object itself.
     */
    public MSIXImageURI withUri(String uri) {
        this.uri = uri;
        return this;
    }

}
