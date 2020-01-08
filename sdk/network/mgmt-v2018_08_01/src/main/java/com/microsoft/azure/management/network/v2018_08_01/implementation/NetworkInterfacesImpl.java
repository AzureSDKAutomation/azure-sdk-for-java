/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.network.v2018_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2018_08_01.NetworkInterfaces;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.network.v2018_08_01.NetworkInterface;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.network.v2018_08_01.EffectiveRouteListResult;
import com.microsoft.azure.management.network.v2018_08_01.EffectiveNetworkSecurityGroupListResult;
import com.microsoft.azure.management.network.v2018_08_01.LoadBalancerNetworkInterface;
import com.microsoft.azure.management.network.v2018_08_01.VirtualMachineScaleSetNetworkInterfaceIPConfiguration;

class NetworkInterfacesImpl extends WrapperImpl<NetworkInterfacesInner> implements NetworkInterfaces {
    private final NetworkManager manager;

    NetworkInterfacesImpl(NetworkManager manager) {
        super(manager.inner().networkInterfaces());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public NetworkInterfaceImpl defineNetworkInterface(String name) {
        return wrapNetworkInterfaceModel(name);
    }

    private NetworkInterfaceImpl wrapNetworkInterfaceModel(String name) {
        return new NetworkInterfaceImpl(name, new NetworkInterfaceInner(), this.manager());
    }

    private NetworkInterfaceImpl wrapNetworkInterfaceModel(NetworkInterfaceInner inner) {
        return  new NetworkInterfaceImpl(inner.name(), inner, manager());
    }

    private VirtualMachineScaleSetNetworkInterfaceIPConfigurationImpl wrapVirtualMachineScaleSetNetworkInterfaceIPConfigurationModel(NetworkInterfaceIPConfigurationInner inner) {
        return  new VirtualMachineScaleSetNetworkInterfaceIPConfigurationImpl(inner, manager());
    }

    private Observable<NetworkInterfaceInner> getNetworkInterfaceInnerUsingNetworkInterfacesInnerAsync(String resourceGroupName, String name) {
        NetworkInterfacesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    private Observable<NetworkInterfaceIPConfigurationInner> getNetworkInterfaceIPConfigurationInnerUsingNetworkInterfacesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String virtualMachineScaleSetName = IdParsingUtils.getValueFromIdByName(id, "virtualMachineScaleSets");
        String virtualmachineIndex = IdParsingUtils.getValueFromIdByName(id, "virtualMachines");
        String networkInterfaceName = IdParsingUtils.getValueFromIdByName(id, "networkInterfaces");
        String ipConfigurationName = IdParsingUtils.getValueFromIdByName(id, "ipConfigurations");
        NetworkInterfacesInner client = this.inner();
        return client.getVirtualMachineScaleSetIpConfigurationAsync(resourceGroupName, virtualMachineScaleSetName, virtualmachineIndex, networkInterfaceName, ipConfigurationName);
    }

    @Override
    public Observable<NetworkInterface> getByResourceGroupAsync(String resourceGroupName, String name) {
        return this.getNetworkInterfaceInnerUsingNetworkInterfacesInnerAsync(resourceGroupName, name).flatMap(new Func1<NetworkInterfaceInner, Observable<NetworkInterface>> () {
            @Override
            public Observable<NetworkInterface> call(NetworkInterfaceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return  Observable.just((NetworkInterface)wrapNetworkInterfaceModel(inner));
                }
            }
        });
    }

