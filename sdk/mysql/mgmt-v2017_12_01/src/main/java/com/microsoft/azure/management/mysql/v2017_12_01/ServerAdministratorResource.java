/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mysql.v2017_12_01.implementation.ServerAdministratorResourceInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mysql.v2017_12_01.implementation.DBforMySQLManager;
import java.util.UUID;

/**
 * Type representing ServerAdministratorResource.
 */
public interface ServerAdministratorResource extends HasInner<ServerAdministratorResourceInner>, HasManager<DBforMySQLManager> {
    /**
     * @return the administratorType value.
     */
    String administratorType();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the login value.
     */
    String login();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the sid value.
     */
    UUID sid();

    /**
     * @return the tenantId value.
     */
    UUID tenantId();

    /**
     * @return the type value.
     */
    String type();

}
