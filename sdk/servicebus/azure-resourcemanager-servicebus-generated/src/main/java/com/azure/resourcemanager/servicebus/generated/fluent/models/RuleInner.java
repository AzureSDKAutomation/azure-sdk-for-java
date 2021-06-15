// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicebus.generated.models.Action;
import com.azure.resourcemanager.servicebus.generated.models.CorrelationFilter;
import com.azure.resourcemanager.servicebus.generated.models.FilterType;
import com.azure.resourcemanager.servicebus.generated.models.SqlFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Description of Rule Resource. */
@JsonFlatten
@Fluent
public class RuleInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RuleInner.class);

    /*
     * Represents the filter actions which are allowed for the transformation
     * of a message that have been matched by a filter expression.
     */
    @JsonProperty(value = "properties.action")
    private Action action;

    /*
     * Filter type that is evaluated against a BrokeredMessage.
     */
    @JsonProperty(value = "properties.filterType")
    private FilterType filterType;

    /*
     * Properties of sqlFilter
     */
    @JsonProperty(value = "properties.sqlFilter")
    private SqlFilter sqlFilter;

    /*
     * Properties of correlationFilter
     */
    @JsonProperty(value = "properties.correlationFilter")
    private CorrelationFilter correlationFilter;

    /**
     * Get the action property: Represents the filter actions which are allowed for the transformation of a message that
     * have been matched by a filter expression.
     *
     * @return the action value.
     */
    public Action action() {
        return this.action;
    }

    /**
     * Set the action property: Represents the filter actions which are allowed for the transformation of a message that
     * have been matched by a filter expression.
     *
     * @param action the action value to set.
     * @return the RuleInner object itself.
     */
    public RuleInner withAction(Action action) {
        this.action = action;
        return this;
    }

    /**
     * Get the filterType property: Filter type that is evaluated against a BrokeredMessage.
     *
     * @return the filterType value.
     */
    public FilterType filterType() {
        return this.filterType;
    }

    /**
     * Set the filterType property: Filter type that is evaluated against a BrokeredMessage.
     *
     * @param filterType the filterType value to set.
     * @return the RuleInner object itself.
     */
    public RuleInner withFilterType(FilterType filterType) {
        this.filterType = filterType;
        return this;
    }

    /**
     * Get the sqlFilter property: Properties of sqlFilter.
     *
     * @return the sqlFilter value.
     */
    public SqlFilter sqlFilter() {
        return this.sqlFilter;
    }

    /**
     * Set the sqlFilter property: Properties of sqlFilter.
     *
     * @param sqlFilter the sqlFilter value to set.
     * @return the RuleInner object itself.
     */
    public RuleInner withSqlFilter(SqlFilter sqlFilter) {
        this.sqlFilter = sqlFilter;
        return this;
    }

    /**
     * Get the correlationFilter property: Properties of correlationFilter.
     *
     * @return the correlationFilter value.
     */
    public CorrelationFilter correlationFilter() {
        return this.correlationFilter;
    }

    /**
     * Set the correlationFilter property: Properties of correlationFilter.
     *
     * @param correlationFilter the correlationFilter value to set.
     * @return the RuleInner object itself.
     */
    public RuleInner withCorrelationFilter(CorrelationFilter correlationFilter) {
        this.correlationFilter = correlationFilter;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (action() != null) {
            action().validate();
        }
        if (sqlFilter() != null) {
            sqlFilter().validate();
        }
        if (correlationFilter() != null) {
            correlationFilter().validate();
        }
    }
}
