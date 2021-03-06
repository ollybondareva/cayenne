/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/
package org.apache.cayenne.project;

import org.apache.cayenne.configuration.BaseConfigurationNodeVisitor;
import org.apache.cayenne.configuration.DataChannelDescriptor;
import org.apache.cayenne.dbimport.ReverseEngineering;
import org.apache.cayenne.map.DataMap;
import org.apache.cayenne.resource.Resource;

/**
 * A ConfigurationNode visitor that extracts "configurationSource" from the nodes.
 * 
 * @since 3.1
 */
class ConfigurationSourceGetter extends BaseConfigurationNodeVisitor<Resource> {

    @Override
    public Resource visitDataChannelDescriptor(DataChannelDescriptor descriptor) {
        return descriptor.getConfigurationSource();
    }

    @Override
    public Resource visitDataMap(DataMap dataMap) {
        return dataMap.getConfigurationSource();
    }

    @Override
    public Resource visitReverseEngineering(ReverseEngineering reverseEngineering) {
        return reverseEngineering.getConfigurationSource();
    }
}
