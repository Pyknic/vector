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

import com.github.pyknic.vector.vec.Vec4d;

/**
 *
 * @author Emil Forslund
 * @since  1.0.0
 */
public final class Vec4dConst extends AbstractVec4d {
    
    private final double x, y, z, w;
    
    public Vec4dConst(double x, double y, double z, double w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }
    
    public Vec4dConst(Vec4d prototype) {
        this.x = prototype.getX();
        this.y = prototype.getY();
        this.z = prototype.getZ();
        this.w = prototype.getW();
    }

    @Override
    public double getX() {
        return x;
    }
    
    @Override
    public double getY() {
        return y;
    }
    
    @Override
    public double getZ() {
        return z;
    }
    
    @Override
    public double getW() {
        return w;
    }

    @Override
    public Vec4d set(double x, double y, double z, double w) {
        return new Vec4dConst(x, y, z, w);
    }
}