    @Override
    public Observable<NetworkInterface> listByResourceGroupAsync(String resourceGroupName) {
        NetworkInterfacesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<NetworkInterfaceInner>, Iterable<NetworkInterfaceInner>>() {
            @Override
            public Iterable<NetworkInterfaceInner> call(Page<NetworkInterfaceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NetworkInterfaceInner, NetworkInterface>() {
            @Override
            public NetworkInterface call(NetworkInterfaceInner inner) {
                return wrapNetworkInterfaceModel(inner);
            }
        });
    }

    @Override
    public Observable<NetworkInterface> listAsync() {
        NetworkInterfacesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<NetworkInterfaceInner>, Iterable<NetworkInterfaceInner>>() {
            @Override
            public Iterable<NetworkInterfaceInner> call(Page<NetworkInterfaceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NetworkInterfaceInner, NetworkInterface>() {
            @Override
            public NetworkInterface call(NetworkInterfaceInner inner) {
                return wrapNetworkInterfaceModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String name) {
        return this.inner().deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<EffectiveRouteListResult> getEffectiveRouteTableAsync(String resourceGroupName, String networkInterfaceName) {
        NetworkInterfacesInner client = this.inner();
        return client.getEffectiveRouteTableAsync(resourceGroupName, networkInterfaceName)
        .map(new Func1<EffectiveRouteListResultInner, EffectiveRouteListResult>() {
            @Override
            public EffectiveRouteListResult call(EffectiveRouteListResultInner inner) {
                return new EffectiveRouteListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EffectiveNetworkSecurityGroupListResult> listEffectiveNetworkSecurityGroupsAsync(String resourceGroupName, String networkInterfaceName) {
        NetworkInterfacesInner client = this.inner();
        return client.listEffectiveNetworkSecurityGroupsAsync(resourceGroupName, networkInterfaceName)
        .map(new Func1<EffectiveNetworkSecurityGroupListResultInner, EffectiveNetworkSecurityGroupListResult>() {
            @Override
            public EffectiveNetworkSecurityGroupListResult call(EffectiveNetworkSecurityGroupListResultInner inner) {
                return new EffectiveNetworkSecurityGroupListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<LoadBalancerNetworkInterface> listVirtualMachineScaleSetVMNetworkInterfacesAsync(final String resourceGroupName, final String virtualMachineScaleSetName, final String virtualmachineIndex) {
        NetworkInterfacesInner client = this.inner();
        return client.listVirtualMachineScaleSetVMNetworkInterfacesAsync(resourceGroupName, virtualMachineScaleSetName, virtualmachineIndex)
        .flatMapIterable(new Func1<Page<NetworkInterfaceInner>, Iterable<NetworkInterfaceInner>>() {
            @Override
            public Iterable<NetworkInterfaceInner> call(Page<NetworkInterfaceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NetworkInterfaceInner, LoadBalancerNetworkInterface>() {
            @Override
            public LoadBalancerNetworkInterface call(NetworkInterfaceInner inner) {
                return new LoadBalancerNetworkInterfaceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<LoadBalancerNetworkInterface> listVirtualMachineScaleSetNetworkInterfacesAsync(final String resourceGroupName, final String virtualMachineScaleSetName) {
        NetworkInterfacesInner client = this.inner();
        return client.listVirtualMachineScaleSetNetworkInterfacesAsync(resourceGroupName, virtualMachineScaleSetName)
        .flatMapIterable(new Func1<Page<NetworkInterfaceInner>, Iterable<NetworkInterfaceInner>>() {
            @Override
            public Iterable<NetworkInterfaceInner> call(Page<NetworkInterfaceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NetworkInterfaceInner, LoadBalancerNetworkInterface>() {
            @Override
            public LoadBalancerNetworkInterface call(NetworkInterfaceInner inner) {
                return new LoadBalancerNetworkInterfaceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<LoadBalancerNetworkInterface> getVirtualMachineScaleSetNetworkInterfaceAsync(String resourceGroupName, String virtualMachineScaleSetName, String virtualmachineIndex, String networkInterfaceName) {
        NetworkInterfacesInner client = this.inner();
        return client.getVirtualMachineScaleSetNetworkInterfaceAsync(resourceGroupName, virtualMachineScaleSetName, virtualmachineIndex, networkInterfaceName)
        .map(new Func1<NetworkInterfaceInner, LoadBalancerNetworkInterface>() {
            @Override
            public LoadBalancerNetworkInterface call(NetworkInterfaceInner inner) {
                return new LoadBalancerNetworkInterfaceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<VirtualMachineScaleSetNetworkInterfaceIPConfiguration> getVirtualMachineScaleSetIpConfigurationAsync(String resourceGroupName, String virtualMachineScaleSetName, String virtualmachineIndex, String networkInterfaceName, String ipConfigurationName) {
        NetworkInterfacesInner client = this.inner();
        return client.getVirtualMachineScaleSetIpConfigurationAsync(resourceGroupName, virtualMachineScaleSetName, virtualmachineIndex, networkInterfaceName, ipConfigurationName)
        .flatMap(new Func1<NetworkInterfaceIPConfigurationInner, Observable<VirtualMachineScaleSetNetworkInterfaceIPConfiguration>>() {
            @Override
            public Observable<VirtualMachineScaleSetNetworkInterfaceIPConfiguration> call(NetworkInterfaceIPConfigurationInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((VirtualMachineScaleSetNetworkInterfaceIPConfiguration)wrapVirtualMachineScaleSetNetworkInterfaceIPConfigurationModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<VirtualMachineScaleSetNetworkInterfaceIPConfiguration> listVirtualMachineScaleSetIpConfigurationsAsync(final String resourceGroupName, final String virtualMachineScaleSetName, final String virtualmachineIndex, final String networkInterfaceName) {
        NetworkInterfacesInner client = this.inner();
        return client.listVirtualMachineScaleSetIpConfigurationsAsync(resourceGroupName, virtualMachineScaleSetName, virtualmachineIndex, networkInterfaceName)
        .flatMapIterable(new Func1<Page<NetworkInterfaceIPConfigurationInner>, Iterable<NetworkInterfaceIPConfigurationInner>>() {
            @Override
            public Iterable<NetworkInterfaceIPConfigurationInner> call(Page<NetworkInterfaceIPConfigurationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NetworkInterfaceIPConfigurationInner, VirtualMachineScaleSetNetworkInterfaceIPConfiguration>() {
            @Override
            public VirtualMachineScaleSetNetworkInterfaceIPConfiguration call(NetworkInterfaceIPConfigurationInner inner) {
                return wrapVirtualMachineScaleSetNetworkInterfaceIPConfigurationModel(inner);
            }
        });
    }

}
