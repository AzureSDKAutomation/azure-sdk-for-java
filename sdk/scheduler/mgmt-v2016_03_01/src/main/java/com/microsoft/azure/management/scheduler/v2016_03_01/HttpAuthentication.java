/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The HttpAuthentication model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = HttpAuthentication.class)
@JsonTypeName("HttpAuthentication")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ClientCertificate", value = ClientCertAuthentication.class),
    @JsonSubTypes.Type(name = "Basic", value = BasicAuthentication.class),
    @JsonSubTypes.Type(name = "ActiveDirectoryOAuth", value = OAuthAuthentication.class)
})
public class HttpAuthentication {
}
