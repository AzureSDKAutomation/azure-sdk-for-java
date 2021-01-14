// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.CertificateInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Certificate. */
public interface Certificate {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the friendlyName property: Friendly name of the certificate.
     *
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * Gets the subjectName property: Subject name of the certificate.
     *
     * @return the subjectName value.
     */
    String subjectName();

    /**
     * Gets the hostNames property: Host names the certificate applies to.
     *
     * @return the hostNames value.
     */
    List<String> hostNames();

    /**
     * Gets the pfxBlob property: Pfx blob.
     *
     * @return the pfxBlob value.
     */
    byte[] pfxBlob();

    /**
     * Gets the siteName property: App name.
     *
     * @return the siteName value.
     */
    String siteName();

    /**
     * Gets the selfLink property: Self link.
     *
     * @return the selfLink value.
     */
    String selfLink();

    /**
     * Gets the issuer property: Certificate issuer.
     *
     * @return the issuer value.
     */
    String issuer();

    /**
     * Gets the issueDate property: Certificate issue Date.
     *
     * @return the issueDate value.
     */
    OffsetDateTime issueDate();

    /**
     * Gets the expirationDate property: Certificate expiration date.
     *
     * @return the expirationDate value.
     */
    OffsetDateTime expirationDate();

    /**
     * Gets the password property: Certificate password.
     *
     * @return the password value.
     */
    String password();

    /**
     * Gets the thumbprint property: Certificate thumbprint.
     *
     * @return the thumbprint value.
     */
    String thumbprint();

    /**
     * Gets the valid property: Is the certificate valid?.
     *
     * @return the valid value.
     */
    Boolean valid();

    /**
     * Gets the cerBlob property: Raw bytes of .cer file.
     *
     * @return the cerBlob value.
     */
    byte[] cerBlob();

    /**
     * Gets the publicKeyHash property: Public key hash.
     *
     * @return the publicKeyHash value.
     */
    String publicKeyHash();

    /**
     * Gets the hostingEnvironmentProfile property: Specification for the App Service Environment to use for the
     * certificate.
     *
     * @return the hostingEnvironmentProfile value.
     */
    HostingEnvironmentProfile hostingEnvironmentProfile();

    /**
     * Gets the keyVaultId property: Key Vault Csm resource Id.
     *
     * @return the keyVaultId value.
     */
    String keyVaultId();

    /**
     * Gets the keyVaultSecretName property: Key Vault secret name.
     *
     * @return the keyVaultSecretName value.
     */
    String keyVaultSecretName();

    /**
     * Gets the keyVaultSecretStatus property: Status of the Key Vault secret.
     *
     * @return the keyVaultSecretStatus value.
     */
    KeyVaultSecretStatus keyVaultSecretStatus();

    /**
     * Gets the serverFarmId property: Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms"
         + "/{appServicePlanName}".
     *
     * @return the serverFarmId value.
     */
    String serverFarmId();

    /**
     * Gets the canonicalName property: CNAME of the certificate to be issued via free certificate.
     *
     * @return the canonicalName value.
     */
    String canonicalName();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.CertificateInner object.
     *
     * @return the inner object.
     */
    CertificateInner innerModel();

