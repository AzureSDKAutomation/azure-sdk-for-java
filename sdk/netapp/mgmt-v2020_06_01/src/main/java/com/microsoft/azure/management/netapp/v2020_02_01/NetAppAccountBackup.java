/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.netapp.v2020_02_01.implementation.BackupInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.netapp.v2020_02_01.implementation.NetAppManager;
import org.joda.time.DateTime;

/**
 * Type representing NetAppAccountBackup.
 */
public interface NetAppAccountBackup extends HasInner<BackupInner>, Indexable, Refreshable<NetAppAccountBackup>, HasManager<NetAppManager> {
    /**
     * @return the backupType value.
     */
    String backupType();

    /**
     * @return the creationDate value.
     */
    DateTime creationDate();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the label value.
     */
    String label();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the size value.
     */
    Long size();

    /**
     * @return the type value.
     */
    String type();

}
