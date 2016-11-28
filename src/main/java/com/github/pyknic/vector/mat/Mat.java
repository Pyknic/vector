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
package com.github.pyknic.vector.mat;

/**
 * Universal super-interface for all matrices, regardless of dimension and
 * backing implementation.
 * 
 * @param <M>  the main interface for this kind of matrix
 * 
 * @author Emil Forslund
 * @since  1.1.0
 */
public interface Mat<M extends Mat<? super M>> {
    
    /**
     * Returns a new (mutable) matrix with the specified elements.
     * 
     * @param e0_0  the top-left element
     * @param e0_1  the top-center element
     * @param e0_2  the top-right element
     * @param e1_0  the middle-left element
     * @param e1_1  the middle-center element
     * @param e1_2  the middle-right element
     * @param e2_0  the bottom-left element
     * @param e2_1  the bottom-center element
     * @param e2_2  the bottom-right element
     * @return      the new (mutable) matrix
     */
    static Mat3x3d mat3x3d(double e0_0, double e0_1, double e0_2,
                           double e1_0, double e1_1, double e1_2,
                           double e2_0, double e2_1, double e2_2) {
        
        return Mat3x3d.of(
            e0_0, e0_1, e0_2,
            e1_0, e1_1, e1_2,
            e2_0, e2_1, e2_2
        );
    }
    
    /**
     * Returns a new (immutable) matrix with the specified elements.
     * 
     * @param e0_0  the top-left element
     * @param e0_1  the top-center element
     * @param e0_2  the top-right element
     * @param e1_0  the middle-left element
     * @param e1_1  the middle-center element
     * @param e1_2  the middle-right element
     * @param e2_0  the bottom-left element
     * @param e2_1  the bottom-center element
     * @param e2_2  the bottom-right element
     * @return      the new (immutable) matrix
     */
    static Mat3x3d constMat3x3d(double e0_0, double e0_1, double e0_2,
                                double e1_0, double e1_1, double e1_2,
                                double e2_0, double e2_1, double e2_2) {
        
        return Mat3x3d.constant(
            e0_0, e0_1, e0_2,
            e1_0, e1_1, e1_2,
            e2_0, e2_1, e2_2
        );
    }
    
    /**
     * Returns a new (mutable) matrix with the specified elements.
     * 
     * @param e0_0  the top-left element
     * @param e0_1  the top-center element
     * @param e0_2  the top-right element
     * @param e1_0  the middle-left element
     * @param e1_1  the middle-center element
     * @param e1_2  the middle-right element
     * @param e2_0  the bottom-left element
     * @param e2_1  the bottom-center element
     * @param e2_2  the bottom-right element
     * @return      the new (mutable) matrix
     */
    static Mat3x3f mat3x3f(float e0_0, float e0_1, float e0_2,
                           float e1_0, float e1_1, float e1_2,
                           float e2_0, float e2_1, float e2_2) {
        
        return Mat3x3f.of(
            e0_0, e0_1, e0_2,
            e1_0, e1_1, e1_2,
            e2_0, e2_1, e2_2
        );
    }
    
    /**
     * Returns a new (immutable) matrix with the specified elements.
     * 
     * @param e0_0  the top-left element
     * @param e0_1  the top-center element
     * @param e0_2  the top-right element
     * @param e1_0  the middle-left element
     * @param e1_1  the middle-center element
     * @param e1_2  the middle-right element
     * @param e2_0  the bottom-left element
     * @param e2_1  the bottom-center element
     * @param e2_2  the bottom-right element
     * @return      the new (immutable) matrix
     */
    static Mat3x3f constMat3x3f(float e0_0, float e0_1, float e0_2,
                                float e1_0, float e1_1, float e1_2,
                                float e2_0, float e2_1, float e2_2) {
        
        return Mat3x3f.constant(
            e0_0, e0_1, e0_2,
            e1_0, e1_1, e1_2,
            e2_0, e2_1, e2_2
        );
    }
    
    /**
     * Returns a new (mutable) matrix with the specified elements.
     * 
     * @param e0_0  the top-left element
     * @param e0_1  the top-center element
     * @param e0_2  the top-right element
     * @param e1_0  the middle-left element
     * @param e1_1  the middle-center element
     * @param e1_2  the middle-right element
     * @param e2_0  the bottom-left element
     * @param e2_1  the bottom-center element
     * @param e2_2  the bottom-right element
     * @return      the new (mutable) matrix
     */
    static Mat3x3i mat3x3i(int e0_0, int e0_1, int e0_2,
                           int e1_0, int e1_1, int e1_2,
                           int e2_0, int e2_1, int e2_2) {
        
        return Mat3x3i.of(
            e0_0, e0_1, e0_2,
            e1_0, e1_1, e1_2,
            e2_0, e2_1, e2_2
        );
    }
    
    /**
     * Returns a new (immutable) matrix with the specified elements.
     * 
     * @param e0_0  the top-left element
     * @param e0_1  the top-center element
     * @param e0_2  the top-right element
     * @param e1_0  the middle-left element
     * @param e1_1  the middle-center element
     * @param e1_2  the middle-right element
     * @param e2_0  the bottom-left element
     * @param e2_1  the bottom-center element
     * @param e2_2  the bottom-right element
     * @return      the new (immutable) matrix
     */
    static Mat3x3i constMat3x3i(int e0_0, int e0_1, int e0_2,
                                int e1_0, int e1_1, int e1_2,
                                int e2_0, int e2_1, int e2_2) {
        
        return Mat3x3i.constant(
            e0_0, e0_1, e0_2,
            e1_0, e1_1, e1_2,
            e2_0, e2_1, e2_2
        );
    }

    /**
     * Returns a matrix that is an exact copy of the specified matrix. Depending
     * on the implementation of this interface, that might be either this
     * instance (if this is mutable) or a completely new matrix. The given
     * matrix will not be modified.
     * 
     * @param matrix  the matrix to copy
     * @return        the copy, either this instance or a new matrix
     */
    M set(M matrix);
    
    /**
     * Performs an element-wise addition between every element in this matrix
     * and every element in the specified matrix. The sum matrix returned might 
     * be either this instance (if this is mutable) or a completely new matrix.
     * The given matrix will not be modified.
     * 
     * @param matrix  the matrix to add with
     * @return        the sum, either this instance or a new matrix
     */
    M plus(M matrix);
    
    /**
     * Performs an element-wise subtraction of every element in the specified 
     * matrix from every element in this matrix. The difference matrix returned 
     * might be either this instance (if this is mutable) or a completely new 
     * matrix. The given matrix will not be modified.
     * 
     * @param matrix  the matrix to add with
     * @return        the difference, either this instance or a new matrix
     */
    M minus(M matrix);
    
    /**
     * Performs an element-wise multiplication of every element in the specified 
     * matrix to every element in this matrix. The product matrix returned 
     * might be either this instance (if this is mutable) or a completely new 
     * matrix. The given matrix will not be modified.
     * 
     * @param matrix  the matrix to multiply with
     * @return        the product, either this instance or a new matrix
     */
    M multiply(M matrix);
    
}