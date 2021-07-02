// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iothub.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.iothub.fluent.models.SharedAccessSignatureAuthorizationRuleInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The properties of an IoT hub. */
@Fluent
public final class IotHubProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotHubProperties.class);

    /*
     * The shared access policies you can use to secure a connection to the IoT
     * hub.
     */
    @JsonProperty(value = "authorizationPolicies")
    private List<SharedAccessSignatureAuthorizationRuleInner> authorizationPolicies;

    /*
     * If true, SAS tokens with Iot hub scoped SAS keys cannot be used for
     * authentication.
     */
    @JsonProperty(value = "disableLocalAuth")
    private Boolean disableLocalAuth;

    /*
     * If true, all device(including Edge devices but excluding modules) scoped
     * SAS keys cannot be used for authentication.
     */
    @JsonProperty(value = "disableDeviceSAS")
    private Boolean disableDeviceSas;

    /*
     * If true, all module scoped SAS keys cannot be used for authentication.
     */
    @JsonProperty(value = "disableModuleSAS")
    private Boolean disableModuleSas;

    /*
     * If true, egress from IotHub will be restricted to only the allowed FQDNs
     * that are configured via allowedFqdnList.
     */
    @JsonProperty(value = "restrictOutboundNetworkAccess")
    private Boolean restrictOutboundNetworkAccess;

    /*
     * List of allowed FQDNs(Fully Qualified Domain Name) for egress from Iot
     * Hub.
     */
    @JsonProperty(value = "allowedFqdnList")
    private List<String> allowedFqdnList;

    /*
     * Whether requests from Public Network are allowed
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * The IP filter rules.
     */
    @JsonProperty(value = "ipFilterRules")
    private List<IpFilterRule> ipFilterRules;

    /*
     * Network Rule Set Properties of IotHub
     */
    @JsonProperty(value = "networkRuleSets")
    private NetworkRuleSetProperties networkRuleSets;

    /*
     * Specifies the minimum TLS version to support for this hub. Can be set to
     * "1.2" to have clients that use a TLS version below 1.2 to be rejected.
     */
    @JsonProperty(value = "minTlsVersion")
    private String minTlsVersion;

    /*
     * Private endpoint connections created on this IotHub
     */
    @JsonProperty(value = "privateEndpointConnections")
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * The provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The hub state.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /*
     * The name of the host.
     */
    @JsonProperty(value = "hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /*
     * The Event Hub-compatible endpoint properties. The only possible keys to
     * this dictionary is events. This key has to be present in the dictionary
     * while making create or update calls for the IoT hub.
     */
    @JsonProperty(value = "eventHubEndpoints")
    private Map<String, EventHubProperties> eventHubEndpoints;

    /*
     * The routing related properties of the IoT hub. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging
     */
    @JsonProperty(value = "routing")
    private RoutingProperties routing;

    /*
     * The list of Azure Storage endpoints where you can upload files.
     * Currently you can configure only one Azure Storage account and that MUST
     * have its key as $default. Specifying more than one storage account
     * causes an error to be thrown. Not specifying a value for this property
     * when the enableFileUploadNotifications property is set to True, causes
     * an error to be thrown.
     */
    @JsonProperty(value = "storageEndpoints")
    private Map<String, StorageEndpointProperties> storageEndpoints;

    /*
     * The messaging endpoint properties for the file upload notification
     * queue.
     */
    @JsonProperty(value = "messagingEndpoints")
    private Map<String, MessagingEndpointProperties> messagingEndpoints;

    /*
     * If True, file upload notifications are enabled.
     */
    @JsonProperty(value = "enableFileUploadNotifications")
    private Boolean enableFileUploadNotifications;

    /*
     * The IoT hub cloud-to-device messaging properties.
     */
    @JsonProperty(value = "cloudToDevice")
    private CloudToDeviceProperties cloudToDevice;

    /*
     * IoT hub comments.
     */
    @JsonProperty(value = "comments")
    private String comments;

    /*
     * The device streams properties of iothub.
     */
    @JsonProperty(value = "deviceStreams")
    private IotHubPropertiesDeviceStreams deviceStreams;

    /*
     * The capabilities and features enabled for the IoT hub.
     */
    @JsonProperty(value = "features")
    private Capabilities features;

    /*
     * The encryption properties for the IoT hub.
     */
    @JsonProperty(value = "encryption")
    private EncryptionPropertiesDescription encryption;

    /*
     * Primary and secondary location for iot hub
     */
    @JsonProperty(value = "locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<IotHubLocationDescription> locations;

    /**
     * Get the authorizationPolicies property: The shared access policies you can use to secure a connection to the IoT
     * hub.
     *
     * @return the authorizationPolicies value.
     */
    public List<SharedAccessSignatureAuthorizationRuleInner> authorizationPolicies() {
        return this.authorizationPolicies;
    }

    /**
     * Set the authorizationPolicies property: The shared access policies you can use to secure a connection to the IoT
     * hub.
     *
     * @param authorizationPolicies the authorizationPolicies value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withAuthorizationPolicies(
        List<SharedAccessSignatureAuthorizationRuleInner> authorizationPolicies) {
        this.authorizationPolicies = authorizationPolicies;
        return this;
    }

    /**
     * Get the disableLocalAuth property: If true, SAS tokens with Iot hub scoped SAS keys cannot be used for
     * authentication.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: If true, SAS tokens with Iot hub scoped SAS keys cannot be used for
     * authentication.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
        return this;
    }

    /**
     * Get the disableDeviceSas property: If true, all device(including Edge devices but excluding modules) scoped SAS
     * keys cannot be used for authentication.
     *
     * @return the disableDeviceSas value.
     */
    public Boolean disableDeviceSas() {
        return this.disableDeviceSas;
    }

    /**
     * Set the disableDeviceSas property: If true, all device(including Edge devices but excluding modules) scoped SAS
     * keys cannot be used for authentication.
     *
     * @param disableDeviceSas the disableDeviceSas value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withDisableDeviceSas(Boolean disableDeviceSas) {
        this.disableDeviceSas = disableDeviceSas;
        return this;
    }

    /**
     * Get the disableModuleSas property: If true, all module scoped SAS keys cannot be used for authentication.
     *
     * @return the disableModuleSas value.
     */
    public Boolean disableModuleSas() {
        return this.disableModuleSas;
    }

    /**
     * Set the disableModuleSas property: If true, all module scoped SAS keys cannot be used for authentication.
     *
     * @param disableModuleSas the disableModuleSas value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withDisableModuleSas(Boolean disableModuleSas) {
        this.disableModuleSas = disableModuleSas;
        return this;
    }

    /**
     * Get the restrictOutboundNetworkAccess property: If true, egress from IotHub will be restricted to only the
     * allowed FQDNs that are configured via allowedFqdnList.
     *
     * @return the restrictOutboundNetworkAccess value.
     */
    public Boolean restrictOutboundNetworkAccess() {
        return this.restrictOutboundNetworkAccess;
    }

    /**
     * Set the restrictOutboundNetworkAccess property: If true, egress from IotHub will be restricted to only the
     * allowed FQDNs that are configured via allowedFqdnList.
     *
     * @param restrictOutboundNetworkAccess the restrictOutboundNetworkAccess value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withRestrictOutboundNetworkAccess(Boolean restrictOutboundNetworkAccess) {
        this.restrictOutboundNetworkAccess = restrictOutboundNetworkAccess;
        return this;
    }

    /**
     * Get the allowedFqdnList property: List of allowed FQDNs(Fully Qualified Domain Name) for egress from Iot Hub.
     *
     * @return the allowedFqdnList value.
     */
    public List<String> allowedFqdnList() {
        return this.allowedFqdnList;
    }

    /**
     * Set the allowedFqdnList property: List of allowed FQDNs(Fully Qualified Domain Name) for egress from Iot Hub.
     *
     * @param allowedFqdnList the allowedFqdnList value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withAllowedFqdnList(List<String> allowedFqdnList) {
        this.allowedFqdnList = allowedFqdnList;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether requests from Public Network are allowed.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether requests from Public Network are allowed.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the ipFilterRules property: The IP filter rules.
     *
     * @return the ipFilterRules value.
     */
    public List<IpFilterRule> ipFilterRules() {
        return this.ipFilterRules;
    }

    /**
     * Set the ipFilterRules property: The IP filter rules.
     *
     * @param ipFilterRules the ipFilterRules value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withIpFilterRules(List<IpFilterRule> ipFilterRules) {
        this.ipFilterRules = ipFilterRules;
        return this;
    }

    /**
     * Get the networkRuleSets property: Network Rule Set Properties of IotHub.
     *
     * @return the networkRuleSets value.
     */
    public NetworkRuleSetProperties networkRuleSets() {
        return this.networkRuleSets;
    }

    /**
     * Set the networkRuleSets property: Network Rule Set Properties of IotHub.
     *
     * @param networkRuleSets the networkRuleSets value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withNetworkRuleSets(NetworkRuleSetProperties networkRuleSets) {
        this.networkRuleSets = networkRuleSets;
        return this;
    }

    /**
     * Get the minTlsVersion property: Specifies the minimum TLS version to support for this hub. Can be set to "1.2" to
     * have clients that use a TLS version below 1.2 to be rejected.
     *
     * @return the minTlsVersion value.
     */
    public String minTlsVersion() {
        return this.minTlsVersion;
    }

    /**
     * Set the minTlsVersion property: Specifies the minimum TLS version to support for this hub. Can be set to "1.2" to
     * have clients that use a TLS version below 1.2 to be rejected.
     *
     * @param minTlsVersion the minTlsVersion value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withMinTlsVersion(String minTlsVersion) {
        this.minTlsVersion = minTlsVersion;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: Private endpoint connections created on this IotHub.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Set the privateEndpointConnections property: Private endpoint connections created on this IotHub.
     *
     * @param privateEndpointConnections the privateEndpointConnections value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withPrivateEndpointConnections(
        List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.privateEndpointConnections = privateEndpointConnections;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the state property: The hub state.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Get the hostname property: The name of the host.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get the eventHubEndpoints property: The Event Hub-compatible endpoint properties. The only possible keys to this
     * dictionary is events. This key has to be present in the dictionary while making create or update calls for the
     * IoT hub.
     *
     * @return the eventHubEndpoints value.
     */
    public Map<String, EventHubProperties> eventHubEndpoints() {
        return this.eventHubEndpoints;
    }

    /**
     * Set the eventHubEndpoints property: The Event Hub-compatible endpoint properties. The only possible keys to this
     * dictionary is events. This key has to be present in the dictionary while making create or update calls for the
     * IoT hub.
     *
     * @param eventHubEndpoints the eventHubEndpoints value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withEventHubEndpoints(Map<String, EventHubProperties> eventHubEndpoints) {
        this.eventHubEndpoints = eventHubEndpoints;
        return this;
    }

    /**
     * Get the routing property: The routing related properties of the IoT hub. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging.
     *
     * @return the routing value.
     */
    public RoutingProperties routing() {
        return this.routing;
    }

    /**
     * Set the routing property: The routing related properties of the IoT hub. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging.
     *
     * @param routing the routing value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withRouting(RoutingProperties routing) {
        this.routing = routing;
        return this;
    }

    /**
     * Get the storageEndpoints property: The list of Azure Storage endpoints where you can upload files. Currently you
     * can configure only one Azure Storage account and that MUST have its key as $default. Specifying more than one
     * storage account causes an error to be thrown. Not specifying a value for this property when the
     * enableFileUploadNotifications property is set to True, causes an error to be thrown.
     *
     * @return the storageEndpoints value.
     */
    public Map<String, StorageEndpointProperties> storageEndpoints() {
        return this.storageEndpoints;
    }

    /**
     * Set the storageEndpoints property: The list of Azure Storage endpoints where you can upload files. Currently you
     * can configure only one Azure Storage account and that MUST have its key as $default. Specifying more than one
     * storage account causes an error to be thrown. Not specifying a value for this property when the
     * enableFileUploadNotifications property is set to True, causes an error to be thrown.
     *
     * @param storageEndpoints the storageEndpoints value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withStorageEndpoints(Map<String, StorageEndpointProperties> storageEndpoints) {
        this.storageEndpoints = storageEndpoints;
        return this;
    }

    /**
     * Get the messagingEndpoints property: The messaging endpoint properties for the file upload notification queue.
     *
     * @return the messagingEndpoints value.
     */
    public Map<String, MessagingEndpointProperties> messagingEndpoints() {
        return this.messagingEndpoints;
    }

    /**
     * Set the messagingEndpoints property: The messaging endpoint properties for the file upload notification queue.
     *
     * @param messagingEndpoints the messagingEndpoints value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withMessagingEndpoints(Map<String, MessagingEndpointProperties> messagingEndpoints) {
        this.messagingEndpoints = messagingEndpoints;
        return this;
    }

    /**
     * Get the enableFileUploadNotifications property: If True, file upload notifications are enabled.
     *
     * @return the enableFileUploadNotifications value.
     */
    public Boolean enableFileUploadNotifications() {
        return this.enableFileUploadNotifications;
    }

    /**
     * Set the enableFileUploadNotifications property: If True, file upload notifications are enabled.
     *
     * @param enableFileUploadNotifications the enableFileUploadNotifications value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withEnableFileUploadNotifications(Boolean enableFileUploadNotifications) {
        this.enableFileUploadNotifications = enableFileUploadNotifications;
        return this;
    }

    /**
     * Get the cloudToDevice property: The IoT hub cloud-to-device messaging properties.
     *
     * @return the cloudToDevice value.
     */
    public CloudToDeviceProperties cloudToDevice() {
        return this.cloudToDevice;
    }

    /**
     * Set the cloudToDevice property: The IoT hub cloud-to-device messaging properties.
     *
     * @param cloudToDevice the cloudToDevice value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withCloudToDevice(CloudToDeviceProperties cloudToDevice) {
        this.cloudToDevice = cloudToDevice;
        return this;
    }

    /**
     * Get the comments property: IoT hub comments.
     *
     * @return the comments value.
     */
    public String comments() {
        return this.comments;
    }

    /**
     * Set the comments property: IoT hub comments.
     *
     * @param comments the comments value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Get the deviceStreams property: The device streams properties of iothub.
     *
     * @return the deviceStreams value.
     */
    public IotHubPropertiesDeviceStreams deviceStreams() {
        return this.deviceStreams;
    }

    /**
     * Set the deviceStreams property: The device streams properties of iothub.
     *
     * @param deviceStreams the deviceStreams value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withDeviceStreams(IotHubPropertiesDeviceStreams deviceStreams) {
        this.deviceStreams = deviceStreams;
        return this;
    }

    /**
     * Get the features property: The capabilities and features enabled for the IoT hub.
     *
     * @return the features value.
     */
    public Capabilities features() {
        return this.features;
    }

    /**
     * Set the features property: The capabilities and features enabled for the IoT hub.
     *
     * @param features the features value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withFeatures(Capabilities features) {
        this.features = features;
        return this;
    }

    /**
     * Get the encryption property: The encryption properties for the IoT hub.
     *
     * @return the encryption value.
     */
    public EncryptionPropertiesDescription encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: The encryption properties for the IoT hub.
     *
     * @param encryption the encryption value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withEncryption(EncryptionPropertiesDescription encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the locations property: Primary and secondary location for iot hub.
     *
     * @return the locations value.
     */
    public List<IotHubLocationDescription> locations() {
        return this.locations;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (authorizationPolicies() != null) {
            authorizationPolicies().forEach(e -> e.validate());
        }
        if (ipFilterRules() != null) {
            ipFilterRules().forEach(e -> e.validate());
        }
        if (networkRuleSets() != null) {
            networkRuleSets().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (eventHubEndpoints() != null) {
            eventHubEndpoints()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (routing() != null) {
            routing().validate();
        }
        if (storageEndpoints() != null) {
            storageEndpoints()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (messagingEndpoints() != null) {
            messagingEndpoints()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (cloudToDevice() != null) {
            cloudToDevice().validate();
        }
        if (deviceStreams() != null) {
            deviceStreams().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (locations() != null) {
            locations().forEach(e -> e.validate());
        }
    }
}
