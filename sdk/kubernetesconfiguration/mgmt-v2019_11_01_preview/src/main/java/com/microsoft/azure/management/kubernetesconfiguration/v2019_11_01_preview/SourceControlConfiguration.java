/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kubernetesconfiguration.v2019_11_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.kubernetesconfiguration.v2019_11_01_preview.implementation.SourceControlConfigurationInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.kubernetesconfiguration.v2019_11_01_preview.implementation.KubernetesConfigurationManager;
import java.util.Map;

/**
 * Type representing SourceControlConfiguration.
 */
public interface SourceControlConfiguration extends HasInner<SourceControlConfigurationInner>, Indexable, Updatable<SourceControlConfiguration.Update>, HasManager<KubernetesConfigurationManager> {
    /**
     * @return the complianceStatus value.
     */
    ComplianceStatus complianceStatus();

    /**
     * @return the enableHelmOperator value.
     */
    EnableHelmOperator enableHelmOperator();

    /**
     * @return the helmOperatorProperties value.
     */
    HelmOperatorProperties helmOperatorProperties();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the operatorInstanceName value.
     */
    String operatorInstanceName();

    /**
     * @return the operatorNamespace value.
     */
    String operatorNamespace();

    /**
     * @return the operatorParams value.
     */
    String operatorParams();

    /**
     * @return the operatorScope value.
     */
    OperatorScope operatorScope();

    /**
     * @return the operatorType value.
     */
    OperatorType operatorType();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the repositoryPublicKey value.
     */
    String repositoryPublicKey();

    /**
     * @return the repositoryUrl value.
     */
    String repositoryUrl();

    /**
     * @return the sshKnownHostsContents value.
     */
    String sshKnownHostsContents();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the SourceControlConfiguration definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithProvider, DefinitionStages.WithClusterResourceName, DefinitionStages.WithClusterName, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SourceControlConfiguration definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SourceControlConfiguration definition.
         */
        interface Blank extends WithProvider {
        }

        /**
         * The stage of the sourcecontrolconfiguration definition allowing to specify Provider.
         */
        interface WithProvider {
           /**
            * Specifies resourceGroupName, clusterRp.
            * @param resourceGroupName The name of the resource group
            * @param clusterRp The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters). Possible values include: 'Microsoft.ContainerService', 'Microsoft.Kubernetes'
            * @return the next definition stage
            */
            WithClusterResourceName withExistingProvider(String resourceGroupName, String clusterRp);
        }

        /**
         * The stage of the sourcecontrolconfiguration definition allowing to specify ClusterResourceName.
         */
        interface WithClusterResourceName {
           /**
            * Specifies clusterResourceName.
            * @param clusterResourceName The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters). Possible values include: 'managedClusters', 'connectedClusters'
            * @return the next definition stage
            */
            WithClusterName withClusterResourceName(String clusterResourceName);
        }

        /**
         * The stage of the sourcecontrolconfiguration definition allowing to specify ClusterName.
         */
        interface WithClusterName {
           /**
            * Specifies clusterName.
            * @param clusterName The name of the kubernetes cluster
            * @return the next definition stage
            */
            WithCreate withClusterName(String clusterName);
        }

        /**
         * The stage of the sourcecontrolconfiguration definition allowing to specify ConfigurationProtectedSettings.
         */
        interface WithConfigurationProtectedSettings {
            /**
             * Specifies configurationProtectedSettings.
             * @param configurationProtectedSettings Name-value pairs of protected configuration settings for the configuration
             * @return the next definition stage
             */
            WithCreate withConfigurationProtectedSettings(Map<String, String> configurationProtectedSettings);
        }

        /**
         * The stage of the sourcecontrolconfiguration definition allowing to specify EnableHelmOperator.
         */
        interface WithEnableHelmOperator {
            /**
             * Specifies enableHelmOperator.
             * @param enableHelmOperator Option to enable Helm Operator for this git configuration. Possible values include: 'true', 'false'
             * @return the next definition stage
             */
            WithCreate withEnableHelmOperator(EnableHelmOperator enableHelmOperator);
        }

