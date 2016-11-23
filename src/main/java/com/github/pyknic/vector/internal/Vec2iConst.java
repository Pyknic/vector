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

import com.github.pyknic.vector.Vec2i;

/**
 *
 * @author Emil Forslund
 * @since  1.0.0
 */
public final class Vec2iConst extends AbstractVec2i {
    
    private final int x, y;
    
    public Vec2iConst(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Vec2iConst(Vec2i prototype) {
        this.x = prototype.getX();
        this.y = prototype.getY();
    }

    @Override
    public int getX() {
        return x;
    }
    
    @Override
    public int getY() {
        return y;
    }

    @Override
    public Vec2i set(int x, int y) {
        return new Vec2iConst(x, y);
    }
}