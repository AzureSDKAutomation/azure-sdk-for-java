// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.resourcemanager.storage.generated.fluent.models.BlobRestoreStatusInner;

/** An immutable client-side representation of BlobRestoreStatus. */
public interface BlobRestoreStatus {
    /**
     * Gets the status property: The status of blob restore progress. Possible values are: - InProgress: Indicates that
     * blob restore is ongoing. - Complete: Indicates that blob restore has been completed successfully. - Failed:
     * Indicates that blob restore is failed.
     *
     * @return the status value.
     */
    BlobRestoreProgressStatus status();

    /**
     * Gets the failureReason property: Failure reason when blob restore is failed.
     *
     * @return the failureReason value.
     */
    String failureReason();

    /**
     * Gets the restoreId property: Id for tracking blob restore request.
     *
     * @return the restoreId value.
     */
    String restoreId();

    /**
     * Gets the parameters property: Blob restore request parameters.
     *
     * @return the parameters value.
     */
    BlobRestoreParameters parameters();

    /**
     * Gets the inner com.azure.resourcemanager.storage.generated.fluent.models.BlobRestoreStatusInner object.
     *
     * @return the inner object.
     */
    BlobRestoreStatusInner innerModel();
}