        /**
         * The stage of the sourcecontrolconfiguration definition allowing to specify HelmOperatorProperties.
         */
        interface WithHelmOperatorProperties {
            /**
             * Specifies helmOperatorProperties.
             * @param helmOperatorProperties Properties for Helm operator
             * @return the next definition stage
             */
            WithCreate withHelmOperatorProperties(HelmOperatorProperties helmOperatorProperties);
        }

        /**
         * The stage of the sourcecontrolconfiguration definition allowing to specify OperatorInstanceName.
         */
        interface WithOperatorInstanceName {
            /**
             * Specifies operatorInstanceName.
             * @param operatorInstanceName Instance name of the operator - identifying the specific configuration
             * @return the next definition stage
             */
            WithCreate withOperatorInstanceName(String operatorInstanceName);
        }

        /**
         * The stage of the sourcecontrolconfiguration definition allowing to specify OperatorNamespace.
         */
        interface WithOperatorNamespace {
            /**
             * Specifies operatorNamespace.
             * @param operatorNamespace The namespace to which this operator is installed to. Maximum of 253 lower case alphanumeric characters, hyphen and period only
             * @return the next definition stage
             */
            WithCreate withOperatorNamespace(String operatorNamespace);
        }

        /**
         * The stage of the sourcecontrolconfiguration definition allowing to specify OperatorParams.
         */
        interface WithOperatorParams {
            /**
             * Specifies operatorParams.
             * @param operatorParams Any Parameters for the Operator instance in string format
             * @return the next definition stage
             */
            WithCreate withOperatorParams(String operatorParams);
        }

        /**
         * The stage of the sourcecontrolconfiguration definition allowing to specify OperatorScope.
         */
        interface WithOperatorScope {
            /**
             * Specifies operatorScope.
             * @param operatorScope Scope at which the operator will be installed. Possible values include: 'cluster', 'namespace'
             * @return the next definition stage
             */
            WithCreate withOperatorScope(OperatorScope operatorScope);
        }

        /**
         * The stage of the sourcecontrolconfiguration definition allowing to specify OperatorType.
         */
        interface WithOperatorType {
            /**
             * Specifies operatorType.
             * @param operatorType Type of the operator. Possible values include: 'Flux'
             * @return the next definition stage
             */
            WithCreate withOperatorType(OperatorType operatorType);
        }

        /**
         * The stage of the sourcecontrolconfiguration definition allowing to specify RepositoryUrl.
         */
        interface WithRepositoryUrl {
            /**
             * Specifies repositoryUrl.
             * @param repositoryUrl Url of the SourceControl Repository
             * @return the next definition stage
             */
            WithCreate withRepositoryUrl(String repositoryUrl);
        }

        /**
         * The stage of the sourcecontrolconfiguration definition allowing to specify SshKnownHostsContents.
         */
        interface WithSshKnownHostsContents {
            /**
             * Specifies sshKnownHostsContents.
             * @param sshKnownHostsContents Base64-encoded known_hosts contents containing public SSH keys required to access private Git instances
             * @return the next definition stage
             */
            WithCreate withSshKnownHostsContents(String sshKnownHostsContents);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SourceControlConfiguration>, DefinitionStages.WithConfigurationProtectedSettings, DefinitionStages.WithEnableHelmOperator, DefinitionStages.WithHelmOperatorProperties, DefinitionStages.WithOperatorInstanceName, DefinitionStages.WithOperatorNamespace, DefinitionStages.WithOperatorParams, DefinitionStages.WithOperatorScope, DefinitionStages.WithOperatorType, DefinitionStages.WithRepositoryUrl, DefinitionStages.WithSshKnownHostsContents {
        }
    }
    /**
     * The template for a SourceControlConfiguration update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SourceControlConfiguration>, UpdateStages.WithConfigurationProtectedSettings, UpdateStages.WithEnableHelmOperator, UpdateStages.WithHelmOperatorProperties, UpdateStages.WithOperatorInstanceName, UpdateStages.WithOperatorNamespace, UpdateStages.WithOperatorParams, UpdateStages.WithOperatorScope, UpdateStages.WithOperatorType, UpdateStages.WithRepositoryUrl, UpdateStages.WithSshKnownHostsContents {
    }

    /**
     * Grouping of SourceControlConfiguration update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the sourcecontrolconfiguration update allowing to specify ConfigurationProtectedSettings.
         */
        interface WithConfigurationProtectedSettings {
            /**
             * Specifies configurationProtectedSettings.
             * @param configurationProtectedSettings Name-value pairs of protected configuration settings for the configuration
             * @return the next update stage
             */
            Update withConfigurationProtectedSettings(Map<String, String> configurationProtectedSettings);
        }

