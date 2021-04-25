// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The properties of Script Execution Result. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "analysisResultType")
@JsonTypeName("ScriptExecution")
@Fluent
public final class ScriptExecutionResultSingletonResourceProperties extends AnalysisResultSingletonResourceProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ScriptExecutionResultSingletonResourceProperties.class);

    /*
     * The result array data.
     */
    @JsonProperty(value = "scriptExecutionResults")
    private List<ScriptExecutionResult> scriptExecutionResults;

    /**
     * Get the scriptExecutionResults property: The result array data.
     *
     * @return the scriptExecutionResults value.
     */
    public List<ScriptExecutionResult> scriptExecutionResults() {
        return this.scriptExecutionResults;
    }

    /**
     * Set the scriptExecutionResults property: The result array data.
     *
     * @param scriptExecutionResults the scriptExecutionResults value to set.
     * @return the ScriptExecutionResultSingletonResourceProperties object itself.
     */
    public ScriptExecutionResultSingletonResourceProperties withScriptExecutionResults(
        List<ScriptExecutionResult> scriptExecutionResults) {
        this.scriptExecutionResults = scriptExecutionResults;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScriptExecutionResultSingletonResourceProperties withGrade(Grade grade) {
        super.withGrade(grade);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (scriptExecutionResults() != null) {
            scriptExecutionResults().forEach(e -> e.validate());
        }
    }
}
