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