/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SqlUserDefinedFunctionGetPropertiesResource model.
 */
public class SqlUserDefinedFunctionGetPropertiesResource {
    /**
     * Name of the Cosmos DB SQL userDefinedFunction.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Body of the User Defined Function.
     */
    @JsonProperty(value = "body")
    private String body;

    /**
     * A system generated property. A unique identifier.
     */
    @JsonProperty(value = "_rid", access = JsonProperty.Access.WRITE_ONLY)
    private String _rid;

    /**
     * A system generated property that denotes the last updated timestamp of
     * the resource.
     */
    @JsonProperty(value = "_ts", access = JsonProperty.Access.WRITE_ONLY)
    private Double _ts;

    /**
     * A system generated property representing the resource etag required for
     * optimistic concurrency control.
     */
    @JsonProperty(value = "_etag", access = JsonProperty.Access.WRITE_ONLY)
    private String _etag;

    /**
     * A system generated property. It is the unique addressable URI for the
     * resource.
     */
    @JsonProperty(value = "_self", access = JsonProperty.Access.WRITE_ONLY)
    private String _self;

    /**
     * Get name of the Cosmos DB SQL userDefinedFunction.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set name of the Cosmos DB SQL userDefinedFunction.
     *
     * @param id the id value to set
     * @return the SqlUserDefinedFunctionGetPropertiesResource object itself.
     */
    public SqlUserDefinedFunctionGetPropertiesResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get body of the User Defined Function.
     *
     * @return the body value
     */
    public String body() {
        return this.body;
    }

    /**
     * Set body of the User Defined Function.
     *
     * @param body the body value to set
     * @return the SqlUserDefinedFunctionGetPropertiesResource object itself.
     */
    public SqlUserDefinedFunctionGetPropertiesResource withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get a system generated property. A unique identifier.
     *
     * @return the _rid value
     */
    public String _rid() {
        return this._rid;
    }

    /**
     * Get a system generated property that denotes the last updated timestamp of the resource.
     *
     * @return the _ts value
     */
    public Double _ts() {
        return this._ts;
    }

    /**
     * Get a system generated property representing the resource etag required for optimistic concurrency control.
     *
     * @return the _etag value
     */
    public String _etag() {
        return this._etag;
    }

    /**
     * Get a system generated property. It is the unique addressable URI for the resource.
     *
     * @return the _self value
     */
    public String _self() {
        return this._self;
    }

}
