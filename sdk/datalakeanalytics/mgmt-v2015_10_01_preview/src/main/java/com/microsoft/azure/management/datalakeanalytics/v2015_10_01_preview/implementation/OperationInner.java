/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.implementation;

import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.OperationDisplay;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.OperationMetaPropertyInfo;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.OperationOrigin;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An available operation for Data Lake Analytics.
 */
public class OperationInner {
    /**
     * The name of the operation.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The display information for the operation.
     */
    @JsonProperty(value = "display", access = JsonProperty.Access.WRITE_ONLY)
    private OperationDisplay display;

    /**
     * The OperationMetaPropertyInfo for the operation.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private OperationMetaPropertyInfo properties;

    /**
     * The intended executor of the operation. Possible values include: 'user',
     * 'system', 'user,system'.
     */
    @JsonProperty(value = "origin", access = JsonProperty.Access.WRITE_ONLY)
    private OperationOrigin origin;

    /**
     * Get the name of the operation.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the display information for the operation.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Get the OperationMetaPropertyInfo for the operation.
     *
     * @return the properties value
     */
    public OperationMetaPropertyInfo properties() {
        return this.properties;
    }

    /**
     * Get the intended executor of the operation. Possible values include: 'user', 'system', 'user,system'.
     *
     * @return the origin value
     */
    public OperationOrigin origin() {
        return this.origin;
    }

}