        /**
         * The stage of the sourcecontrolconfiguration update allowing to specify EnableHelmOperator.
         */
        interface WithEnableHelmOperator {
            /**
             * Specifies enableHelmOperator.
             * @param enableHelmOperator Option to enable Helm Operator for this git configuration. Possible values include: 'true', 'false'
             * @return the next update stage
             */
            Update withEnableHelmOperator(EnableHelmOperator enableHelmOperator);
        }

        /**
         * The stage of the sourcecontrolconfiguration update allowing to specify HelmOperatorProperties.
         */
        interface WithHelmOperatorProperties {
            /**
             * Specifies helmOperatorProperties.
             * @param helmOperatorProperties Properties for Helm operator
             * @return the next update stage
             */
            Update withHelmOperatorProperties(HelmOperatorProperties helmOperatorProperties);
        }

        /**
         * The stage of the sourcecontrolconfiguration update allowing to specify OperatorInstanceName.
         */
        interface WithOperatorInstanceName {
            /**
             * Specifies operatorInstanceName.
             * @param operatorInstanceName Instance name of the operator - identifying the specific configuration
             * @return the next update stage
             */
            Update withOperatorInstanceName(String operatorInstanceName);
        }

        /**
         * The stage of the sourcecontrolconfiguration update allowing to specify OperatorNamespace.
         */
        interface WithOperatorNamespace {
            /**
             * Specifies operatorNamespace.
             * @param operatorNamespace The namespace to which this operator is installed to. Maximum of 253 lower case alphanumeric characters, hyphen and period only
             * @return the next update stage
             */
            Update withOperatorNamespace(String operatorNamespace);
        }

        /**
         * The stage of the sourcecontrolconfiguration update allowing to specify OperatorParams.
         */
        interface WithOperatorParams {
            /**
             * Specifies operatorParams.
             * @param operatorParams Any Parameters for the Operator instance in string format
             * @return the next update stage
             */
            Update withOperatorParams(String operatorParams);
        }

        /**
         * The stage of the sourcecontrolconfiguration update allowing to specify OperatorScope.
         */
        interface WithOperatorScope {
            /**
             * Specifies operatorScope.
             * @param operatorScope Scope at which the operator will be installed. Possible values include: 'cluster', 'namespace'
             * @return the next update stage
             */
            Update withOperatorScope(OperatorScope operatorScope);
        }

        /**
         * The stage of the sourcecontrolconfiguration update allowing to specify OperatorType.
         */
        interface WithOperatorType {
            /**
             * Specifies operatorType.
             * @param operatorType Type of the operator. Possible values include: 'Flux'
             * @return the next update stage
             */
            Update withOperatorType(OperatorType operatorType);
        }

        /**
         * The stage of the sourcecontrolconfiguration update allowing to specify RepositoryUrl.
         */
        interface WithRepositoryUrl {
            /**
             * Specifies repositoryUrl.
             * @param repositoryUrl Url of the SourceControl Repository
             * @return the next update stage
             */
            Update withRepositoryUrl(String repositoryUrl);
        }

        /**
         * The stage of the sourcecontrolconfiguration update allowing to specify SshKnownHostsContents.
         */
        interface WithSshKnownHostsContents {
            /**
             * Specifies sshKnownHostsContents.
             * @param sshKnownHostsContents Base64-encoded known_hosts contents containing public SSH keys required to access private Git instances
             * @return the next update stage
             */
            Update withSshKnownHostsContents(String sshKnownHostsContents);
        }

    }
}
