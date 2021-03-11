/*
 * Copyright 2019 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webank.wedatasphere.linkis.manager.am.service.engine

import com.webank.wedatasphere.linkis.manager.am.manager.EngineNodeManager
import com.webank.wedatasphere.linkis.manager.am.service.{EMEngineService, EngineService}
import org.springframework.beans.factory.annotation.Autowired

/**
  * @date 2020/7/1 17:01
  */
abstract class AbstractEngineService extends EngineService {

  @Autowired
  private var emService: EMEngineService = _

  @Autowired
  private var engineNodeManager:EngineNodeManager = _

  override def getEMService(): EMEngineService = {
    this.emService
  }

  override def getEngineNodeManager: EngineNodeManager = {
    this.engineNodeManager
  }
}