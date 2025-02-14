// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.ResourceGuardOperation;

public final class ResourceGuardOperationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceGuardOperation model =
            BinaryData
                .fromString("{\"vaultCriticalOperation\":\"lpichk\",\"requestResourceType\":\"mkcdyhbpkkpwdre\"}")
                .toObject(ResourceGuardOperation.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceGuardOperation model = new ResourceGuardOperation();
        model = BinaryData.fromObject(model).toObject(ResourceGuardOperation.class);
    }
}
