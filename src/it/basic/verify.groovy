/**
 * Recess Maven Plugin
 * Copyright 2010-2011 (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
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

def modules = ["abbrev", "colors", "less", "nopt", "recess", "underscore", "watch"];

modules.each() {
    def f = new File(basedir, "src/main/resources/META-INF/" + it)
    assert f.exists()
    assert f.isDirectory()

    def f2 = new File(f, "package");
    assert !f2.exists();

    def f3 = new File(f, "src/main/resources/META-INF/" + it + "_tmp")
    assert !f3.exists();
}

true