// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Task details based on specific task type. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = TaskTypeDetails.class)
@JsonTypeName("TaskTypeDetails")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AutomationRunbookTaskDetails", value = AutomationRunbookTaskDetails.class),
    @JsonSubTypes.Type(name = "ConsistencyCheckTaskDetails", value = ConsistencyCheckTaskDetails.class),
    @JsonSubTypes.Type(name = "JobTaskDetails", value = JobTaskDetails.class),
    @JsonSubTypes.Type(name = "ManualActionTaskDetails", value = ManualActionTaskDetails.class),
    @JsonSubTypes.Type(name = "ScriptActionTaskDetails", value = ScriptActionTaskDetails.class),
    @JsonSubTypes.Type(name = "VmNicUpdatesTaskDetails", value = VmNicUpdatesTaskDetails.class)
})
@Immutable
public class TaskTypeDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TaskTypeDetails.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
