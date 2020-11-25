/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.netapp.v2020_08_01.implementation.NetAppManager;
import com.microsoft.azure.management.netapp.v2020_08_01.implementation.BackupsListInner;
import com.microsoft.azure.management.netapp.v2020_08_01.implementation.BackupInner;
import java.util.List;

/**
 * Type representing BackupsList.
 */
public interface BackupsList extends HasInner<BackupsListInner>, HasManager<NetAppManager> {
    /**
     * @return the value value.
     */
    List<BackupInner> value();

}
