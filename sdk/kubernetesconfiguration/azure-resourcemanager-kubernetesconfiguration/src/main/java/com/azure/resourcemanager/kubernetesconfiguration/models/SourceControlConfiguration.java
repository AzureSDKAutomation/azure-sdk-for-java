// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.models;

import com.azure.resourcemanager.kubernetesconfiguration.fluent.models.SourceControlConfigurationInner;
import java.util.Map;

/** An immutable client-side representation of SourceControlConfiguration. */
public interface SourceControlConfiguration {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Top level metadata
     * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the repositoryUrl property: Url of the SourceControl Repository.
     *
     * @return the repositoryUrl value.
     */
    String repositoryUrl();

    /**
     * Gets the operatorNamespace property: The namespace to which this operator is installed to. Maximum of 253 lower
     * case alphanumeric characters, hyphen and period only.
     *
     * @return the operatorNamespace value.
     */
    String operatorNamespace();

    /**
     * Gets the operatorInstanceName property: Instance name of the operator - identifying the specific configuration.
     *
     * @return the operatorInstanceName value.
     */
    String operatorInstanceName();

    /**
     * Gets the operatorType property: Type of the operator.
     *
     * @return the operatorType value.
     */
    OperatorType operatorType();

    /**
     * Gets the operatorParams property: Any Parameters for the Operator instance in string format.
     *
     * @return the operatorParams value.
     */
    String operatorParams();

    /**
     * Gets the configurationProtectedSettings property: Name-value pairs of protected configuration settings for the
     * configuration.
     *
     * @return the configurationProtectedSettings value.
     */
    Map<String, String> configurationProtectedSettings();

    /**
     * Gets the operatorScope property: Scope at which the operator will be installed.
     *
     * @return the operatorScope value.
     */
    OperatorScopeType operatorScope();

    /**
     * Gets the repositoryPublicKey property: Public Key associated with this SourceControl configuration (either
     * generated within the cluster or provided by the user).
     *
     * @return the repositoryPublicKey value.
     */
    String repositoryPublicKey();

    /**
     * Gets the sshKnownHostsContents property: Base64-encoded known_hosts contents containing public SSH keys required
     * to access private Git instances.
     *
     * @return the sshKnownHostsContents value.
     */
    String sshKnownHostsContents();

    /**
     * Gets the enableHelmOperator property: Option to enable Helm Operator for this git configuration.
     *
     * @return the enableHelmOperator value.
     */
    Boolean enableHelmOperator();

    /**
     * Gets the helmOperatorProperties property: Properties for Helm operator.
     *
     * @return the helmOperatorProperties value.
     */
    HelmOperatorProperties helmOperatorProperties();

    /**
     * Gets the provisioningState property: The provisioning state of the resource provider.
     *
     * @return the provisioningState value.
     */
    ProvisioningStateType provisioningState();

    /**
     * Gets the complianceStatus property: Compliance Status of the Configuration.
     *
     * @return the complianceStatus value.
     */
    ComplianceStatus complianceStatus();

    /**
     * Gets the inner com.azure.resourcemanager.kubernetesconfiguration.fluent.models.SourceControlConfigurationInner
     * object.
     *
     * @return the inner object.
     */
    SourceControlConfigurationInner innerModel();
}
