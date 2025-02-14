// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AdditionalData;

public final class AdditionalDataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AdditionalData model =
            BinaryData.fromString("{\"assessedResourceType\":\"AdditionalData\"}").toObject(AdditionalData.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AdditionalData model = new AdditionalData();
        model = BinaryData.fromObject(model).toObject(AdditionalData.class);
    }
}
