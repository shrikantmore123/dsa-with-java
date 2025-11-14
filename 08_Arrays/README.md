# 08_Arrays

### 🔹 File: `arrayDemo.java`

**Description:** A Java program demonstrating basic array operations such as declaration, initialization, user input, element access, modification, and calculating the average percentage.

Output :

```bash
>> Enter Physics Marks: 92
>> Enter Chemistry Marks: 94
>> Enter Maths Marks: 95
   Physics: 92
   Chemistry: 94
   Maths: 95
   Updated Marks Maths: 96
   Percentge: 94%
```
---

### 🔹 File: `arrayAsFunctionArgument.java`

**Description:** A Java program showing how arrays are passed as function arguments and how changes inside the function affect the original array.

Output :

```bash
>> 98 99 100
```
---

### 🔹 File: `linearSeach.java`

**Description:** A Java program that performs linear search on an array to find the index of a given key.

Output :

```bash
>> Key found at index 4
```
---

### 🔹 File: `largestNumber.java`

**Description:** A Java program that finds and returns the largest number in an array while also printing the smallest element.

Output :

```bash
>> Smallest value is 2
   Largest num is 16
```
---

### 🔹 File: `binarySearch.java`

**Description:** A Java program that performs binary search on a sorted array to efficiently find the index of a given key.

Output :

```bash
>> Key found at index 4
```
---

### 🔹 File: `reverseArray.java`

**Description:** A Java program that reverses an array in-place by swapping elements from both ends.

Output :

```bash
>> After Reversing : 
   2 4 6 8 10 12 14 16 
   
   After Reversing : 
   16 14 12 10 8 6 4 2 
```
---

### 🔹 File: `pairsInArray.java`

**Description:** A Java program that prints all possible unique pairs from an array and counts the total number of pairs.

Output :

```bash
>> (2,4)(2,6)(2,8)(2,10)(2,12)(2,14)(2,16)
   (4,6)(4,8)(4,10)(4,12)(4,14)(4,16)
   (6,8)(6,10)(6,12)(6,14)(6,16)
   (8,10)(8,12)(8,14)(8,16)
   (10,12)(10,14)(10,16)
   (12,14)(12,16)
   (14,16)

   Total Pairs: 28
```
---

### 🔹 File: `printSubarrays.java`

**Description:** A Java program that generates and prints all possible subarrays of an array while counting the total subarrays.

Output :

```bash
>> 2 
   2 4 
   2 4 6 
   2 4 6 8 
   2 4 6 8 10 
   2 4 6 8 10 12 
   2 4 6 8 10 12 14 
   2 4 6 8 10 12 14 16 

   4 
   4 6
   4 6 8
   4 6 8 10
   4 6 8 10 12
   4 6 8 10 12 14
   4 6 8 10 12 14 16

   6
   6 8
   6 8 10
   6 8 10 12
   6 8 10 12 14
   6 8 10 12 14 16

   8
   8 10
   8 10 12
   8 10 12 14
   8 10 12 14 16

   10
   10 12
   10 12 14
   10 12 14 16

   12
   12 14
   12 14 16

   14
   14 16

   16
   
   Total Subarrays: 36
```
---

### 🔹 File: `maxSubarraySum1.java`

**Description:** A Java program that finds the maximum subarray sum using the brute-force approach by checking all subarrays (O(n³)).

Output :

```bash
>> 2 6 12 20 30 42 56 72 
   4 10 18 28 40 54 70 
   6 14 24 36 50 66 
   8 18 30 44 60 
   10 22 36 52 
   12 26 42 
   14 30 
   16 
   Maximum Sum of Subarray: 72
```
---

### 🔹 File: `maxSubarraySum2.java`

**Description:** A Java program that computes the maximum subarray sum using a prefix-sum array to optimize subarray sum calculations (O(n²)).

Output :

```bash
>> Maximum Sum of Subarray: 72
```
---

### 🔹 File: `maxSubarraySum3.java`

**Description:** A Java program that applies Kadane’s Algorithm to efficiently find the maximum subarray sum in linear time (O(n)).

Output :

```bash
>> Maximum Sum of Subarray: 7
```