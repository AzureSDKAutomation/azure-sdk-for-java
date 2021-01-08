// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.resourcemanager.machinelearningservices.fluent.models.DatastoreContentsInner;

/** An immutable client-side representation of DatastoreContents. */
public interface DatastoreContents {
    /**
     * Gets the type property: Storage type backing the datastore.
     *
     * @return the type value.
     */
    ContentsType type();

    /**
     * Gets the azureDataLake property: The azureDataLake property.
     *
     * @return the azureDataLake value.
     */
    AzureDataLakeSection azureDataLake();

    /**
     * Gets the azureMySql property: The azureMySql property.
     *
     * @return the azureMySql value.
     */
    AzureMySqlSection azureMySql();

    /**
     * Gets the azurePostgreSql property: The azurePostgreSql property.
     *
     * @return the azurePostgreSql value.
     */
    AzurePostgreSqlSection azurePostgreSql();

    /**
     * Gets the azureSqlDatabase property: The azureSqlDatabase property.
     *
     * @return the azureSqlDatabase value.
     */
    AzureSqlDatabaseSection azureSqlDatabase();

    /**
     * Gets the azureStorage property: The azureStorage property.
     *
     * @return the azureStorage value.
     */
    AzureStorageSection azureStorage();

    /**
     * Gets the glusterFs property: The glusterFs property.
     *
     * @return the glusterFs value.
     */
    GlusterFsSection glusterFs();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearningservices.fluent.models.DatastoreContentsInner object.
     *
     * @return the inner object.
     */
    DatastoreContentsInner innerModel();
}
