/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.v2019_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storagesync.v2019_02_01.implementation.StorageSyncManager;
import com.microsoft.azure.management.storagesync.v2019_02_01.implementation.PostBackupResponseInner;

/**
 * Type representing PostBackupResponse.
 */
public interface PostBackupResponse extends HasInner<PostBackupResponseInner>, HasManager<StorageSyncManager> {
    /**
     * @return the cloudEndpointName value.
     */
    String cloudEndpointName();

}
