/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2018_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mariadb.v2018_06_01.implementation.MariaDBManager;
import com.microsoft.azure.management.mariadb.v2018_06_01.implementation.RecoverableServerResourceInner;

/**
 * Type representing RecoverableServerResource.
 */
public interface RecoverableServerResource extends HasInner<RecoverableServerResourceInner>, HasManager<MariaDBManager> {
    /**
     * @return the edition value.
     */
    String edition();

    /**
     * @return the hardwareGeneration value.
     */
    String hardwareGeneration();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastAvailableBackupDateTime value.
     */
    String lastAvailableBackupDateTime();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the serviceLevelObjective value.
     */
    String serviceLevelObjective();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the vCore value.
     */
    Integer vCore();

    /**
     * @return the version value.
     */
    String version();

}
