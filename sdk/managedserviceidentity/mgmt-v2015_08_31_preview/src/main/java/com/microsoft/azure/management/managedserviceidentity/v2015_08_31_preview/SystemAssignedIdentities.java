/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedserviceidentity.v2015_08_31_preview;

import rx.Observable;
import com.microsoft.azure.management.managedserviceidentity.v2015_08_31_preview.implementation.SystemAssignedIdentitiesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SystemAssignedIdentities.
 */
public interface SystemAssignedIdentities extends HasInner<SystemAssignedIdentitiesInner> {
    /**
     * Gets the systemAssignedIdentity available under the specified RP scope.
     *
     * @param scope The resource provider scope of the resource. Parent resource being extended by Managed Identities.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SystemAssignedIdentity> getByScopeAsync(String scope);

}
