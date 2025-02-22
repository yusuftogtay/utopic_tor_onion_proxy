/*
Copyright (C) 2011-2014 Sublime Software Ltd

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

/*
Copyright (c) Microsoft Open Technologies, Inc.
All Rights Reserved
Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0

THIS CODE IS PROVIDED ON AN *AS IS* BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, EITHER EXPRESS OR IMPLIED,
INCLUDING WITHOUT LIMITATION ANY IMPLIED WARRANTIES OR CONDITIONS OF TITLE, FITNESS FOR A PARTICULAR PURPOSE,
MERCHANTABLITY OR NON-INFRINGEMENT.

See the Apache 2 License for the specific language governing permissions and limitations under the License.
*/

package ru.utopicnarwhal.utopic_tor_onion_proxy.thali_sources.android;

import net.freehaven.tor.control.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.List;

/**
 * Logs the data we get from notifications from the Tor OP. This is really just meant for debugging.
 */
public class AndroidOnionProxyManagerEventHandler implements EventHandler {
    private static final Logger LOG = LoggerFactory.getLogger(AndroidOnionProxyManagerEventHandler.class);

    public void circuitStatus(String status, String id, String path) {
//        LOG.info("circuitStatus: status:" + status + ", id: " + id + ", path: " + path);
    }

    public void streamStatus(String status, String id, String target) {
//        LOG.info("streamStatus: status: " + status + ", id: " + id + ", target: " + target);
    }

    public void orConnStatus(String status, String orName) {
//        LOG.info("OR connection: status: " + status + ", orName: " + orName);
    }

    public void bandwidthUsed(long read, long written) {
//        LOG.info("bandwidthUsed: read: " + read + ", written: " + written);
    }

    public void newDescriptors(List<String> orList) {
//        Iterator<String> iterator = orList.iterator();
//        StringBuilder stringBuilder = new StringBuilder();
//        while(iterator.hasNext()) {
//            stringBuilder.append(iterator.next());
//        }
//        LOG.info("newDescriptors: " + stringBuilder.toString());
    }

    public void message(String severity, String msg) {
//        LOG.info("message: severity: " + severity + ", msg: " + msg);
    }

    public void unrecognized(String type, String msg) {
//        LOG.info("unrecognized: type: " + type + ", msg: " + msg);
    }

    private String shortenPath(List<String> path) {
        StringBuilder s = new StringBuilder();
        for(String id : path) {
            if(s.length() > 0) s.append(',');
            s.append(id.substring(1, 7));
        }
        return s.toString();
    }

}
