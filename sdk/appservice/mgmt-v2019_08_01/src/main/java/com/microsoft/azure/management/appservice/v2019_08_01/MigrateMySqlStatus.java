/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.CertificateRegistrationManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.MigrateMySqlStatusInner;

/**
 * Type representing MigrateMySqlStatus.
 */
public interface MigrateMySqlStatus extends HasInner<MigrateMySqlStatusInner>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the localMySqlEnabled value.
     */
    Boolean localMySqlEnabled();

    /**
     * @return the migrationOperationStatus value.
     */
    OperationStatus migrationOperationStatus();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the operationId value.
     */
    String operationId();

    /**
     * @return the type value.
     */
    String type();

}
