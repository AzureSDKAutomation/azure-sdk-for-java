/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_04_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the data lake storage account associated with the workspace.
 */
public class DataLakeStorageAccountDetails {
    /**
     * Account URL.
     */
    @JsonProperty(value = "accountUrl")
    private String accountUrl;

    /**
     * Filesystem name.
     */
    @JsonProperty(value = "filesystem")
    private String filesystem;

    /**
     * Get account URL.
     *
     * @return the accountUrl value
     */
    public String accountUrl() {
        return this.accountUrl;
    }

    /**
     * Set account URL.
     *
     * @param accountUrl the accountUrl value to set
     * @return the DataLakeStorageAccountDetails object itself.
     */
    public DataLakeStorageAccountDetails withAccountUrl(String accountUrl) {
        this.accountUrl = accountUrl;
        return this;
    }

    /**
     * Get filesystem name.
     *
     * @return the filesystem value
     */
    public String filesystem() {
        return this.filesystem;
    }

    /**
     * Set filesystem name.
     *
     * @param filesystem the filesystem value to set
     * @return the DataLakeStorageAccountDetails object itself.
     */
    public DataLakeStorageAccountDetails withFilesystem(String filesystem) {
        this.filesystem = filesystem;
        return this;
    }

}
