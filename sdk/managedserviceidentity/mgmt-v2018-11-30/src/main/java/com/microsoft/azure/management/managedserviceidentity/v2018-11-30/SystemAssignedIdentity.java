/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedserviceidentity.v2018-11-30;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.managedserviceidentity.v2018-11-30.implementation.ManagedIdentityManager;
import com.microsoft.azure.management.managedserviceidentity.v2018-11-30.implementation.SystemAssignedIdentityInner;
import java.util.UUID;
import java.util.Map;

/**
 * Type representing SystemAssignedIdentity.
 */
public interface SystemAssignedIdentity extends HasInner<SystemAssignedIdentityInner>, HasManager<ManagedIdentityManager> {
    /**
     * @return the clientId value.
     */
    UUID clientId();

    /**
     * @return the clientSecretUrl value.
     */
    String clientSecretUrl();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the principalId value.
     */
    UUID principalId();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the tenantId value.
     */
    UUID tenantId();

    /**
     * @return the type value.
     */
    String type();

}
