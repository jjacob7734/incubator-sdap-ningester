/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.apache.sdap.ningester.datatiler.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@ConfigurationProperties
@Component("sliceFileByDimensionProperties")
public class SliceFileByDimension {

    private String sliceByDimension;
    private List<String> dimensions;
    private String dimensionNamePrefix = "";

    public String getSliceByDimension() {
        return sliceByDimension;
    }

    public void setSliceByDimension(String sliceByDimension) {
        this.sliceByDimension = sliceByDimension;
    }

    public List<String> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<String> dimensions) {
        this.dimensions = dimensions;
    }

    public String getDimensionNamePrefix() {
        return dimensionNamePrefix;
    }

    public void setDimensionNamePrefix(String dimensionNamePrefix) {
        this.dimensionNamePrefix = dimensionNamePrefix;
    }
}
