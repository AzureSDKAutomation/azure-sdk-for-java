/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Activity to get metadata of dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = GetMetadataActivity.class)
@JsonTypeName("GetMetadata")
@JsonFlatten
public class GetMetadataActivity extends ExecutionActivity {
    /**
     * GetMetadata activity dataset reference.
     */
    @JsonProperty(value = "typeProperties.dataset", required = true)
    private DatasetReference dataset;

    /**
     * GetMetadata activity binary store settings.
     */
    @JsonProperty(value = "typeProperties.storeSettings")
    private StoreReadSettings storeSettings;

    /**
     * Fields of metadata to get from dataset.
     */
    @JsonProperty(value = "typeProperties.fieldList")
    private List<Object> fieldList;

    /**
     * Get getMetadata activity dataset reference.
     *
     * @return the dataset value
     */
    public DatasetReference dataset() {
        return this.dataset;
    }

    /**
     * Set getMetadata activity dataset reference.
     *
     * @param dataset the dataset value to set
     * @return the GetMetadataActivity object itself.
     */
    public GetMetadataActivity withDataset(DatasetReference dataset) {
        this.dataset = dataset;
        return this;
    }

    /**
     * Get getMetadata activity binary store settings.
     *
     * @return the storeSettings value
     */
    public StoreReadSettings storeSettings() {
        return this.storeSettings;
    }

    /**
     * Set getMetadata activity binary store settings.
     *
     * @param storeSettings the storeSettings value to set
     * @return the GetMetadataActivity object itself.
     */
    public GetMetadataActivity withStoreSettings(StoreReadSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get fields of metadata to get from dataset.
     *
     * @return the fieldList value
     */
    public List<Object> fieldList() {
        return this.fieldList;
    }

    /**
     * Set fields of metadata to get from dataset.
     *
     * @param fieldList the fieldList value to set
     * @return the GetMetadataActivity object itself.
     */
    public GetMetadataActivity withFieldList(List<Object> fieldList) {
        this.fieldList = fieldList;
        return this;
    }

}
