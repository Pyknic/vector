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
package com.github.pyknic.vector.internal;

import com.github.pyknic.vector.Vec2d;

/**
 *
 * @author Emil Forslund
 * @since  1.0.0
 */
public final class Vec2dConst extends AbstractVec2d {
    
    private final double x, y;
    
    public Vec2dConst(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Vec2dConst(Vec2d prototype) {
        this.x = prototype.getX();
        this.y = prototype.getY();
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
    public Vec2d set(double x, double y) {
        return new Vec2dConst(x, y);
    }
}