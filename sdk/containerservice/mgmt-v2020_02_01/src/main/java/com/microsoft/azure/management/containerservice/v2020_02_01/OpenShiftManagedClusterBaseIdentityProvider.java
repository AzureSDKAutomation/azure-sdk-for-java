/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_02_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Structure for any Identity provider.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", defaultImpl = OpenShiftManagedClusterBaseIdentityProvider.class)
@JsonTypeName("OpenShiftManagedClusterBaseIdentityProvider")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AADIdentityProvider", value = OpenShiftManagedClusterAADIdentityProvider.class)
})
public class OpenShiftManagedClusterBaseIdentityProvider {
}
