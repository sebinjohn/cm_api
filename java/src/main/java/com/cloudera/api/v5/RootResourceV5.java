// Licensed to Cloudera, Inc. under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  Cloudera, Inc. licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.cloudera.api.v5;

import com.cloudera.api.v4.RootResourceV4;

import javax.ws.rs.Path;

/**
 * The root of the Cloudera API (v5). Provides access to all sub-resources
 * available in version 5 of the API.
 */
@Path("")
public interface RootResourceV5 extends RootResourceV4 {
  /**
   * @return The clusters resource handler.
   */
  @Override
  @Path("/clusters")
  public ClustersResourceV5 getClustersResource();
}
