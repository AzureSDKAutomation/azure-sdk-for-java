// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.resourcemanager.storage.generated.fluent.models.StorageAccountListKeysResultInner;
import java.util.List;

/** An immutable client-side representation of StorageAccountListKeysResult. */
public interface StorageAccountListKeysResult {
    /**
     * Gets the keys property: Gets the list of storage account keys and their properties for the specified storage
     * account.
     *
     * @return the keys value.
     */
    List<StorageAccountKey> keys();

    /**
     * Gets the inner com.azure.resourcemanager.storage.generated.fluent.models.StorageAccountListKeysResultInner
     * object.
     *
     * @return the inner object.
     */
    StorageAccountListKeysResultInner innerModel();
}
