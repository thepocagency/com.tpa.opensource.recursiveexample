/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is a very simple example of a recursive function
 * 
 * This function sums the (x)th and (x+1)th elements of a list, recursively from 0 to n (the size of the list) to sum total values of an input list
 * 
 * If you have a list of {1, 4, 7}, it prints:
 * 
 * 0. {1, 4, 7}
 * 1. {5, 7}
 * 2. {12}
 * 3. return 12
 * 
 * @author Alexandre Veremme @ The POC Agency | alex [at] the-poc-agency.com
 */
public class RecursiveFunction {

    public static void main(String[] args) {
        
        RecursiveFunction letsGo = new RecursiveFunction();

        System.out.println("\n\nThis is the first example:");
        List<Integer> data1 = Arrays.asList(1, 4, 7);
        int firstExample = letsGo.fold(data1);
        
        System.out.println("\n\nThis is the second example:");
        List<Integer> data2 = Arrays.asList(123, -2, 477, 3, 14, 6551);
        int secondExample = letsGo.fold(data2);
        
        System.out.println("\n\nThat's it :)\n\n");
    }

    private int fold(List<Integer> input) {
        
        System.out.println(input); // A temporary println to see how it goes
        
        if (input.size()==1) { // This is the last calculated value, when there is only one element in the list
            return input.get(0);
        }
        else { // This is the "else" step when there are more than 2 elements
            
            // We create a new list named reducedList
            // To save the order, we use an ArrayList object (thanks to it, we'll be able to use the "add" method below)
            // We only keep elements from the 3rd position of the original input
            List<Integer> reducedList = new ArrayList<>(input.subList(2, input.size()));
            
            // Sum of the first and the second element of the original input
            Integer tempValue = input.get(0) + input.get(1);
            
            // Add the calculated element into the first position of the new list
            reducedList.add(0, tempValue);
          
            // We recursively call the method until it only goes to the if part...
            return fold(reducedList);
        }
    }
}
