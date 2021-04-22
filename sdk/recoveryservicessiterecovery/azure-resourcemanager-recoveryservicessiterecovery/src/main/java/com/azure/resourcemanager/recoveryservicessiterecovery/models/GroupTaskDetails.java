// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** This class represents the group task details when parent child relationship exists in the drill down. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = GroupTaskDetails.class)
@JsonTypeName("GroupTaskDetails")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "InlineWorkflowTaskDetails", value = InlineWorkflowTaskDetails.class),
    @JsonSubTypes.Type(name = "RecoveryPlanGroupTaskDetails", value = RecoveryPlanGroupTaskDetails.class)
})
@Fluent
public class GroupTaskDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GroupTaskDetails.class);

    /*
     * The child tasks.
     */
    @JsonProperty(value = "childTasks")
    private List<AsrTask> childTasks;

    /**
     * Get the childTasks property: The child tasks.
     *
     * @return the childTasks value.
     */
    public List<AsrTask> childTasks() {
        return this.childTasks;
    }

    /**
     * Set the childTasks property: The child tasks.
     *
     * @param childTasks the childTasks value to set.
     * @return the GroupTaskDetails object itself.
     */
    public GroupTaskDetails withChildTasks(List<AsrTask> childTasks) {
        this.childTasks = childTasks;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (childTasks() != null) {
            childTasks().forEach(e -> e.validate());
        }
    }
}
