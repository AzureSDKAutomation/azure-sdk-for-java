// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

/** Resource collection API of InboundSecurityRuleOperations. */
public interface InboundSecurityRuleOperations {
    /**
     * Begins definition for a new InboundSecurityRule resource.
     *
     * @param name resource name.
     * @return the first stage of the new InboundSecurityRule definition.
     */
    InboundSecurityRule.DefinitionStages.Blank define(String name);
}
