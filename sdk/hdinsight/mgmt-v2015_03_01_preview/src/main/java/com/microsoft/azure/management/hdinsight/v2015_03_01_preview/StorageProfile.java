/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The storage profile.
 */
public class StorageProfile {
    /**
     * The list of storage accounts in the cluster.
     */
    @JsonProperty(value = "storageaccounts")
    private List<StorageAccount> storageaccounts;

    /**
     * Get the list of storage accounts in the cluster.
     *
     * @return the storageaccounts value
     */
    public List<StorageAccount> storageaccounts() {
        return this.storageaccounts;
    }

    /**
     * Set the list of storage accounts in the cluster.
     *
     * @param storageaccounts the storageaccounts value to set
     * @return the StorageProfile object itself.
     */
    public StorageProfile withStorageaccounts(List<StorageAccount> storageaccounts) {
        this.storageaccounts = storageaccounts;
        return this;
    }

}
