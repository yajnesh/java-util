# java-util

Most used short code snippets generically designed. 
The goal is to avoid `NullPointerException` and `IndexOutOfBoundException` , still providing meaningful outputs.
All the methods in this library accepts `Nullable`s and gracefully performs alternate actions defined.

This is overall top level usage doc, detailed docs are present as javadoc within code files


Gradle:
```groovy
compile 'in.yajnesh.util:java-util:1.0.0'
```


# General Utilities

<br/>


## 1)  Safely get item from any Sequence

Friendly APIs to get item from any Sequence.
It is bettet to get null instead of crashing with `NullPointerException` or `IndexOutOfBoundException`

<br/>

#### **a)** ``` JUtil.get(sequence, 5);```
> This will try to get 6th item from sequence.

**Sequence** can be any of the following
- Array
- List
- String
- CharSequence



**Return value** will be 

- In case sequence is null, null will be returned instead of crashing
- In case of index is above the size of negative index, null will be returned instead of crashing

<br/>

#### **b)**  ``` JUtil.get(array/collection, 5, defaultValue);```

This is similar to the above api, but instead of null values, this will return defaultvalue provided

<br/> <br/>
## 2)  Check if an something is empty

Friendly APIs to identify if elements/sequence is empty.


####  ``` JUtil.isEmpty(something);```
> This will return true if something is empty or null

parameter **something** can be any of the following
- Array
- Collection
- CharSequence
- Map
- String

**Return value** will be 

- In case parameter is null, true will be returned instead of crashing
- In case parameter is empty(decided by underlaying datastructure) , return true
- Return false, in all other cases

<br/>

## 3)  Get the size of something

Friendly APIs to get the size of element/sequence.


####  ``` JUtil.size(something);```
> This will return the size of something 

parameter **something** can be any of the following
- Array
- Collection
- String
- CharSequence

**Return value** will be 

- In case parameter is null, 0 will be returned
- if not null, then based on the underlaying datastructure, size will be returned

<br/>


## 4)  Safely get last item from any Sequence

Friendly APIs to get item from any Sequence.
It is bettet to get null instead of crashing with `NullPointerException` or `IndexOutOfBoundException`

<br/>

#### **a)** ``` JUtil.getLastItem(sequence);```
> This will try to get last item from sequence.

**Sequence** can be any of the following
- Array
- List
- String
- CharSequence


**Return value** will be 

- In case sequence is null, null will be returned instead of crashing
- In case of index is above the size of negative index, null will be returned instead of crashing

<br/>

#### **b)**  ``` JUtil.getLastItem(sequence, defaultValue);```

This is similar to the above api, but instead of null values, this will return defaultvalue provided

<br/> <br/>



## 5)  Equals

Compare two obects for equality

#### **a)**  ``` JUtil.equals(a,b);```
> This will return true if both objects are equal

parameter **something** can be any of the following
- Any Object

**Return value** will be 

- In case of **either** parameter is null, false will be returned
- In case of **both** parameters are null, false will be returned
- If objects are equal , true will be returned, false otherwise

<br/>

#### **b)**  ``` JUtil.equalsRelaxed(a,b);```

This is similar to the above api, but ignores the cases while comparing

<br/> <br/>


## 6) Contains

Does source has searchTerm in it?

#### **a)**  ``` JUtil.contains(source,searchTerm);```
> true if searchTerm is found in source, otherwise false. Also false if either or both params are null

<br/>

#### **b)**  ``` JUtil.containsIgnoreCase(source,searchTerm);```

This is similar to the above api, but ignores the cases while checking

<br/> <br/>


## 7) TypeCast

TypeCast and object to passed class

####  ``` JUtil.typeCast(object,Integer.class);```
>In this case, safely typecasts object to Integer and returns an Integer

<br/>


## 8) Stringify

Get string out of Collection

#### **a)**  ``` JUtil.stringify(collection/map);```
> returns string representation of collection/map

<br/>

#### **b)**  ``` JUtil.stringify(preText,collection/map);```

This is similar to the above api, adds preText infront of the string representaion

<br/> <br/>

## 9) Is Any Empty

 Is any object passed is null or empty.<br>

####  ``` JUtil.isAnyEmpty(string1,string2,string3,string4);```
####  ``` JUtil.isAnyEmpty(collection,map,string,charSequence,object);```
>returns true, if any of the object passed is null or empty, false otherwise

<br/>

## 10) Are All Empty

 Are all the object passed is null or empty.<br>

####  ``` JUtil.isAllEmpty(string1,string2,string3,string4);```
####  ``` JUtil.isAllEmpty(collection,map,string,charSequence,object);```
>returns true, if all of the object passed is null or empty, false otherwise

<br/>

## 11)  Get String

Get string from given object

####   **a)** ``` JUtil.getString(something);```
> This will return string representaion of the parameter

parameter **something** can be any of the following
- Any Object
- EditText
- TextView

**Return value** will be 

- String contained under the object, or null

####   **b)** ``` JUtil.getStringSafe(something);```
> This is same as above, but returns empty string in case input in null

<br/>



## 12) Safe url encode

 Translates a string into x-www-form-urlencoded.<br>

####  ``` JUtil.safeUrlEncode(string,encoding);```

>returns the encoded url

<br/>


# Many other classes documentation coming soon

