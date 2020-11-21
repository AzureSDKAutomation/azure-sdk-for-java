/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object that wraps the blob inventory rule. Each rule is uniquely defined
 * by name.
 */
public class BlobInventoryPolicyRule {
    /**
     * Rule is enabled when set to true.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /**
     * A rule name can contain any combination of alpha numeric characters.
     * Rule name is case-sensitive. It must be unique within a policy.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * An object that defines the blob inventory policy rule.
     */
    @JsonProperty(value = "definition", required = true)
    private BlobInventoryPolicyDefinition definition;

    /**
     * Get rule is enabled when set to true.
     *
     * @return the enabled value
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set rule is enabled when set to true.
     *
     * @param enabled the enabled value to set
     * @return the BlobInventoryPolicyRule object itself.
     */
    public BlobInventoryPolicyRule withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get a rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set a rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
     *
     * @param name the name value to set
     * @return the BlobInventoryPolicyRule object itself.
     */
    public BlobInventoryPolicyRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get an object that defines the blob inventory policy rule.
     *
     * @return the definition value
     */
    public BlobInventoryPolicyDefinition definition() {
        return this.definition;
    }

    /**
     * Set an object that defines the blob inventory policy rule.
     *
     * @param definition the definition value to set
     * @return the BlobInventoryPolicyRule object itself.
     */
    public BlobInventoryPolicyRule withDefinition(BlobInventoryPolicyDefinition definition) {
        this.definition = definition;
        return this;
    }

}
