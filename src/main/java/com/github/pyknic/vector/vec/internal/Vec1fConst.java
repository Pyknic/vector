/**
 *
 * Copyright (c) 2016-2016, Emil Forslund. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.github.pyknic.vector.vec.internal;

import com.github.pyknic.vector.vec.Vec1f;

/**
 *
 * @author Emil Forslund
 * @since  1.0.0
 */
public final class Vec1fConst extends AbstractVec1f {
    
    private final float x;
    
    public Vec1fConst(float x) {
        this.x = x;
    }
    
    public Vec1fConst(Vec1f prototype) {
        this.x = prototype.getX();
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public Vec1f set(float x) {
        return new Vec1fConst(x);
    }
}