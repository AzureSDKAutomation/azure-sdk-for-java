/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_12_12.implementation;

import com.microsoft.azure.management.cosmosdb.v2019_12_12.ThroughputSettingsGetResults;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cosmosdb.v2019_12_12.ThroughputSettingsGetPropertiesResource;
import java.util.Map;

class ThroughputSettingsGetResultsImpl extends WrapperImpl<ThroughputSettingsGetResultsInner> implements ThroughputSettingsGetResults {
    private final CosmosDBManager manager;
    ThroughputSettingsGetResultsImpl(ThroughputSettingsGetResultsInner inner, CosmosDBManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ThroughputSettingsGetPropertiesResource resource() {
        return this.inner().resource();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
