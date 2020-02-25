/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_12_12;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SqlTriggerGetPropertiesResource model.
 */
public class SqlTriggerGetPropertiesResource {
    /**
     * Name of the Cosmos DB SQL trigger.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Body of the Trigger.
     */
    @JsonProperty(value = "body")
    private String body;

    /**
     * Type of the Trigger. Possible values include: 'Pre', 'Post'.
     */
    @JsonProperty(value = "triggerType")
    private TriggerType triggerType;

    /**
     * The operation the trigger is associated with. Possible values include:
     * 'All', 'Create', 'Update', 'Delete', 'Replace'.
     */
    @JsonProperty(value = "triggerOperation")
    private TriggerOperation triggerOperation;

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
     * Get name of the Cosmos DB SQL trigger.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set name of the Cosmos DB SQL trigger.
     *
     * @param id the id value to set
     * @return the SqlTriggerGetPropertiesResource object itself.
     */
    public SqlTriggerGetPropertiesResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get body of the Trigger.
     *
     * @return the body value
     */
    public String body() {
        return this.body;
    }

    /**
     * Set body of the Trigger.
     *
     * @param body the body value to set
     * @return the SqlTriggerGetPropertiesResource object itself.
     */
    public SqlTriggerGetPropertiesResource withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get type of the Trigger. Possible values include: 'Pre', 'Post'.
     *
     * @return the triggerType value
     */
    public TriggerType triggerType() {
        return this.triggerType;
    }

    /**
     * Set type of the Trigger. Possible values include: 'Pre', 'Post'.
     *
     * @param triggerType the triggerType value to set
     * @return the SqlTriggerGetPropertiesResource object itself.
     */
    public SqlTriggerGetPropertiesResource withTriggerType(TriggerType triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * Get the operation the trigger is associated with. Possible values include: 'All', 'Create', 'Update', 'Delete', 'Replace'.
     *
     * @return the triggerOperation value
     */
    public TriggerOperation triggerOperation() {
        return this.triggerOperation;
    }

    /**
     * Set the operation the trigger is associated with. Possible values include: 'All', 'Create', 'Update', 'Delete', 'Replace'.
     *
     * @param triggerOperation the triggerOperation value to set
     * @return the SqlTriggerGetPropertiesResource object itself.
     */
    public SqlTriggerGetPropertiesResource withTriggerOperation(TriggerOperation triggerOperation) {
        this.triggerOperation = triggerOperation;
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
