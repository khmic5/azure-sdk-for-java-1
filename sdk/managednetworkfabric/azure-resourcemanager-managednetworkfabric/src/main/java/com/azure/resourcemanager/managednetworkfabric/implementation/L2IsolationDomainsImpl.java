// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.fluent.L2IsolationDomainsClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.ArpPropertiesInner;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.L2IsolationDomainInner;
import com.azure.resourcemanager.managednetworkfabric.models.ArpProperties;
import com.azure.resourcemanager.managednetworkfabric.models.EnableDisableOnResources;
import com.azure.resourcemanager.managednetworkfabric.models.L2IsolationDomain;
import com.azure.resourcemanager.managednetworkfabric.models.L2IsolationDomains;
import com.azure.resourcemanager.managednetworkfabric.models.UpdateAdministrativeState;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public final class L2IsolationDomainsImpl implements L2IsolationDomains {
    private static final ClientLogger LOGGER = new ClientLogger(L2IsolationDomainsImpl.class);

    private final L2IsolationDomainsClient innerClient;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    public L2IsolationDomainsImpl(
        L2IsolationDomainsClient innerClient,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<L2IsolationDomain> getByResourceGroupWithResponse(
        String resourceGroupName, String l2IsolationDomainName, Context context) {
        Response<L2IsolationDomainInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, l2IsolationDomainName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new L2IsolationDomainImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public L2IsolationDomain getByResourceGroup(String resourceGroupName, String l2IsolationDomainName) {
        L2IsolationDomainInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, l2IsolationDomainName);
        if (inner != null) {
            return new L2IsolationDomainImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String l2IsolationDomainName) {
        this.serviceClient().delete(resourceGroupName, l2IsolationDomainName);
    }

    public void delete(String resourceGroupName, String l2IsolationDomainName, Context context) {
        this.serviceClient().delete(resourceGroupName, l2IsolationDomainName, context);
    }

    public void updateAdministrativeState(
        String resourceGroupName, String l2IsolationDomainName, UpdateAdministrativeState body) {
        this.serviceClient().updateAdministrativeState(resourceGroupName, l2IsolationDomainName, body);
    }

    public void updateAdministrativeState(
        String resourceGroupName, String l2IsolationDomainName, UpdateAdministrativeState body, Context context) {
        this.serviceClient().updateAdministrativeState(resourceGroupName, l2IsolationDomainName, body, context);
    }

    public void clearArpTable(String resourceGroupName, String l2IsolationDomainName, EnableDisableOnResources body) {
        this.serviceClient().clearArpTable(resourceGroupName, l2IsolationDomainName, body);
    }

    public void clearArpTable(
        String resourceGroupName, String l2IsolationDomainName, EnableDisableOnResources body, Context context) {
        this.serviceClient().clearArpTable(resourceGroupName, l2IsolationDomainName, body, context);
    }

    public void clearNeighborTable(
        String resourceGroupName, String l2IsolationDomainName, EnableDisableOnResources body) {
        this.serviceClient().clearNeighborTable(resourceGroupName, l2IsolationDomainName, body);
    }

    public void clearNeighborTable(
        String resourceGroupName, String l2IsolationDomainName, EnableDisableOnResources body, Context context) {
        this.serviceClient().clearNeighborTable(resourceGroupName, l2IsolationDomainName, body, context);
    }

    public Map<String, ArpProperties> getArpEntries(String resourceGroupName, String l2IsolationDomainName) {
        Map<String, ArpPropertiesInner> inner =
            this.serviceClient().getArpEntries(resourceGroupName, l2IsolationDomainName);
        if (inner != null) {
            return Collections
                .unmodifiableMap(
                    inner
                        .entrySet()
                        .stream()
                        .collect(
                            Collectors
                                .toMap(
                                    Map.Entry::getKey,
                                    inner1 -> new ArpPropertiesImpl(inner1.getValue(), this.manager()))));
        } else {
            return Collections.emptyMap();
        }
    }

    public Map<String, ArpProperties> getArpEntries(
        String resourceGroupName, String l2IsolationDomainName, Context context) {
        Map<String, ArpPropertiesInner> inner =
            this.serviceClient().getArpEntries(resourceGroupName, l2IsolationDomainName, context);
        if (inner != null) {
            return Collections
                .unmodifiableMap(
                    inner
                        .entrySet()
                        .stream()
                        .collect(
                            Collectors
                                .toMap(
                                    Map.Entry::getKey,
                                    inner1 -> new ArpPropertiesImpl(inner1.getValue(), this.manager()))));
        } else {
            return Collections.emptyMap();
        }
    }

    public PagedIterable<L2IsolationDomain> listByResourceGroup(String resourceGroupName) {
        PagedIterable<L2IsolationDomainInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new L2IsolationDomainImpl(inner1, this.manager()));
    }

    public PagedIterable<L2IsolationDomain> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<L2IsolationDomainInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new L2IsolationDomainImpl(inner1, this.manager()));
    }

    public PagedIterable<L2IsolationDomain> list() {
        PagedIterable<L2IsolationDomainInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new L2IsolationDomainImpl(inner1, this.manager()));
    }

    public PagedIterable<L2IsolationDomain> list(Context context) {
        PagedIterable<L2IsolationDomainInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new L2IsolationDomainImpl(inner1, this.manager()));
    }

    public L2IsolationDomain getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String l2IsolationDomainName = Utils.getValueFromIdByName(id, "l2IsolationDomains");
        if (l2IsolationDomainName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'l2IsolationDomains'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, l2IsolationDomainName, Context.NONE).getValue();
    }

    public Response<L2IsolationDomain> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String l2IsolationDomainName = Utils.getValueFromIdByName(id, "l2IsolationDomains");
        if (l2IsolationDomainName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'l2IsolationDomains'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, l2IsolationDomainName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String l2IsolationDomainName = Utils.getValueFromIdByName(id, "l2IsolationDomains");
        if (l2IsolationDomainName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'l2IsolationDomains'.", id)));
        }
        this.delete(resourceGroupName, l2IsolationDomainName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String l2IsolationDomainName = Utils.getValueFromIdByName(id, "l2IsolationDomains");
        if (l2IsolationDomainName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'l2IsolationDomains'.", id)));
        }
        this.delete(resourceGroupName, l2IsolationDomainName, context);
    }

    private L2IsolationDomainsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    public L2IsolationDomainImpl define(String name) {
        return new L2IsolationDomainImpl(name, this.manager());
    }
}
