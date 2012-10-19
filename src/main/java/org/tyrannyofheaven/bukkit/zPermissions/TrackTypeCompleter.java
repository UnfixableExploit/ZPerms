/*
 * Copyright 2012 Allan Saddi <allan@saddi.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.tyrannyofheaven.bukkit.zPermissions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.bukkit.util.StringUtil;
import org.tyrannyofheaven.bukkit.util.command.TypeCompleter;

class TrackTypeCompleter implements TypeCompleter {

    private final ZPermissionsPlugin plugin;

    public TrackTypeCompleter(ZPermissionsPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public List<String> complete(Class<?> clazz, String arg, String partial) {
        if (clazz == String.class) {
            List<String> result = new ArrayList<String>();
            StringUtil.copyPartialMatches(partial, plugin.getTracks(), result);
            // NB not sorted, left in definition order
            return result;
        }
        return Collections.emptyList();
    }

}
