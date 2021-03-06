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

import com.github.pyknic.vector.vec.Vec3f;

/**
 *
 * @author Emil Forslund
 * @since  1.0.0
 */
public final class Vec3fConst extends AbstractVec3f {
    
    private final float x, y, z;
    
    public Vec3fConst(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public Vec3fConst(Vec3f prototype) {
        this.x = prototype.getX();
        this.y = prototype.getY();
        this.z = prototype.getZ();
    }

    @Override
    public float getX() {
        return x;
    }
    
    @Override
    public float getY() {
        return y;
    }
    
    @Override
    public float getZ() {
        return z;
    }

    @Override
    public Vec3f set(float x, float y, float z) {
        return new Vec3fConst(x, y, z);
    }
}