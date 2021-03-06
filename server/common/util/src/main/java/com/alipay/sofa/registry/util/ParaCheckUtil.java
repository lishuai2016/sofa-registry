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
package com.alipay.sofa.registry.util;

import java.util.Collection;

/**
 * @author qian.lqlq
 * @version $Id: ParaCheckUtil.java, v 0.1 2017-12-06 21:20 qian.lqlq Exp $
 */
public class ParaCheckUtil {

    /**
     * check object not null
     * @param param
     * @param paraName
     * @throws RuntimeException
     */
    public static void checkNotNull(Object param, String paraName) throws RuntimeException {
        if (param == null) {
            throw new RuntimeException(String.format("%s is not allowed to be null", paraName));
        }
    }

    /**
     * check string not blank
     * @param param
     * @param paraName
     * @throws RuntimeException
     */
    public static void checkNotBlank(String param, String paraName) throws RuntimeException {
        if (param == null || param.trim().length() == 0) {
            throw new RuntimeException(String.format("%s is not allowed to be blank", paraName));
        }
    }

    /**
     * check param not empty
     * @param param
     * @param paraName
     * @throws RuntimeException
     */
    public static void checkNotEmpty(Collection<?> param, String paraName) throws RuntimeException {
        if (param == null || param.size() == 0) {
            throw new RuntimeException(String.format("%s is not allowed to be empty", paraName));
        }
    }

}