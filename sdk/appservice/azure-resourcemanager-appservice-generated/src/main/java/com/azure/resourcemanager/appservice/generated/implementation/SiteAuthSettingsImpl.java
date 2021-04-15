// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appservice.generated.fluent.models.SiteAuthSettingsInner;
import com.azure.resourcemanager.appservice.generated.models.BuiltInAuthenticationProvider;
import com.azure.resourcemanager.appservice.generated.models.SiteAuthSettings;
import com.azure.resourcemanager.appservice.generated.models.UnauthenticatedClientAction;
import java.util.Collections;
import java.util.List;

public final class SiteAuthSettingsImpl implements SiteAuthSettings {
    private SiteAuthSettingsInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    SiteAuthSettingsImpl(
        SiteAuthSettingsInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Boolean enabled() {
        return this.innerModel().enabled();
    }

    public String runtimeVersion() {
        return this.innerModel().runtimeVersion();
    }

    public UnauthenticatedClientAction unauthenticatedClientAction() {
        return this.innerModel().unauthenticatedClientAction();
    }

    public Boolean tokenStoreEnabled() {
        return this.innerModel().tokenStoreEnabled();
    }

    public List<String> allowedExternalRedirectUrls() {
        List<String> inner = this.innerModel().allowedExternalRedirectUrls();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public BuiltInAuthenticationProvider defaultProvider() {
        return this.innerModel().defaultProvider();
    }

    public Double tokenRefreshExtensionHours() {
        return this.innerModel().tokenRefreshExtensionHours();
    }

    public String clientId() {
        return this.innerModel().clientId();
    }

    public String clientSecret() {
        return this.innerModel().clientSecret();
    }

    public String clientSecretSettingName() {
        return this.innerModel().clientSecretSettingName();
    }

    public String clientSecretCertificateThumbprint() {
        return this.innerModel().clientSecretCertificateThumbprint();
    }

    public String issuer() {
        return this.innerModel().issuer();
    }

    public Boolean validateIssuer() {
        return this.innerModel().validateIssuer();
    }

    public List<String> allowedAudiences() {
        List<String> inner = this.innerModel().allowedAudiences();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> additionalLoginParams() {
        List<String> inner = this.innerModel().additionalLoginParams();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String aadClaimsAuthorization() {
        return this.innerModel().aadClaimsAuthorization();
    }

    public String googleClientId() {
        return this.innerModel().googleClientId();
    }

    public String googleClientSecret() {
        return this.innerModel().googleClientSecret();
    }

    public String googleClientSecretSettingName() {
        return this.innerModel().googleClientSecretSettingName();
    }

    public List<String> googleOAuthScopes() {
        List<String> inner = this.innerModel().googleOAuthScopes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String facebookAppId() {
        return this.innerModel().facebookAppId();
    }

    public String facebookAppSecret() {
        return this.innerModel().facebookAppSecret();
    }

    public String facebookAppSecretSettingName() {
        return this.innerModel().facebookAppSecretSettingName();
    }

    public List<String> facebookOAuthScopes() {
        List<String> inner = this.innerModel().facebookOAuthScopes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String gitHubClientId() {
        return this.innerModel().gitHubClientId();
    }

    public String gitHubClientSecret() {
        return this.innerModel().gitHubClientSecret();
    }

    public String gitHubClientSecretSettingName() {
        return this.innerModel().gitHubClientSecretSettingName();
    }

    public List<String> gitHubOAuthScopes() {
        List<String> inner = this.innerModel().gitHubOAuthScopes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String twitterConsumerKey() {
        return this.innerModel().twitterConsumerKey();
    }

    public String twitterConsumerSecret() {
        return this.innerModel().twitterConsumerSecret();
    }

    public String twitterConsumerSecretSettingName() {
        return this.innerModel().twitterConsumerSecretSettingName();
    }

    public String microsoftAccountClientId() {
        return this.innerModel().microsoftAccountClientId();
    }

    public String microsoftAccountClientSecret() {
        return this.innerModel().microsoftAccountClientSecret();
    }

    public String microsoftAccountClientSecretSettingName() {
        return this.innerModel().microsoftAccountClientSecretSettingName();
    }

    public List<String> microsoftAccountOAuthScopes() {
        List<String> inner = this.innerModel().microsoftAccountOAuthScopes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String isAuthFromFile() {
        return this.innerModel().isAuthFromFile();
    }

    public String authFilePath() {
        return this.innerModel().authFilePath();
    }

    public SiteAuthSettingsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
