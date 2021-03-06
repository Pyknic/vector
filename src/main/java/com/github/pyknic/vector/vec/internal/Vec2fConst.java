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

import com.github.pyknic.vector.vec.Vec2f;

/**
 *
 * @author Emil Forslund
 * @since  1.0.0
 */
public final class Vec2fConst extends AbstractVec2f {
    
    private final float x, y;
    
    public Vec2fConst(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public Vec2fConst(Vec2f prototype) {
        this.x = prototype.getX();
        this.y = prototype.getY();
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
    public Vec2f set(float x, float y) {
        return new Vec2fConst(x, y);
    }
}