/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2020_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mariadb.v2020_01_01.implementation.PerformanceTierPropertiesInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mariadb.v2020_01_01.implementation.MariaDBManager;
import java.util.List;

/**
 * Type representing LocationPerformanceTierProperties.
 */
public interface LocationPerformanceTierProperties extends HasInner<PerformanceTierPropertiesInner>, HasManager<MariaDBManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the maxBackupRetentionDays value.
     */
    Integer maxBackupRetentionDays();

    /**
     * @return the maxLargeStorageMB value.
     */
    Integer maxLargeStorageMB();

    /**
     * @return the maxStorageMB value.
     */
    Integer maxStorageMB();

    /**
     * @return the minBackupRetentionDays value.
     */
    Integer minBackupRetentionDays();

    /**
     * @return the minLargeStorageMB value.
     */
    Integer minLargeStorageMB();

    /**
     * @return the minStorageMB value.
     */
    Integer minStorageMB();

    /**
     * @return the serviceLevelObjectives value.
     */
    List<PerformanceTierServiceLevelObjectives> serviceLevelObjectives();

}
