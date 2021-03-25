// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** An action for the delivery rule. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "name",
    defaultImpl = DeliveryRuleAction.class)
@JsonTypeName("DeliveryRuleAction")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "UrlRedirect", value = UrlRedirectAction.class),
    @JsonSubTypes.Type(name = "UrlSigning", value = UrlSigningAction.class),
    @JsonSubTypes.Type(name = "OriginGroupOverride", value = OriginGroupOverrideAction.class),
    @JsonSubTypes.Type(name = "UrlRewrite", value = UrlRewriteAction.class),
    @JsonSubTypes.Type(name = "ModifyRequestHeader", value = DeliveryRuleRequestHeaderAction.class),
    @JsonSubTypes.Type(name = "ModifyResponseHeader", value = DeliveryRuleResponseHeaderAction.class),
    @JsonSubTypes.Type(name = "CacheExpiration", value = DeliveryRuleCacheExpirationAction.class),
    @JsonSubTypes.Type(name = "CacheKeyQueryString", value = DeliveryRuleCacheKeyQueryStringAction.class)
})
@Immutable
public class DeliveryRuleAction {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeliveryRuleAction.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
