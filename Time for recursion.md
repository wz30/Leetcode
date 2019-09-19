## Time complexity for recursion
### Question
```java
int recursiveFun1(int n)
{
    if (n <= 0)
        return 1;
    else
        return 1 + recursiveFun1(n-1);
}

int recursiveFun2(int n)
{
    if (n <= 0)
        return 1;
    else
        return 1 + recursiveFun2(n-5);
}

int recursiveFun3(int n)
{
    if (n <= 0)
        return 1;
    else
        return 1 + recursiveFun3(n/5);
}

void recursiveFun4(int n, int m, int o)
{
    if (n <= 0)
    {
        printf("%d, %d\n",m, o);
    }
    else
    {
        recursiveFun4(n-1, m+1, o);
        recursiveFun4(n-1, m, o+1);
    }
}

int recursiveFun5(int n)
{
    for (i = 0; i < n; i += 2) {
        // do something
    }

    if (n <= 0)
        return 1;
    else
        return 1 + recursiveFun5(n-5);
}
```

### Solution 1
```java
One of the best ways I find for approximating the complexity of the recursive algorithm is drawing the recursion tree. Once you have the recursive tree:

Complexity = length of tree from root node to leaf node * number of leaf nodes
- The first function will have length of n and number of leaf node 1 so complexity will be n*1 = n
- The second function will have the length of n/5 and number of leaf nodes again 1 so complexity will be n/5 * 1 = n/5. It should be approximated to n

- For the third function, since n is being divided by 5 on every recursive call, length of recursive tree will be log(n)(base 5), and number of leaf nodes again 1 so complexity will be log(n)(base 5) * 1 = log(n)(base 5)

- For the fourth function since every node will have two child nodes, the number of leaf nodes will be equal to (2^n) and length of the recursive tree will be n so complexity will be (2^n) * n. But since n is insignificant in front of (2^n), it can be ignored and complexity can be only said to be (2^n).

- For the fifth function, there are two elements introducing the complexity. Complexity introduced by recursive nature of function and complexity introduced by for loop in each function. Doing the above calculation, the complexity introduced by recursive nature of function will be ~ n and complexity due to for loop n. Total complexity will be n*n.

Note: This is a quick and dirty way of calculating complexity(nothing official!). Would love to hear feedback on this. Thanks.
```


### Solution 2
```java
you should be making use of master theorem.
```

### Reference
- [stackoverflow](https://stackoverflow.com/questions/13467674/determining-complexity-for-recursive-functions-big-o-notation)
