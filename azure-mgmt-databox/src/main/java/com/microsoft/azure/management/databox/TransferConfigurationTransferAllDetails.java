/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Map of filter type and the details to transfer all data. This field is
 * required only if the TransferConfigurationType is given as TransferAll.
 */
public class TransferConfigurationTransferAllDetails {
    /**
     * Details to transfer all data.
     */
    @JsonProperty(value = "include")
    private TransferAllDetails include;

    /**
     * Get details to transfer all data.
     *
     * @return the include value
     */
    public TransferAllDetails include() {
        return this.include;
    }

    /**
     * Set details to transfer all data.
     *
     * @param include the include value to set
     * @return the TransferConfigurationTransferAllDetails object itself.
     */
    public TransferConfigurationTransferAllDetails withInclude(TransferAllDetails include) {
        this.include = include;
        return this;
    }

}
