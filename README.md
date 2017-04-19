# Example of a recursive function

This function sums the (x)th and (x+1)th elements of a list, recursively from 0 to n (the size of the list) to get the total value of an input list

So if you have a list of {1, 4, 7}, it prints:

0. {1, 4, 7}
1. {5, 7}
2. {12}
3. return 12

## How to use it

Go to the directory where the RecursiveFunction.java file is located.

1. Compile the file with: "javac RecursiveFunction.java"

NB: This will create a file RecursiveFunction.class

2. Execute it with: "java RecursiveFunction"

NB: this will print in the console :

```
This is the first example:
[1, 4, 7]
[5, 7]
[12]
12


This is the second example:
[123, -2, 477, 3, 14, 6551]
[121, 477, 3, 14, 6551]
[598, 3, 14, 6551]
[601, 14, 6551]
[615, 6551]
[7166]
7166


That's it :)
```

## Credits

We'd like to thank you [Picnic](https://www.picnic.nl/) for this nice assignment :)

Developped by Alexandre Veremme @ [The POC Agency](https://www.the-poc-agency.com)

## Licence

Licensed under the Apache License, Version 2.0 (the "License")

You may not use this file except in compliance with the License

You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied

See the License for the specific language governing permissions and limitations under the License