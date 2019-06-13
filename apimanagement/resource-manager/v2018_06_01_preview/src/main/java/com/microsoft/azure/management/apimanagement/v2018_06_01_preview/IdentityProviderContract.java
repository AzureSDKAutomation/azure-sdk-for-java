/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.IdentityProviderContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.ApiManagementManager;
import java.util.List;

/**
 * Type representing IdentityProviderContract.
 */
public interface IdentityProviderContract extends HasInner<IdentityProviderContractInner>, Indexable, Updatable<IdentityProviderContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the allowedTenants value.
     */
    List<String> allowedTenants();

    /**
     * @return the authority value.
     */
    String authority();

    /**
     * @return the clientId value.
     */
    String clientId();

    /**
     * @return the clientSecret value.
     */
    String clientSecret();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the identityProviderContractType value.
     */
    IdentityProviderType identityProviderContractType();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the passwordResetPolicyName value.
     */
    String passwordResetPolicyName();

    /**
     * @return the profileEditingPolicyName value.
     */
    String profileEditingPolicyName();

    /**
     * @return the signinPolicyName value.
     */
    String signinPolicyName();

    /**
     * @return the signupPolicyName value.
     */
    String signupPolicyName();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the IdentityProviderContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithResourceGroupName, DefinitionStages.WithServiceName, DefinitionStages.WithIfMatch, DefinitionStages.WithClientId, DefinitionStages.WithClientSecret, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of IdentityProviderContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a IdentityProviderContract definition.
         */
        interface Blank extends WithResourceGroupName {
        }

        /**
         * The stage of the identityprovidercontract definition allowing to specify ResourceGroupName.
         */
        interface WithResourceGroupName {
           /**
            * Specifies resourceGroupName.
            * @param resourceGroupName The name of the resource group
            * @return the next definition stage
            */
            WithServiceName withResourceGroupName(String resourceGroupName);
        }

        /**
         * The stage of the identityprovidercontract definition allowing to specify ServiceName.
         */
        interface WithServiceName {
           /**
            * Specifies serviceName.
            * @param serviceName The name of the API Management service
            * @return the next definition stage
            */
            WithIfMatch withServiceName(String serviceName);
        }

        /**
         * The stage of the identityprovidercontract definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
            * @return the next definition stage
            */
            WithClientId withIfMatch(String ifMatch);
        }

        /**
         * The stage of the identityprovidercontract definition allowing to specify ClientId.
         */
        interface WithClientId {
           /**
            * Specifies clientId.
            * @param clientId Client Id of the Application in the external Identity Provider. It is App ID for Facebook login, Client ID for Google login, App ID for Microsoft
            * @return the next definition stage
            */
            WithClientSecret withClientId(String clientId);
        }

        /**
         * The stage of the identityprovidercontract definition allowing to specify ClientSecret.
         */
        interface WithClientSecret {
           /**
            * Specifies clientSecret.
            * @param clientSecret Client secret of the Application in external Identity Provider, used to authenticate login request. For example, it is App Secret for Facebook login, API Key for Google login, Public Key for Microsoft
            * @return the next definition stage
            */
            WithCreate withClientSecret(String clientSecret);
        }

        /**
         * The stage of the identityprovidercontract definition allowing to specify AllowedTenants.
         */
        interface WithAllowedTenants {
            /**
             * Specifies allowedTenants.
             * @param allowedTenants List of Allowed Tenants when configuring Azure Active Directory login
             * @return the next definition stage
             */
            WithCreate withAllowedTenants(List<String> allowedTenants);
        }

        /**
         * The stage of the identityprovidercontract definition allowing to specify Authority.
         */
        interface WithAuthority {
            /**
             * Specifies authority.
             * @param authority OpenID Connect discovery endpoint hostname for AAD or AAD B2C
             * @return the next definition stage
             */
            WithCreate withAuthority(String authority);
        }

        /**
         * The stage of the identityprovidercontract definition allowing to specify IdentityProviderContractType.
         */
        interface WithIdentityProviderContractType {
            /**
             * Specifies identityProviderContractType.
             * @param identityProviderContractType Identity Provider Type identifier. Possible values include: 'facebook', 'google', 'microsoft', 'twitter', 'aad', 'aadB2C'
             * @return the next definition stage
             */
            WithCreate withIdentityProviderContractType(IdentityProviderType identityProviderContractType);
        }

        /**
         * The stage of the identityprovidercontract definition allowing to specify PasswordResetPolicyName.
         */
        interface WithPasswordResetPolicyName {
            /**
             * Specifies passwordResetPolicyName.
             * @param passwordResetPolicyName Password Reset Policy Name. Only applies to AAD B2C Identity Provider
             * @return the next definition stage
             */
            WithCreate withPasswordResetPolicyName(String passwordResetPolicyName);
        }

        /**
         * The stage of the identityprovidercontract definition allowing to specify ProfileEditingPolicyName.
         */
        interface WithProfileEditingPolicyName {
            /**
             * Specifies profileEditingPolicyName.
             * @param profileEditingPolicyName Profile Editing Policy Name. Only applies to AAD B2C Identity Provider
             * @return the next definition stage
             */
            WithCreate withProfileEditingPolicyName(String profileEditingPolicyName);
        }

        /**
         * The stage of the identityprovidercontract definition allowing to specify SigninPolicyName.
         */
        interface WithSigninPolicyName {
            /**
             * Specifies signinPolicyName.
             * @param signinPolicyName Signin Policy Name. Only applies to AAD B2C Identity Provider
             * @return the next definition stage
             */
            WithCreate withSigninPolicyName(String signinPolicyName);
        }

        /**
         * The stage of the identityprovidercontract definition allowing to specify SignupPolicyName.
         */
        interface WithSignupPolicyName {
            /**
             * Specifies signupPolicyName.
             * @param signupPolicyName Signup Policy Name. Only applies to AAD B2C Identity Provider
             * @return the next definition stage
             */
            WithCreate withSignupPolicyName(String signupPolicyName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<IdentityProviderContract>, DefinitionStages.WithAllowedTenants, DefinitionStages.WithAuthority, DefinitionStages.WithIdentityProviderContractType, DefinitionStages.WithPasswordResetPolicyName, DefinitionStages.WithProfileEditingPolicyName, DefinitionStages.WithSigninPolicyName, DefinitionStages.WithSignupPolicyName {
        }
    }
    /**
     * The template for a IdentityProviderContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<IdentityProviderContract>, UpdateStages.WithIfMatch, UpdateStages.WithAllowedTenants, UpdateStages.WithAuthority, UpdateStages.WithIdentityProviderContractType, UpdateStages.WithPasswordResetPolicyName, UpdateStages.WithProfileEditingPolicyName, UpdateStages.WithSigninPolicyName, UpdateStages.WithSignupPolicyName {
    }

    /**
     * Grouping of IdentityProviderContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the identityprovidercontract update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the identityprovidercontract update allowing to specify AllowedTenants.
         */
        interface WithAllowedTenants {
            /**
             * Specifies allowedTenants.
             * @param allowedTenants List of Allowed Tenants when configuring Azure Active Directory login
             * @return the next update stage
             */
            Update withAllowedTenants(List<String> allowedTenants);
        }

        /**
         * The stage of the identityprovidercontract update allowing to specify Authority.
         */
        interface WithAuthority {
            /**
             * Specifies authority.
             * @param authority OpenID Connect discovery endpoint hostname for AAD or AAD B2C
             * @return the next update stage
             */
            Update withAuthority(String authority);
        }

        /**
         * The stage of the identityprovidercontract update allowing to specify IdentityProviderContractType.
         */
        interface WithIdentityProviderContractType {
            /**
             * Specifies identityProviderContractType.
             * @param identityProviderContractType Identity Provider Type identifier. Possible values include: 'facebook', 'google', 'microsoft', 'twitter', 'aad', 'aadB2C'
             * @return the next update stage
             */
            Update withIdentityProviderContractType(IdentityProviderType identityProviderContractType);
        }

        /**
         * The stage of the identityprovidercontract update allowing to specify PasswordResetPolicyName.
         */
        interface WithPasswordResetPolicyName {
            /**
             * Specifies passwordResetPolicyName.
             * @param passwordResetPolicyName Password Reset Policy Name. Only applies to AAD B2C Identity Provider
             * @return the next update stage
             */
            Update withPasswordResetPolicyName(String passwordResetPolicyName);
        }

        /**
         * The stage of the identityprovidercontract update allowing to specify ProfileEditingPolicyName.
         */
        interface WithProfileEditingPolicyName {
            /**
             * Specifies profileEditingPolicyName.
             * @param profileEditingPolicyName Profile Editing Policy Name. Only applies to AAD B2C Identity Provider
             * @return the next update stage
             */
            Update withProfileEditingPolicyName(String profileEditingPolicyName);
        }

        /**
         * The stage of the identityprovidercontract update allowing to specify SigninPolicyName.
         */
        interface WithSigninPolicyName {
            /**
             * Specifies signinPolicyName.
             * @param signinPolicyName Signin Policy Name. Only applies to AAD B2C Identity Provider
             * @return the next update stage
             */
            Update withSigninPolicyName(String signinPolicyName);
        }

        /**
         * The stage of the identityprovidercontract update allowing to specify SignupPolicyName.
         */
        interface WithSignupPolicyName {
            /**
             * Specifies signupPolicyName.
             * @param signupPolicyName Signup Policy Name. Only applies to AAD B2C Identity Provider
             * @return the next update stage
             */
            Update withSignupPolicyName(String signupPolicyName);
        }

    }
}
