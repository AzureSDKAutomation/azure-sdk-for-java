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
 * The SqlStoredProcedureGetPropertiesResource model.
 */
public class SqlStoredProcedureGetPropertiesResource {
    /**
     * Name of the Cosmos DB SQL storedProcedure.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Body of the Stored Procedure.
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
    private Object _ts;

    /**
     * A system generated property representing the resource etag required for
     * optimistic concurrency control.
     */
    @JsonProperty(value = "_etag", access = JsonProperty.Access.WRITE_ONLY)
    private String _etag;

    /**
     * Get name of the Cosmos DB SQL storedProcedure.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set name of the Cosmos DB SQL storedProcedure.
     *
     * @param id the id value to set
     * @return the SqlStoredProcedureGetPropertiesResource object itself.
     */
    public SqlStoredProcedureGetPropertiesResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get body of the Stored Procedure.
     *
     * @return the body value
     */
    public String body() {
        return this.body;
    }

    /**
     * Set body of the Stored Procedure.
     *
     * @param body the body value to set
     * @return the SqlStoredProcedureGetPropertiesResource object itself.
     */
    public SqlStoredProcedureGetPropertiesResource withBody(String body) {
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
    public Object _ts() {
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

}