    /** The entirety of the Certificate definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Certificate definition stages. */
    interface DefinitionStages {
        /** The first stage of the Certificate definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Certificate definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the Certificate definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName Name of the resource group to which the resource belongs.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Certificate definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithHostNames,
                DefinitionStages.WithPfxBlob,
                DefinitionStages.WithPassword,
                DefinitionStages.WithKeyVaultId,
                DefinitionStages.WithKeyVaultSecretName,
                DefinitionStages.WithServerFarmId,
                DefinitionStages.WithCanonicalName,
                DefinitionStages.WithKind {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Certificate create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Certificate create(Context context);
        }
        /** The stage of the Certificate definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Certificate definition allowing to specify hostNames. */
        interface WithHostNames {
            /**
             * Specifies the hostNames property: Host names the certificate applies to..
             *
             * @param hostNames Host names the certificate applies to.
             * @return the next definition stage.
             */
            WithCreate withHostNames(List<String> hostNames);
        }
        /** The stage of the Certificate definition allowing to specify pfxBlob. */
        interface WithPfxBlob {
            /**
             * Specifies the pfxBlob property: Pfx blob..
             *
             * @param pfxBlob Pfx blob.
             * @return the next definition stage.
             */
            WithCreate withPfxBlob(byte[] pfxBlob);
        }
        /** The stage of the Certificate definition allowing to specify password. */
        interface WithPassword {
            /**
             * Specifies the password property: Certificate password..
             *
             * @param password Certificate password.
             * @return the next definition stage.
             */
            WithCreate withPassword(String password);
        }
        /** The stage of the Certificate definition allowing to specify keyVaultId. */
        interface WithKeyVaultId {
            /**
             * Specifies the keyVaultId property: Key Vault Csm resource Id..
             *
             * @param keyVaultId Key Vault Csm resource Id.
             * @return the next definition stage.
             */
            WithCreate withKeyVaultId(String keyVaultId);
        }
        /** The stage of the Certificate definition allowing to specify keyVaultSecretName. */
        interface WithKeyVaultSecretName {
            /**
             * Specifies the keyVaultSecretName property: Key Vault secret name..
             *
             * @param keyVaultSecretName Key Vault secret name.
             * @return the next definition stage.
             */
            WithCreate withKeyVaultSecretName(String keyVaultSecretName);
        }
        /** The stage of the Certificate definition allowing to specify serverFarmId. */
        interface WithServerFarmId {
            /**
             * Specifies the serverFarmId property: Resource ID of the associated App Service plan, formatted as:
             * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms"
                 + "/{appServicePlanName}"..
             *
             * @param serverFarmId Resource ID of the associated App Service plan, formatted as:
             *     "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms"
                 + "/{appServicePlanName}".
             * @return the next definition stage.
             */
            WithCreate withServerFarmId(String serverFarmId);
        }
        /** The stage of the Certificate definition allowing to specify canonicalName. */
        interface WithCanonicalName {
            /**
             * Specifies the canonicalName property: CNAME of the certificate to be issued via free certificate.
             *
             * @param canonicalName CNAME of the certificate to be issued via free certificate.
             * @return the next definition stage.
             */
            WithCreate withCanonicalName(String canonicalName);
        }
        /** The stage of the Certificate definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }
    }
    /**
     * Begins update for the Certificate resource.
     *
     * @return the stage of resource update.
     */
    Certificate.Update update();

    /** The template for Certificate update. */
    interface Update
        extends UpdateStages.WithKind,
            UpdateStages.WithHostNames,
            UpdateStages.WithPfxBlob,
            UpdateStages.WithPassword,
            UpdateStages.WithKeyVaultId,
            UpdateStages.WithKeyVaultSecretName,
            UpdateStages.WithServerFarmId,
            UpdateStages.WithCanonicalName {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Certificate apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Certificate apply(Context context);
    }
    /** The Certificate update stages. */
    interface UpdateStages {
        /** The stage of the Certificate update allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }
        /** The stage of the Certificate update allowing to specify hostNames. */
        interface WithHostNames {
            /**
             * Specifies the hostNames property: Host names the certificate applies to..
             *
             * @param hostNames Host names the certificate applies to.
             * @return the next definition stage.
             */
            Update withHostNames(List<String> hostNames);
        }
        /** The stage of the Certificate update allowing to specify pfxBlob. */
        interface WithPfxBlob {
            /**
             * Specifies the pfxBlob property: Pfx blob..
             *
             * @param pfxBlob Pfx blob.
             * @return the next definition stage.
             */
            Update withPfxBlob(byte[] pfxBlob);
        }
        /** The stage of the Certificate update allowing to specify password. */
        interface WithPassword {
            /**
             * Specifies the password property: Certificate password..
             *
             * @param password Certificate password.
             * @return the next definition stage.
             */
            Update withPassword(String password);
        }
        /** The stage of the Certificate update allowing to specify keyVaultId. */
        interface WithKeyVaultId {
            /**
             * Specifies the keyVaultId property: Key Vault Csm resource Id..
             *
             * @param keyVaultId Key Vault Csm resource Id.
             * @return the next definition stage.
             */
            Update withKeyVaultId(String keyVaultId);
        }
        /** The stage of the Certificate update allowing to specify keyVaultSecretName. */
        interface WithKeyVaultSecretName {
            /**
             * Specifies the keyVaultSecretName property: Key Vault secret name..
             *
             * @param keyVaultSecretName Key Vault secret name.
             * @return the next definition stage.
             */
            Update withKeyVaultSecretName(String keyVaultSecretName);
        }
        /** The stage of the Certificate update allowing to specify serverFarmId. */
        interface WithServerFarmId {
            /**
             * Specifies the serverFarmId property: Resource ID of the associated App Service plan, formatted as:
             * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms"
                 + "/{appServicePlanName}"..
             *
             * @param serverFarmId Resource ID of the associated App Service plan, formatted as:
             *     "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms"
                 + "/{appServicePlanName}".
             * @return the next definition stage.
             */
            Update withServerFarmId(String serverFarmId);
        }
        /** The stage of the Certificate update allowing to specify canonicalName. */
        interface WithCanonicalName {
            /**
             * Specifies the canonicalName property: CNAME of the certificate to be issued via free certificate.
             *
             * @param canonicalName CNAME of the certificate to be issued via free certificate.
             * @return the next definition stage.
             */
            Update withCanonicalName(String canonicalName);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Certificate refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Certificate refresh(Context context);
}
