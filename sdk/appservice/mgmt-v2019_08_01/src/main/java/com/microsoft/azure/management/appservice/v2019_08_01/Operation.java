/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.OperationInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.CertificateRegistrationManager;
import org.joda.time.DateTime;
import java.util.List;
import java.util.UUID;

/**
 * Type representing Operation.
 */
public interface Operation extends HasInner<OperationInner>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the createdTime value.
     */
    DateTime createdTime();

    /**
     * @return the errors value.
     */
    List<ErrorEntity> errors();

    /**
     * @return the expirationTime value.
     */
    DateTime expirationTime();

    /**
     * @return the geoMasterOperationId value.
     */
    UUID geoMasterOperationId();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the modifiedTime value.
     */
    DateTime modifiedTime();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the status value.
     */
    OperationStatus status();

}
