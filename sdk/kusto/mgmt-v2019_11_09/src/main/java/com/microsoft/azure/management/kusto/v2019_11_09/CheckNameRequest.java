/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_11_09;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The result returned from a database check name availability request.
 */
public class CheckNameRequest {
    /**
     * Resource name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The type of resource, for instance Microsoft.Kusto/clusters/databases.
     * Possible values include: 'Microsoft.Kusto/clusters/databases',
     * 'Microsoft.Kusto/clusters/attachedDatabaseConfigurations'.
     */
    @JsonProperty(value = "type", required = true)
    private Type type;

    /**
     * Get resource name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set resource name.
     *
     * @param name the name value to set
     * @return the CheckNameRequest object itself.
     */
    public CheckNameRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type of resource, for instance Microsoft.Kusto/clusters/databases. Possible values include: 'Microsoft.Kusto/clusters/databases', 'Microsoft.Kusto/clusters/attachedDatabaseConfigurations'.
     *
     * @return the type value
     */
    public Type type() {
        return this.type;
    }

    /**
     * Set the type of resource, for instance Microsoft.Kusto/clusters/databases. Possible values include: 'Microsoft.Kusto/clusters/databases', 'Microsoft.Kusto/clusters/attachedDatabaseConfigurations'.
     *
     * @param type the type value to set
     * @return the CheckNameRequest object itself.
     */
    public CheckNameRequest withType(Type type) {
        this.type = type;
        return this;
    }

}
