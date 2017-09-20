/*
 * (C) Copyright 2017-2019 ElasTest (http://elastest.io/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package io.elastest.eus.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Utility class for serialize JSON messages (remove session).
 *
 * @author Boni Garcia (boni.garcia@urjc.es)
 * @since 0.1.1
 */
public class SessionResponse {

    public String sessionId;
    public int status;
    public Object value;
    public Object os;
    public Object state;
    public Object hCode;

    @JsonProperty("class")
    public Object clazz;

    public String getSessionId() {
        return sessionId;
    }

    public int getStatus() {
        return status;
    }

    public Object getValue() {
        return value;
    }

    public Object getOs() {
        return os;
    }

    public Object getState() {
        return state;
    }

    public Object gethCode() {
        return hCode;
    }

    public Object getClazz() {
        return clazz;
    }

    @Override
    public String toString() {
        return "SessionResponse [getSessionId()=" + getSessionId()
                + ", getStatus()=" + getStatus() + ", getValue()=" + getValue()
                + ", getOs()=" + getOs() + ", getState()=" + getState()
                + ", gethCode()=" + gethCode() + ", getClazz()=" + getClazz()
                + "]";
    }

}