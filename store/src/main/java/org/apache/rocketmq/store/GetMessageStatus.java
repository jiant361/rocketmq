/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.store;

/**
 * 读取消息状态
 */
public enum GetMessageStatus {

    FOUND, //查找成功

    NO_MATCHED_MESSAGE, //无匹配消息

    MESSAGE_WAS_REMOVING, //消息已被删除

    OFFSET_FOUND_NULL, //未找到消息

    OFFSET_OVERFLOW_BADLY, //offset 超出很多>1

    OFFSET_OVERFLOW_ONE, //offset 超出一个

    OFFSET_TOO_SMALL,

    NO_MATCHED_LOGIC_QUEUE, //无有效匹配的队列

    NO_MESSAGE_IN_QUEUE, // 队列中无消息
}
